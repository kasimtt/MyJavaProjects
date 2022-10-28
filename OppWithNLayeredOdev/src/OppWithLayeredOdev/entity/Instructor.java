package OppWithLayeredOdev.entity;

import javax.swing.Spring;

public class Instructor implements Entity
{
	private int instructorId;
	private Spring FirstName;
	private Spring lastName;
	
	public int getInstructorId() {
		return instructorId;
	}
/*	public void setInstructorId(int instructorId) {  // ıd olduğu icin dışarıdan yazılmasını doğru bulmuyorum
		this.instructorId = instructorId;
	}
	*/
	public Spring getFirstName() {
		return FirstName;
	}
	public void setFirstName(Spring firstName) {
		FirstName = firstName;
	}
	public Spring getLastName() {
		return lastName;
	}
	public void setLastName(Spring lastName) {
		this.lastName = lastName;
	}
	
	
	

}
