package com.chen.demob;

import java.util.Collection;
import java.util.Map;

import com.chen.demoa.model.ExportDataModel;
import com.chen.demoa.model.ExportFooterModel;
import com.chen.demoa.model.ExportHeaderModel;

/**
 * �������ӿڣ��������һ���ļ���������Ҫ�ĸ��������Ĳ���
 * @author cqs
 *
 */
public interface Builder {
	
	public void buildHeader( ExportHeaderModel header);

	public void buildBody( Map<String, Collection<ExportDataModel>> mapData);
	
	public void buildFooter(ExportFooterModel footer);
	
}
