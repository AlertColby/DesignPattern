package com.chen.demoa;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.chen.demoa.model.ExportDataModel;
import com.chen.demoa.model.ExportFooterModel;
import com.chen.demoa.model.ExportHeaderModel;

/**
 * 未使用模式
 * @author Administrator
 *
 */
public class Client {

	public static void main(String[] args) {
		
		ExportHeaderModel header = new ExportHeaderModel();
		header.setDepId("慧云网安");
		header.setExportDate("2018-12-19");
		
		Map<String, Collection<ExportDataModel>> mapData = new HashMap<>();
		
		Collection<ExportDataModel> dataList = new ArrayList<>();
		
		ExportDataModel data1 = new ExportDataModel();
		data1.setProductId("产品001");
		data1.setPrice(12.5);
		data1.setMount(5);
		
		ExportDataModel data2 = new ExportDataModel();
		data2.setProductId("产品002");
		data2.setPrice(14.5);
		data2.setMount(6);
		dataList.add(data1);
		dataList.add(data2);
		
		mapData.put("销售记录表", dataList);
		
		ExportFooterModel footer = new ExportFooterModel();
		footer.setExportUser("巴格先生");
		
		ExportToTxt exportToTxt = new ExportToTxt();
		exportToTxt.export(header, mapData, footer);
		
		ExportToXML exportToXML = new ExportToXML();
		exportToXML.export(header, mapData, footer);
	}
}
