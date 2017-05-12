package cn.gov.zcy.platform.dao.common.id;

import cn.gov.zcy.platform.dao.base.id.IDbidGenerator;

public class IDGen {
	
	private static IDbidGenerator iDbidGenerator=new MemoryDbidGenerator();
	
	public static Long getDefaultNextId(){
		
		return Long.valueOf(iDbidGenerator.getNextId().toString());
	}

}
