package com.chen.demoa;

public class ResetCommand implements Command {
	
	private MainBoardApi mainBoard;
	
	public ResetCommand( MainBoardApi mainBoard ) {
		this.mainBoard = mainBoard;
	}

	@Override
	public void execute() {
		this.mainBoard.reset();
	}

}
