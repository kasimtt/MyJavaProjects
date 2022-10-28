package OppWithLayeredOdev.dataAccess;

import OppWithLayeredOdev.entity.Course;

public class HibernateCourseDao implements CourseDao {

	@Override
	public void addCourse(Course course) {
		// TODO Auto-generated method stub
		System.out.println("hibernate ile ekleme yapıldı");
	}

	@Override
	public void deletedCourse(Course course) {
		// TODO Auto-generated method stub
		System.out.println("hibetnate ile silme işlemi yapıldı");
	}

}
