package com.techlabs.test;

import com.techlabs.model.AddOperation;
import com.techlabs.model.MultiplyOperation;
import com.techlabs.model.OperationStrategy;

public class StrategyTest {
	public static void main(String args[]) {
		OperationStrategy operationStrategy = new OperationStrategy(new AddOperation());
		System.out.println(operationStrategy.doOperation(10,20));
		
		operationStrategy.setOperation(new MultiplyOperation());
		System.out.println(operationStrategy.doOperation(10,20));

	}
}
