package com.chen.undo;

/**
 * º”∑®√¸¡Ó
 * @author Administrator
 *
 */
public class AddCommand implements Command {
	
	private OperationApi operation;
	
	private int operaNum;
	
	public AddCommand( OperationApi operation , int operaNum) {
		this.operation = operation;
		this.operaNum = operaNum;
	}

	@Override
	public void execute() {
		operation.add(operaNum);
	}

	@Override
	public void undo() {
		operation.substract(operaNum);
	}

}
