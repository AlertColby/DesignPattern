package com.chen.demoa;

import java.util.Collection;
import java.util.Map;

import com.chen.demoa.model.ExportDataModel;
import com.chen.demoa.model.ExportFooterModel;
import com.chen.demoa.model.ExportHeaderModel;

/**
 * �������ݵ��ı��ļ�����
 * @author cqs
 *
 */
public class ExportToTxt {
	
	/**
	 * �������ݵ��ı��ļ�
	 * @param headerModel �ı�ͷ
	 * @param mapExportData �ı�����
	 * @param footerModel �ı�β
	 */
	public void export(ExportHeaderModel headerModel , Map<String,Collection<ExportDataModel>> mapExportData , ExportFooterModel footerModel) {
		StringBuffer buffer = new StringBuffer();
		
		buffer.append(headerModel.getDepId() + "," + headerModel.getExportDate() + "\n");
		for (String talName : mapExportData.keySet()) {
			buffer.append( talName + "\n");
			for(ExportDataModel data : mapExportData.get(talName)) {
				buffer.append( data.getProductId() + "," + data.getPrice() + "," + data.getMount() + "\n");
			}
		}
		buffer.append( footerModel.getExportUser() + "\n");
		
		System.out.println( "������ı��ļ������ݣ�\n" + buffer.toString() );
	}
	
}
