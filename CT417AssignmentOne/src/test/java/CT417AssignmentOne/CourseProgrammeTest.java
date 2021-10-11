/*	Course Programme Test Class
 *	Name: James Ward, ID: 18394566
 */
package CT417AssignmentOne;

import org.joda.time.LocalDate;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;

public class CourseProgrammeTest {

	public String courseName = "CS & IT";
	public LocalDate startDate = new LocalDate(2021, 9, 6);
	public LocalDate finishDate = new LocalDate(2022, 5, 11);
	CourseProgramme course = new CourseProgramme(courseName, startDate, finishDate);
	
	@Test
	public void GetCourseNameTest() {
		assertEquals(courseName, course.getCourseName());
	}
	
	@Test
	public void SetCourseNameTest() {
		course.setCourseName(courseName);
		assertEquals(courseName, course.courseName);
	}
	
	@Test
	public void GetStartDateTest() {
		assertEquals(startDate, course.getStartDate());
	}
	
	@Test
	public void SetStartDateTest() {
		course.setStartDate(startDate);
		assertEquals(startDate, course.startDate);
	}
	
	@Test
	public void GetFinishDateTest() {
		assertEquals(finishDate, course.getFinishDate());
	}
	
	@Test
	public void SetFinishDateTest() {
		course.setFinishDate(finishDate);
		assertEquals(finishDate, course.finishDate);
	}
	
	@Test
	public void AddStudentTest() {
		Student student = new Student("James", 22, "06/08/1999", 18394566);
		course.addStudent(student);
		ArrayList<Student> students = course.getStudent();
		assertEquals(1, students.size());
	}

	@Test
	public void AddModuleTest() {
		Module module = new Module("Software Engineering", "CT417");
		course.addModule(module);
		ArrayList<Module> modules = course.getModulesRegisteredFor();
		assertEquals(1, modules.size());
	}
}