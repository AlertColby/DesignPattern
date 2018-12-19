package com.chen.demob;

import java.util.Collection;
import java.util.Map;

import com.chen.demoa.model.ExportDataModel;
import com.chen.demoa.model.ExportFooterModel;
import com.chen.demoa.model.ExportHeaderModel;

public class BestTxtBuilder implements Builder {
	
	private StringBuffer buffer = new StringBuffer();;

	@Override
	public void buildHeader(ExportHeaderModel header) {
		buffer.append("\n\n");
		buffer.append( header.getDepId() + "," + header.getExportDate() + "\n");
	}

	@Override
	public void buildBody(Map<String, Collection<ExportDataModel>> mapData) {
		for (String talName : mapData.keySet()) {
			buffer.append("  " + talName + "\n");
			for(ExportDataModel data : mapData.get(talName)) {
				buffer.append( "    " + data.getProductId() + "," + data.getPrice() + "," + data.getMount() + "\n");
			}
		}
	}

	@Override
	public void buildFooter(ExportFooterModel footer) {
		buffer.append( footer.getExportUser() + "\n");
		buffer.append("\n\n");
	}
	
	public StringBuffer getResult() {
		return buffer;
	}

}
