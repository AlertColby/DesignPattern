package com.chen.demoa;

import java.util.Collection;
import java.util.Map;

import com.chen.demoa.model.ExportDataModel;
import com.chen.demoa.model.ExportFooterModel;
import com.chen.demoa.model.ExportHeaderModel;

/**
 * 导出数据到文本文件对象
 * @author cqs
 *
 */
public class ExportToTxt {
	
	/**
	 * 导出数据到文本文件
	 * @param headerModel 文本头
	 * @param mapExportData 文本内容
	 * @param footerModel 文本尾
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
		
		System.out.println( "输出到文本文件的内容：\n" + buffer.toString() );
	}
	
}
