package com.chen.undo;

public class Operation implements OperationApi {
	
	private int result;

	@Override
	public int getResult() {
		return result;
	}

	@Override
	public void setResult(int num) {
		result = num;
	}

	@Override
	public void add(int num) {
		result += num;
	}

	@Override
	public void substract(int num) {
		result -= num;
	}

}
