package OppWithLayeredOdev.business;
import OppWithLayeredOdev.core.logging.Logger;
import OppWithLayeredOdev.dataAccess.CourseDao;
import OppWithLayeredOdev.entity.Course;
import java.util.List;
public class CourseManager implements CourseService{

	public CourseDao courseDao;
	public List<Logger> loggers;
	
	public CourseManager(CourseDao courseDao, List<Logger> loggers)
	{
		this.courseDao= courseDao;
		this.loggers = loggers;
	}
	
	
	@Override
	public void add(Course course) throws Exception {
		// TODO Auto-generated method stub
		if(course.getPriceOfCouse() < 0)
		{
			throw new Exception("kurs fiyatı sıfır olamaz panpa");
		}
		
		for (Logger logger : loggers) {
			logger.log(course.getCourseName());
		}
	}

	@Override
	public void delete(Course course) {
		// TODO Auto-generated method stub
		
	}

}
