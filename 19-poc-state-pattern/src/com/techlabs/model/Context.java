package com.techlabs.model;

public class Context {
	private IState state;
	public Context() {
		state = null;
	}
	
	public void setState(IState state) {
		this.state = state;
	}
	public void doAction() {
		state.doAction(this);
	}
	public IState getState() {
		return state;
	}
}
	
