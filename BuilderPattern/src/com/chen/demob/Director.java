package com.chen.demob;

import java.util.Collection;
import java.util.Map;

import com.chen.demoa.model.ExportDataModel;
import com.chen.demoa.model.ExportFooterModel;
import com.chen.demoa.model.ExportHeaderModel;

public class Director {

	private Builder builder;
	
	public Director( Builder builder ) {
		this.builder = builder;
	}
	
	/**
	 * ָ���������������յ�������ļ��Ķ���
	 * @param header
	 * @param mapData
	 * @param footer
	 */
	public void construct(ExportHeaderModel header , Map<String, Collection<ExportDataModel>> mapData , ExportFooterModel footer) {
		builder.buildHeader(header);
		
		builder.buildBody(mapData);
		
		builder.buildFooter(footer);
	}
}
