package com.techelevator;

public class Television {

	private boolean isOn = false;
	private int currentChannel = 3;
	private int currentVolume = 2;
	
	public void turnOff() {
		isOn = false;
	}
	public void turnOn() {
		isOn = true;
		currentChannel = 3;
		currentVolume = 2;
	}
	public void changeChannel(int newChannel) {
		if((newChannel >= 3 && newChannel<= 18) && (isOn)) {
		currentChannel = newChannel;
		}
	}
	
	public void channelUp() {
		if(currentChannel < 18 && isOn) {
			currentChannel+= 1;
		} else {
			if(isOn == true) {
				currentChannel = 3;
			}
		}
	}
	
	public void channelDown() {
		if(currentChannel > 3 && isOn) {
		currentChannel -= 1;
		}else {
			if(isOn == true) {
			currentChannel = 18;
			}
		}
	}
	
	public void raiseVolume() {
		if(currentVolume < 10 && isOn) {
			currentVolume ++;
		}
		
	}
	
	public void lowerVolume() {
		if(currentVolume > 0 && isOn) {
			currentVolume --;
		}
	}
	/**
	 * @return the isOn
	 */
	public boolean isOn() {
		return isOn;
	}
	/**
	 * @return the currentChannel
	 */
	public int getCurrentChannel() {
		return currentChannel;
	}
	/**
	 * @return the currentVolume
	 */
	public int getCurrentVolume() {
		return currentVolume;
	}
	
	
}
