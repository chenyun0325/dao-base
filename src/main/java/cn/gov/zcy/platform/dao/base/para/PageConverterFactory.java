package cn.gov.zcy.platform.dao.base.para;

import java.lang.reflect.ParameterizedType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PageConverterFactory {
	private List<String> converters;
	private Map<String, Class<IPageConverter>> convertmap = new HashMap<String, Class<IPageConverter>>();

	public void setConverters(List<String> converters) {
		this.converters = converters;
		try {
			for (String converter : converters) {
				Class clazz = Class.forName(converter);
				Class tclz = (Class) ((ParameterizedType) clazz
						.getGenericInterfaces()[0]).getActualTypeArguments()[0];
				convertmap.put(tclz.getName(), clazz);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();

		}
	}

	public IPageConverter createPageConverter(Object dto) throws Exception {
		for (Class<?> superClass = dto.getClass(); superClass != Object.class; superClass = superClass
				.getSuperclass()) {
			Class<IPageConverter> clz = convertmap.get(superClass.getName());
			if (clz != null) {
				IPageConverter pc = (IPageConverter) clz.newInstance();
				return pc;
			}
		}
		return null;
	}

}
