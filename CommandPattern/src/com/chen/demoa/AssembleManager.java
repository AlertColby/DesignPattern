package com.chen.demoa;

/**
 * װ�������
 * @author cqs
 *
 */
public class AssembleManager {
	
	public Box assemble() {
		//׼�����壬������
		MainBoardApi mainBoard = new GiGaMainBoard();
		//׼����ť
		Command command = new  OpenCommand(mainBoard);
		//׼������
		Box box = new Box();
		//����ť��װ��������
		box.setOpenButton(command);
		
		Command resetCommand = new ResetCommand( mainBoard );
		box.setResetButton(resetCommand );
		return box;
	}

}
