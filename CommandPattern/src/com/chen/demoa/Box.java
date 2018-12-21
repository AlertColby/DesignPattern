package com.chen.demoa;

/**
 * ������󣬱����а�ť�����а�ť��Ӧ���������
 * @author cqs
 *
 */
public class Box {
	
	private Command command;
	private Command resetCommand;
	
	public void setOpenButton(Command command) {
		this.command = command;
	}
	
	public void openButtonPressed() {
		//���°�ť��ִ������
		this.command.execute();
	}
	
	public void setResetButton( Command resetCommand ) {
		this.resetCommand = resetCommand;
	}
	
	public void resetButtonPressed() {
		this.resetCommand.execute();
	}

}
