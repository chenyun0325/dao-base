package cn.gov.zcy.platform.dao.base.func;

import java.util.List;
/**
 * 分页查询接口
 * @author: chenyun 
 * @since: 2015年4月29日 上午10:24:11 
 * @history:
 */
public interface IQueryDAO<T,P> {
	
	/**
	 * 分页查询
	 * @param paras 查询参数. <br/>该参数要么本身实现分页参数接口（IPageParameter）,要么含有IPageParameter的属性,
	 * 	</br>或者系统中定义该实体的分页转换器。
	 * @return
	 */
	List<T> queryWithPage(P paras);

}
