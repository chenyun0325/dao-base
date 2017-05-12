package cn.gov.zcy.platform.dao.base.exception;

/**
 * 
 * @author: chenyun 
 * @since: 2015年4月29日 下午2:14:38 
 * @history:
 */
public class DAOComponentException extends RuntimeException {
	private static final long serialVersionUID = -2040405745819324671L;

	public DAOComponentException(Throwable root) {
		super(root);
	}

	public DAOComponentException(String string, Throwable root) {
		super(string, root);
	}

	public DAOComponentException(String s) {
		super(s);
	}

}
