package OppWithLayeredOdev.dataAccess;

import OppWithLayeredOdev.entity.Course;

public class JdbcCourseDao implements CourseDao {

	@Override
	public void addCourse(Course course) {
		// TODO Auto-generated method stub
		System.out.println("jbdc ile ekleme yapıldı");
		
	}
	@Override
	public void deletedCourse(Course course) {
		// TODO Auto-generated method stub
		System.out.println("jbdc ile ekleme yapıldı");
	}


}
