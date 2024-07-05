package com.techlabs.model;

public class StartState implements IState{
	public void doAction(Context context) {
		System.out.println("Hiiii...");
		context.setState(this);
	}
	public String  toString() {
		return "Start State";
	}
}
