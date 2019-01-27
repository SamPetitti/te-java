package com.techelevator;

public class Elevator {
	private int currentFloor = 1;
	private int numberOfFloors;
	private boolean doorOpen = false;

	
	public Elevator(int totalNumberOfFloors) {
		numberOfFloors = totalNumberOfFloors;
	}
	
	public void openDoor() {
		doorOpen = true;
	}
	
	public void closeDoor() {
		doorOpen = false;
	}
	
	public void goUp(int desiredFloor) {
		if(desiredFloor <= numberOfFloors && desiredFloor> currentFloor && !doorOpen) {
			currentFloor = desiredFloor;
		}
	}
	
	public void goDown(int desiredFloor) {
		if(desiredFloor >= 1 && desiredFloor < currentFloor && !doorOpen) {
			currentFloor = desiredFloor;
		}
	}

	/**
	 * @return the currentFloor
	 */
	public int getCurrentFloor() {
		return currentFloor;
	}

	/**
	 * @return the numberOfFloors
	 */
	public int getNumberOfFloors() {
		return numberOfFloors;
	}

	/**
	 * @return the doorOpen
	 */
	public boolean isDoorOpen() {
		return doorOpen;
	}
	
	
	
}
