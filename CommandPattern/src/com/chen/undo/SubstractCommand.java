package com.chen.undo;

/**
 * ºı∑®√¸¡Ó
 * @author Administrator
 *
 */
public class SubstractCommand implements Command {
	
	private OperationApi operation;
	
	private int operaNum;
	
	public SubstractCommand( OperationApi operation , int operaNum) {
		this.operation = operation;
		this.operaNum = operaNum;
	}

	@Override
	public void execute() {
		operation.substract(operaNum);
	}

	@Override
	public void undo() {
		operation.add(operaNum);
	}

}
