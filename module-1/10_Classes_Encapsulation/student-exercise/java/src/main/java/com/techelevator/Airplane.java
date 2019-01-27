package com.techelevator;

public class Airplane {
	
	private String planeNumber;
	private int bookedFirstClassSeats;
	private int availableFirstClassSeats;
	private int totalFirstClassSeats;
	private int bookedCoachSeats;
	private int availableCoachSeats;
	private int totalCoachSeats;
	
	public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {
		this.planeNumber = planeNumber;
		this.totalFirstClassSeats = totalFirstClassSeats;
		this.totalCoachSeats = totalCoachSeats;
	}
	
	//for this method - shouldn't it be (totalNumberOfSeats < availableFirstClassSeats) that passes?
	
	public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats ) {
		if((forFirstClass) && (totalNumberOfSeats < totalFirstClassSeats)) {
			bookedFirstClassSeats+= totalNumberOfSeats;
			return true;
		} else {
			if((!forFirstClass) && (totalNumberOfSeats < totalCoachSeats)) {
				bookedCoachSeats+= totalNumberOfSeats;
				return true;
				} 
		} return false;
	}

	/**
	 * @return the planeNumber
	 */
	public String getPlaneNumber() {
		return planeNumber;
	}

	/**
	 * @return the bookedFirstClassSeats
	 */
	public int getBookedFirstClassSeats() {
		return bookedFirstClassSeats;
	}

	/**
	 * @return the availableFirstClassSeats
	 */
	public int getAvailableFirstClassSeats() {
		return totalFirstClassSeats - bookedFirstClassSeats;
	}

	/**
	 * @return the totalFirstClassSeats
	 */
	public int getTotalFirstClassSeats() {
		return totalFirstClassSeats;
	}

	/**
	 * @return the bookedCoachSeats
	 */
	public int getBookedCoachSeats() {
		return bookedCoachSeats;
	}

	/**
	 * @return the availableCoachSeats
	 */
	public int getAvailableCoachSeats() {
		return totalCoachSeats - bookedCoachSeats;
	}

	/**
	 * @return the totalCoachSeats
	 */
	public int getTotalCoachSeats() {
		return totalCoachSeats;
	}
	

}
