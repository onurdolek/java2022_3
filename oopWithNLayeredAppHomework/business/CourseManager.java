package oopWithNLayeredAppHomework.business;

import oopWithNLayeredAppHomework.core.logging.Logger;
import oopWithNLayeredAppHomework.dataAccess.CourseDao;
import oopWithNLayeredAppHomework.entities.Course;

public class CourseManager {
	private CourseDao coursedao;
	private Logger[] loggers;

	public CourseManager(CourseDao coursedao, Logger[] loggers) {
		this.coursedao = coursedao;
		this.loggers = loggers;
	}

	Course[] courses = { new Course(1, "C#", "Backend", "Engin Demiroğ", 1250),
			new Course(2, "JavaScript", "Frontend", "Engin Demiroğ", 1000),
			new Course(3, "Programlamaya Giriş", "General", "Engin Demiroğ", 750) };

	public void add(Course course) throws Exception {
		if (course.getPrice() < 0) {
			throw new Exception("Kurs fiyatı 0 dan küçük olamaz");
		}

		for (Course course1 : courses) {
			if (course.getName().equals(course1.getName())) {
				throw new Exception("Kurs ismi tekrar edemez");
			}
		}
		for (Course course2 : courses) {
			if (course.getCategory().equals(course2.getCategory())) {
				throw new Exception("Kategori ismi tekrar edemez");
			}

		}

		coursedao.add(course);

		for (Logger logger : loggers) {
			logger.log(course.getName() + " kursu eklendi ");
		}

	}
}
