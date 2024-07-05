package com.techlabs.model;

public class StopState implements IState{
	public void doAction(Context context) {
		System.out.println("byee.....");
		context.setState(this);
	}
	public String toString() {
		return "Stop State";
	}
}
