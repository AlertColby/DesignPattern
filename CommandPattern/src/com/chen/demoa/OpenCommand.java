package com.chen.demoa;

/**
 * ���н����ߣ�ͨ�����ý����ߵķ������������
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
		//����������󣬸�����֪����ο�������ת��������������������ɿ�������
		this.mainBoard.open();
	}

}
