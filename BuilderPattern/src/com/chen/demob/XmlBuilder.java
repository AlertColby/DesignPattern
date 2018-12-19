package com.chen.demob;

import java.util.Collection;
import java.util.Map;

import com.chen.demoa.model.ExportDataModel;
import com.chen.demoa.model.ExportFooterModel;
import com.chen.demoa.model.ExportHeaderModel;

public class XmlBuilder implements Builder {
	
	private StringBuffer buffer = new StringBuffer();

	@Override
	public void buildHeader(ExportHeaderModel header) {
		buffer.append("<?xml version='1.0' encoding='gb2312' ?>\n");
		buffer.append("<Report>\n");
		buffer.append("  <Header>\n");
		buffer.append("    <DepId>" + header.getDepId() + "</DepId>\n");
		buffer.append("    <ExportDate>" + header.getExportDate() + "</ExportDate>\n");
		buffer.append("  </Header>\n");
	}

	@Override
	public void buildBody(Map<String, Collection<ExportDataModel>> mapData) {
		buffer.append("  <Body>\n");
		for(String tblName : mapData.keySet() ) {
			buffer.append("    <Datas tableName=\""+ tblName + "\">\n");
			for(ExportDataModel data : mapData.get(tblName)) {
				buffer.append("      <Data>\n");
				buffer.append("        <ProductId>" + data.getProductId() +"</ProductId>\n");
				buffer.append("        <Price>" + data.getPrice() +"</Price>\n");
				buffer.append("        <Mount>" + data.getMount() +"</Mount>\n");
				buffer.append("      </Data>\n");
			}
			buffer.append("    </Datas>\n");
		}
		buffer.append("  </Body>\n");
	}

	@Override
	public void buildFooter(ExportFooterModel footer) {
		buffer.append("  <Footer>\n");
		buffer.append("    <ExportUser>" + footer.getExportUser() + "</ExportUser>\n");
		buffer.append("  </Footer>\n");
		buffer.append("</Report>\n");
	}
	
	public StringBuffer getResult() {
		return buffer;
	}

}
