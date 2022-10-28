package OppWithLayeredOdev.entity;

public class Course {
	
	private int courseId;
	private String courseName;
	private double priceOfCouse;
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public double getPriceOfCouse() {
		return priceOfCouse;
	}
	public void setPriceOfCouse(double priceOfCouse) {
		this.priceOfCouse = priceOfCouse;
	}
	public int getSourseId()
	{
		return courseId;
	}
	
}
