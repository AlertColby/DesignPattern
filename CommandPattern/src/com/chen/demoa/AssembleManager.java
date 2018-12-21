package com.chen.demoa;

/**
 * 装配管理者
 * @author cqs
 *
 */
public class AssembleManager {
	
	public Box assemble() {
		//准备主板，接收者
		MainBoardApi mainBoard = new GiGaMainBoard();
		//准备按钮
		Command command = new  OpenCommand(mainBoard);
		//准备机箱
		Box box = new Box();
		//将按钮安装到机箱上
		box.setOpenButton(command);
		
		Command resetCommand = new ResetCommand( mainBoard );
		box.setResetButton(resetCommand );
		return box;
	}

}
