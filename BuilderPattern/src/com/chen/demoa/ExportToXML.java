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
public class ExportToXML {
	
	/**
	 * �������ݵ�XML�ļ�
	 * @param headerModel �ı�ͷ
	 * @param mapExportData �ı�����
	 * @param footerModel �ı�β
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
		System.out.println( "�����XML�ļ������ݣ�\n" + buffer.toString() );
	}
	
}
