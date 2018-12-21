package com.chen.demoa;

/**
 * 
 * @author cqs
 *
 */
public class GiGaMainBoard implements MainBoardApi {

	@Override
	public void open() {
		System.out.println("技嘉主板现在正在开机，请等候");
		System.out.println("接通电源");
		System.out.println("设备检查");
		System.out.println("装载系统");
		System.out.println("机器正在运行起来");
		System.out.println("已开机，可操作");
	}

	@Override
	public void reset() {
		System.out.println("技嘉主板现在正在重启，请等候");
		System.out.println("已开机，可操作");
	}

}
