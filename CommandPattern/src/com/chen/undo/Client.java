package com.chen.undo;

public class Client {
	
	public static void main(String[] args) {
		
		//1.组装命令和接收者
		OperationApi operation = new Operation();
		
		AddCommand addCommand = new AddCommand(operation, 5);
		
		SubstractCommand substractCommand = new SubstractCommand(operation, 3);
		
		//2.把命令设置到持有者，也就是计算器
		Calculator calculator = new Calculator();
		
		calculator.setAddCommand(addCommand);
		
		calculator.setSubstractCommand(substractCommand);
		
		//3.模拟按下按钮，测试
		
		calculator.pressAddButton();
		System.out.println("一次加法运算后的结果：" + operation.getResult() );
		
		calculator.pressSubButton();
		System.out.println("一次减法运算后的结果：" + operation.getResult() );
		
		calculator.pressSubButton();
		System.out.println("一次减法运算后的结果：" + operation.getResult() );
		
		calculator.pressUndoButton();
		System.out.println("一次撤销后的结果：" + operation.getResult() );
		
		calculator.pressUndoButton();
		System.out.println("一次撤销后的结果：" + operation.getResult() );
	}

}
