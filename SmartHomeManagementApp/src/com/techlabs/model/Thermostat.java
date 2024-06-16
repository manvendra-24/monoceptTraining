package com.techlabs.model;

import com.techlabs.interfaces.*;
public class Thermostat implements SmartDevice, Controllable, Monitorable{
	public String deviceID;
	public String name;
	public boolean on;
	public double temperature;
	public Thermostat(String deviceID, String name, double temperature) {
		this.deviceID = deviceID;
		this.name = name;
		this.temperature = temperature;
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
	
	@Override
	public String getStatus(){
		if(this.on == true) {
			return "The device is on"; 
		}
		return "The device is off";
	}
}
