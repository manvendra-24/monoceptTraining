package com.techlabs.test;

import com.techlabs.model.Context;
import com.techlabs.model.StartState;
import com.techlabs.model.StopState;

public class StateTest {
	public static void main(String args[]) {
		Context context = new Context();
		context.setState(new StartState());
		context.doAction();
		
		context.setState(new StopState());
		context.doAction();
		
		
		
	}
}
