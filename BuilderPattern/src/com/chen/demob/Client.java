package com.chen.demob;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.chen.demoa.model.ExportDataModel;
import com.chen.demoa.model.ExportFooterModel;
import com.chen.demoa.model.ExportHeaderModel;

/**
 * ����Ĺ�����ģʽ��ʹ��
 * @author cqs
 *
 */
public class Client {

	public static void main(String[] args) {
		
		ExportHeaderModel header = new ExportHeaderModel();
		header.setDepId("��������");
		header.setExportDate("2018-12-19");
		
		Map<String, Collection<ExportDataModel>> mapData = new HashMap<>();
		
		Collection<ExportDataModel> dataList = new ArrayList<>();
		
		ExportDataModel data1 = new ExportDataModel();
		data1.setProductId("��Ʒ001");
		data1.setPrice(12.5);
		data1.setMount(5);
		
		ExportDataModel data2 = new ExportDataModel();
		data2.setProductId("��Ʒ002");
		data2.setPrice(14.5);
		data2.setMount(6);
		dataList.add(data1);
		dataList.add(data2);
		
		mapData.put("���ۼ�¼��", dataList);
		
		ExportFooterModel footer = new ExportFooterModel();
		footer.setExportUser("�͸�����");
		
		
		TxtBuilder txtBuilder = new TxtBuilder();
		Director txtDirector = new Director(txtBuilder);
		txtDirector.construct(header, mapData, footer);
		System.out.println("������ı��ļ��������ǣ�\n" + txtBuilder.getResult().toString() );
		
		BestTxtBuilder bestTxtBuilder = new BestTxtBuilder();
		Director bestTxtDirector = new Director(bestTxtBuilder);
		bestTxtDirector.construct(header, mapData, footer);
		System.out.println("�����best�ı��ļ��������ǣ�\n" + bestTxtBuilder.getResult().toString() );
		
		XmlBuilder xmlBuilder = new XmlBuilder();
		Director xmlDirector = new Director(xmlBuilder);
		xmlDirector.construct(header, mapData, footer);
		System.out.println("�����XML�ļ��������ǣ�\n" + xmlBuilder.getResult().toString() );

	}
}
