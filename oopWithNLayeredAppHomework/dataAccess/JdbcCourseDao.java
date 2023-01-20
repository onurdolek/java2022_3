package oopWithNLayeredAppHomework.dataAccess;

import oopWithNLayeredAppHomework.entities.Course;

public class JdbcCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Jdbc ile veritabanına eklendi");
		
	}

}
