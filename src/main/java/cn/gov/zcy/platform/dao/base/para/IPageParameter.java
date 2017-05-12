package cn.gov.zcy.platform.dao.base.para;

/**
 * 分页查询参数定义
 * @author: chenyun 
 * @since: 2015年4月29日 上午11:32:36 
 * @history:
 */
public interface IPageParameter {
	/**
	 * 起始行<br/>从0开始,第n页则返回:(n-1) * limit
	 * @return
	 */
	int getStart();
	/**
	 * 最多结果行数
	 * @return
	 */
	int getLimit();
	/**
	 * 要求总记录数<br>
	 * 如果true,则查询总记录数并调用setTotal方法进行设置。
	 * @return true:查询总的记录数; false:不查询总记录数
	 */
	boolean isRequireTotal();	
	/**
	 * 设置总记录数
	 * @param total
	 */
	void setTotal(int total);

}
