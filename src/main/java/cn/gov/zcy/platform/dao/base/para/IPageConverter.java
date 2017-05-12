package cn.gov.zcy.platform.dao.base.para;
/**
 * 分页转换器<T---包含转化为分页参数对象的所有数据>
 * @author: chenyun 
 * @since: 2015年4月29日 上午11:49:27 
 * @history:
 */
public interface IPageConverter<T> {
	/**
	 * 转换成分页参数对象
	 * 
	 * @param qryDto
	 * @return
	 */
	public IPageParameter toPage(T qrydto);
	
	/**
	 * 返回总行数
	 * 
	 * @param qryDto
	 * @param total
	 */
	public void returnTotal(T qrydto,int total);

}
