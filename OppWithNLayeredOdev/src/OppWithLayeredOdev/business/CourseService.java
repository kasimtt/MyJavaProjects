package OppWithLayeredOdev.business;

import OppWithLayeredOdev.entity.Course;

public interface CourseService {

	void add(Course course) throws Exception;
	void delete(Course course);
}
