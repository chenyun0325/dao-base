package cn.gov.zcy.platform.dao.base.id;

import java.io.Serializable;
/**
 * 主键生成器
 * @author: chenyun 
 * @since: 2015年4月29日 上午10:28:41 
 * @history:
 */
public interface IDbidGenerator {
	
   Serializable getNextId();
}
