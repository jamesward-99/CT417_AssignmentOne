/*	Module Test Class
 *  Name: James Ward, ID: 18394566
 */
package CT417AssignmentOne;

import org.joda.time.LocalDate;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;

public class ModuleTest {

	public String moduleName = "Software Engineering";
	public String moduleId = "CT417";
	Module module = new Module(moduleName, moduleId);
	
	@Test
	public void GetModuleNameTest() {
		assertEquals(moduleName, module.getModuleName());
	}
	
	@Test
	public void SetModuleNameTest() {
		module.setModuleName(moduleName);
		assertEquals(moduleName, module.moduleName);
	}
	
	@Test
	public void GetModuleIdTest() {
		assertEquals(moduleId, module.getModuleId());
	}
	
	@Test
	public void SetModuleIdTest() {
		module.setModuleId(moduleId);
		assertEquals(moduleId, module.moduleId);
	}
	
	@Test
	public void AddStudentTest() {
		Student student = new Student("James", 22, "06/08/1999", 18394566);
		module.addStudent(student);
		ArrayList<Student> students = module.getStudent();
		assertEquals(1, students.size());
	}

	@Test
	public void AddCourseTest() {
		CourseProgramme course = new CourseProgramme("CS & IT", new LocalDate(2021, 9, 6), new LocalDate(2022, 5, 11));
		module.addCourse(course);
		ArrayList<CourseProgramme> courses = module.getCourse();
		assertEquals(1, courses.size());
	}
}