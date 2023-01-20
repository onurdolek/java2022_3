package oopWithNLayeredAppHomework;

import oopWithNLayeredAppHomework.business.CourseManager;
import oopWithNLayeredAppHomework.core.logging.DatabaseLogger;
import oopWithNLayeredAppHomework.core.logging.FileLogger;
import oopWithNLayeredAppHomework.core.logging.Logger;
import oopWithNLayeredAppHomework.core.logging.MailLogger;
import oopWithNLayeredAppHomework.dataAccess.HibernateCourseDao;
import oopWithNLayeredAppHomework.entities.Course;

public class Main {

	public static void main(String[] args) throws Exception {
		Course course4 = new Course(4, "English 101", "Language", "Rıdvan Gürbüz", 900);
		Logger[] loggers = { new DatabaseLogger(), new FileLogger(), new MailLogger() };
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
		courseManager.add(course4);
	}

}
