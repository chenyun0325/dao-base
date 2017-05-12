package cn.gov.zcy.platform.dao.base.func;

import java.io.Serializable;
/**
 * 增删改查
 * @author: chenyun 
 * @since: 2015年4月29日 上午10:21:06 
 * @history:
 */
public interface ICrudDAO<T> {

	T getById(Serializable id);
	
	void save(T entity);
	
	Integer update(T entity);
	
	Integer deleteById(Serializable id);

}
