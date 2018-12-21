package com.chen.undo;

public class Client {
	
	public static void main(String[] args) {
		
		//1.��װ����ͽ�����
		OperationApi operation = new Operation();
		
		AddCommand addCommand = new AddCommand(operation, 5);
		
		SubstractCommand substractCommand = new SubstractCommand(operation, 3);
		
		//2.���������õ������ߣ�Ҳ���Ǽ�����
		Calculator calculator = new Calculator();
		
		calculator.setAddCommand(addCommand);
		
		calculator.setSubstractCommand(substractCommand);
		
		//3.ģ�ⰴ�°�ť������
		
		calculator.pressAddButton();
		System.out.println("һ�μӷ������Ľ����" + operation.getResult() );
		
		calculator.pressSubButton();
		System.out.println("һ�μ��������Ľ����" + operation.getResult() );
		
		calculator.pressSubButton();
		System.out.println("һ�μ��������Ľ����" + operation.getResult() );
		
		calculator.pressUndoButton();
		System.out.println("һ�γ�����Ľ����" + operation.getResult() );
		
		calculator.pressUndoButton();
		System.out.println("һ�γ�����Ľ����" + operation.getResult() );
	}

}
