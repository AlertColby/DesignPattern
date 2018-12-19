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
public class ExportToXML {
	
	/**
	 * 导出数据到XML文件
	 * @param headerModel 文本头
	 * @param mapExportData 文本内容
	 * @param footerModel 文本尾
	 */
	public void export(ExportHeaderModel headerModel , Map<String,Collection<ExportDataModel>> mapExportData , ExportFooterModel footerModel) {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<?xml version='1.0' encoding='gb2312' ?>\n");
		buffer.append("<Report>\n");
		buffer.append("  <Header>\n");
		buffer.append("    <DepId>" + headerModel.getDepId() + "</DepId>\n");
		buffer.append("    <ExportDate>" + headerModel.getExportDate() + "</ExportDate>\n");
		buffer.append("  </Header>\n");
		buffer.append("  <Body>\n");
		for(String tblName : mapExportData.keySet() ) {
			buffer.append("    <Datas tableName=\""+ tblName + "\">\n");
			for(ExportDataModel data : mapExportData.get(tblName)) {
				buffer.append("      <Data>\n");
				buffer.append("        <ProductId>" + data.getProductId() +"</ProductId>\n");
				buffer.append("        <Price>" + data.getPrice() +"</Price>\n");
				buffer.append("        <Mount>" + data.getMount() +"</Mount>\n");
				buffer.append("      </Data>\n");
			}
			buffer.append("    </Datas>\n");
		}
		buffer.append("  </Body>\n");
		buffer.append("  <Footer>\n");
		buffer.append("    <ExportUser>" + footerModel.getExportUser() + "</ExportUser>\n");
		buffer.append("  </Footer>\n");
		buffer.append("</Report>\n");
		System.out.println( "输出到XML文件的内容：\n" + buffer.toString() );
	}
	
}
