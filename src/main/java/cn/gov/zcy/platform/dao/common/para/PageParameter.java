package cn.gov.zcy.platform.dao.common.para;

import java.io.Serializable;

import cn.gov.zcy.platform.dao.base.para.IPageParameter;

/**
 * 分页参数
 * @author: chenyun 
 * @since: 2015年4月29日 上午11:36:21 
 * @history:
 */
public class PageParameter implements IPageParameter, Serializable {

	
	private static final long serialVersionUID = 1L;
	
	public static final int page_limit_default=20;
	
	private int start;
	private int limit=page_limit_default;
	private boolean requireTotal=true;
	private int total;
	public int getStart() {
		return start;
	}

	public int getLimit() {
		return limit;
	}

	public int getTotal() {
		return total;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public void setRequireTotal(boolean requireTotal) {
		this.requireTotal = requireTotal;
	}

	public boolean isRequireTotal() {
		return requireTotal;
	}

	public void setTotal(int total) {
		this.total=total;
	}

}
