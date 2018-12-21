package com.chen.demoa;

public class Client {

	public static void main(String[] args) {
		AssembleManager assembleManager = new AssembleManager();
		Box box = assembleManager.assemble();
		box.openButtonPressed();
		System.out.println("-----------------------------");
		box.resetButtonPressed();
	}
}
