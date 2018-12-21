package com.chen.demoa;

/**
 * 持有接收者，通过调用接收者的方法来完成命令
 * @author Administrator
 *
 */
public class OpenCommand implements Command {
	
	private MainBoardApi mainBoard;
	
	public OpenCommand( MainBoardApi mainBoard ) {
		this.mainBoard = mainBoard;
	}

	@Override
	public void execute() {
		//对于命令对象，根本不知道如何开机，会转调主板对象，让主板对象完成开机功能
		this.mainBoard.open();
	}

}
