package com.chen.undo;

public interface Command {

	void execute();
	
	void undo();
	
}
