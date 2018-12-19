package com.chen.demob;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.chen.demoa.model.ExportDataModel;
import com.chen.demoa.model.ExportFooterModel;
import com.chen.demoa.model.ExportHeaderModel;

/**
 * 经典的构建者模式的使用
 * @author cqs
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
		
		
		TxtBuilder txtBuilder = new TxtBuilder();
		Director txtDirector = new Director(txtBuilder);
		txtDirector.construct(header, mapData, footer);
		System.out.println("输出到文本文件的内容是：\n" + txtBuilder.getResult().toString() );
		
		BestTxtBuilder bestTxtBuilder = new BestTxtBuilder();
		Director bestTxtDirector = new Director(bestTxtBuilder);
		bestTxtDirector.construct(header, mapData, footer);
		System.out.println("输出到best文本文件的内容是：\n" + bestTxtBuilder.getResult().toString() );
		
		XmlBuilder xmlBuilder = new XmlBuilder();
		Director xmlDirector = new Director(xmlBuilder);
		xmlDirector.construct(header, mapData, footer);
		System.out.println("输出到XML文件的内容是：\n" + xmlBuilder.getResult().toString() );

	}
}
