package com.chen.undo;

import java.util.ArrayList;
import java.util.List;

/**
 * ��������
 * @author Administrator
 *
 */
public class Calculator {

	private Command addCommand;
	private Command substractCommand;
	//��������ļ���
	private List<Command> undoCommands = new ArrayList<>();
	//�ָ�����ļ���
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
			//������������뵽�ָ�����
			redoCommands.add(command);
			undoCommands.remove( command );
		}else {
			System.out.println("����ִ�г�����");
		}
	}
	
	public void pressRedoButton() {
		if( redoCommands.size() > 0) {
			Command command = redoCommands.get( redoCommands.size() - 1 );
			command.execute();
			undoCommands.add(command);
			redoCommands.remove(command);
		}else {
			System.out.println("����ִ�лָ���");
		}
	}
	
	
}