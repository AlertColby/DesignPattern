package com.chen.demob;

import java.util.Collection;
import java.util.Map;

import com.chen.demoa.model.ExportDataModel;
import com.chen.demoa.model.ExportFooterModel;
import com.chen.demoa.model.ExportHeaderModel;

/**
 * 生成器接口，定义输出一个文件对象所需要的各个部件的操作
 * @author cqs
 *
 */
public interface Builder {
	
	public void buildHeader( ExportHeaderModel header);

	public void buildBody( Map<String, Collection<ExportDataModel>> mapData);
	
	public void buildFooter(ExportFooterModel footer);
	
}
