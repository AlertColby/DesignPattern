package com.chen.demoa;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 供测试使用,模拟数据库中的值
 * @author Administrator
 *
 */
public class TestDB {

	/**
	 * 用来存放授权数据的值
	 */
	public static Collection<String> colDb = new ArrayList<>();
	
	static {
		colDb.add("张三,人员列表,查看");
		colDb.add("李四,人员列表,查看");
		colDb.add("李四,薪资数据,查看");
		colDb.add("李四,薪资数据,修改");
		
		for(int i = 0 ; i < 5 ; i++) {
			colDb.add("张三" + i + ",人员列表,查看" );
		}
	}
}
