package com.techelevator;

public class HomeworkAssignment {
	
	private int totalMarks;
	private int possibleMarks;
	private String submitterName;
	private String letterGrade;
	
	
	
	public HomeworkAssignment(int possibleMarks) {
		this.possibleMarks = possibleMarks;
	
	}
	

	
	
	/**
	 * @return the letterGrade
	 */
	public String getLetterGrade() {
		if(((double)totalMarks/(double)possibleMarks) * 100 >= 90){
			letterGrade = "A";
		} else {
			if(((double)totalMarks/(double)possibleMarks) * 100 >= 80) {
				letterGrade = "B";
			} else {
				if(((double)totalMarks/(double)possibleMarks) * 100 >= 70) {
					letterGrade = "C";
				} else {
					if(((double)totalMarks/(double)possibleMarks) * 100 >= 60) {
						letterGrade = "D";
					} else {
						letterGrade = "F";
					}
				}
			}
		} return letterGrade;
	}








	/**
	 * @return the totalMarks
	 */
	public int getTotalMarks() {
		return totalMarks;
	}

	/**
	 * @param totalMarks the totalMarks to set
	 */
	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}

	/**
	 * @return the submitterName
	 */
	public String getSubmitterName() {
		return submitterName;
	}

	/**
	 * @param submitterName the submitterName to set
	 */
	public void setSubmitterName(String submitterName) {
		this.submitterName = submitterName;
	}

	/**
	 * @return the possibleMarks
	 */
	public int getPossibleMarks() {
		return possibleMarks;
	}
	
	
	
	

}
