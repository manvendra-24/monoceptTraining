package com.techlabs.model;

import com.techlabs.interfaces.*;

public class SecurityCamera implements SmartDevice, Monitorable{
	public String deviceID;
	public String name;
	public boolean recording;
	public SecurityCamera(String deviceID, String name) {
		this.deviceID = deviceID;
		this.name = name;
	}
	@Override
	public String getStatus(){
		if(this.recording == true) {
			return "The device is on"; 
		}
		return "The device is off";
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
		return this.recording;
	}
}
