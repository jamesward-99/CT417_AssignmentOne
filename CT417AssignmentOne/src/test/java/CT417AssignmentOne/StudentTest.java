/*	Student Test Class
 *  Name: James Ward, ID: 18394566
 */
package CT417AssignmentOne;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;

public class StudentTest {

	public String name = "James";
	public int age = 22;
	public String dateOfBirth = "06/08/1999";
	public int id = 18394566;
	Student student = new Student(name, age, dateOfBirth, id);
	
	@Test
	public void GetNameTest() {
		assertEquals(name, student.getName());
	}
	
	@Test
	public void SetNameTest() {
		student.setName(name);
		assertEquals(name, student.name);
	}
	
	@Test
	public void GetAgeTest() {
		assertEquals(age, student.getAge());
	}
	
	@Test
	public void SetAgeTest() {
		student.setAge(age);
		assertEquals(age, student.age);
	}
	
	@Test
	public void GetDateOfBirthTest() {
		assertEquals(dateOfBirth, student.getDateOfBirth());
	}
	
	@Test
	public void SetDateOfBirthTest() {
		student.setDateOfBirth(dateOfBirth);
		assertEquals(dateOfBirth, student.dateOfBirth);
	}
	
	@Test
	public void GetIdTest() {
		assertEquals(id, student.getId());
	}
	
	@Test
	public void SetIdTest() {
		student.setId(id);
		assertEquals(id, student.id);
	}
	
	@Test
	public void GetUsernameTest() {
		String username = student.getUsername();
		assertEquals("James22", username);
	}
	
	@Test
	public void AddModuleTest() {
		Module module = new Module("Software Engineering", "CT417");
		student.addModule(module);
		ArrayList<Module> modules = student.getModulesRegisteredFor();
		assertEquals(1, modules.size());
	}

	@Test
	public void AddCourseTest() {
		CourseProgramme course = new CourseProgramme();
		student.addCourse(course);
		ArrayList<CourseProgramme> courses = student.getCourse();
		assertEquals(1, courses.size());
	}
}