package cn.gov.zcy.platform.dao.common.id;

import cn.gov.zcy.platform.dao.base.exception.DAOComponentException;
import cn.gov.zcy.platform.dao.base.id.IDbidGenerator;
/**
 * 基于内存的ID生成器, 每分钟累计加
 * 每分钟支持209万条ID不重复，通过ServerId支持多服务器，最多支持16台服务器，最大支持年限2999
 * 
 * @author tongsh
 * 
 */
public class MemoryDbidGenerator implements IDbidGenerator {
	private long nextId = 0L;
	private long serverId = 1L; //服务器ID
	private long preCalculateTime = 0 ;
	public synchronized Long getNextId() {
		if(System.currentTimeMillis() - preCalculateTime > 60000) {//如果过了1分钟，重新计算
			preCalculateTime=System.currentTimeMillis()/60000; //去掉秒和毫秒
			nextId = (preCalculateTime<<4+serverId)<<20; //格式年月日时分秒+服务器ID(两位)+5位序列号. 这样算不行，超过javascript long 最大值了
			preCalculateTime*=60000;
		}
		return ++nextId;
	}
	
	
	/**
	 * 设置服务器ID,最多16台服务器（值为1-16）
	 * @param serverId the serverId to set
	 */
	public void setServerId(long serverId) {
		if (serverId<1 || serverId>16){
			throw new DAOComponentException("The serverId of MemoryDbidGenerator must more 0 and less 16,  but it is "+serverId);
		}
		this.serverId = serverId;
	}
	

}
