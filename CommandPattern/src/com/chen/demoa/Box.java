package com.chen.demoa;

/**
 * 机箱对象，本身有按钮，持有按钮对应的命令对象
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
		//按下按钮，执行命令
		this.command.execute();
	}
	
	public void setResetButton( Command resetCommand ) {
		this.resetCommand = resetCommand;
	}
	
	public void resetButtonPressed() {
		this.resetCommand.execute();
	}

}
