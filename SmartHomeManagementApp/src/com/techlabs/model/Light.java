package com.techlabs.model;

import com.techlabs.interfaces.*;

public class Light implements SmartDevice,Controllable{
	public String deviceID;
	public String name;
	public boolean on;
	public Light(String deviceID, String name) {
		this.deviceID = deviceID;
		this.name = name;
	}

	@Override
	public void turnOn() {
		this.on = true;
	}
	
	@Override
	public void turnOff() {
		this.on = false;
	}
	
	@Override
	public String getDeviceID() {
		return this.deviceID;
	}
	
	@Override
	public String getName() {
		return this.name;
	}
	
	@Override
	public boolean isOn() {
		return this.on;
	}
}
