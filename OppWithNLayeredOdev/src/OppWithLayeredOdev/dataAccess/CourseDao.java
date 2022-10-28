package OppWithLayeredOdev.dataAccess;

import OppWithLayeredOdev.entity.Course;

public interface CourseDao {

	void addCourse(Course course);
	void deletedCourse(Course course);
}
