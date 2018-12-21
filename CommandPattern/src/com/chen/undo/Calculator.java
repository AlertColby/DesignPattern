package com.chen.undo;

import java.util.ArrayList;
import java.util.List;

/**
 * 计算器类
 * @author Administrator
 *
 */
public class Calculator {

	private Command addCommand;
	private Command substractCommand;
	//撤销命令的集合
	private List<Command> undoCommands = new ArrayList<>();
	//恢复命令的集合
	private List<Command> redoCommands = new ArrayList<>();
	
	public void setAddCommand( Command addCommand ) {
		this.addCommand = addCommand;
	}
	
	public void setSubstractCommand( Command subCommand ) {
		this.substractCommand = subCommand;
	}
	
	public void pressAddButton() {
		addCommand.execute();
		undoCommands.add( addCommand );
	}
	
	public void pressSubButton() {
		substractCommand.execute();
		undoCommands.add( substractCommand );
	}
	
	public void pressUndoButton() {
		if( undoCommands.size() > 0) {
			Command command = undoCommands.get( undoCommands.size() - 1);
			command.undo();
			//将撤销命令加入到恢复命令
			redoCommands.add(command);
			undoCommands.remove( command );
		}else {
			System.out.println("不能执行撤销了");
		}
	}
	
	public void pressRedoButton() {
		if( redoCommands.size() > 0) {
			Command command = redoCommands.get( redoCommands.size() - 1 );
			command.execute();
			undoCommands.add(command);
			redoCommands.remove(command);
		}else {
			System.out.println("不能执行恢复了");
		}
	}
	
	
}