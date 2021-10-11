/*	Course Programme Class
 *  Name: James Ward, ID: 18394566
 */
package CT417AssignmentOne;

import java.util.*;
import org.joda.time.*;

public class CourseProgramme {

	public String courseName;
	public ArrayList<Module> modulesRegisteredFor;
	public ArrayList<Student> students;
	public LocalDate startDate;
	public LocalDate finishDate;
	
	public CourseProgramme(/*String courseName, LocalDate startDate, LocalDate finishDate */) {
		this.courseName = courseName;
		this.modulesRegisteredFor = new ArrayList<>();
		this.students = new ArrayList<>();
		this.startDate = startDate;
		this.finishDate = finishDate;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public LocalDate getStartDate() {
		return startDate;
	}
	
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	
	public LocalDate getFinishDate() {
		return finishDate;
	}
	
	public void setFinishDate(LocalDate finishDate) {
		this.finishDate = finishDate;
	}
	
	public ArrayList<Module> getModulesRegisteredFor() {
		return modulesRegisteredFor;
	}
	
	public void setModulesRegisteredFor(ArrayList<Module> modulesRegisteredFor) {
		this.modulesRegisteredFor = modulesRegisteredFor;
	}
	
	public ArrayList<Student> getStudent() {
		return students;
	}
	
	public void setStudent(ArrayList<Student> students) {
		this.students = students;
	}
	
	public void addModule(Module m) {
		ArrayList<Module> addAModule = modulesRegisteredFor;
		addAModule.add(m);
		setModulesRegisteredFor(addAModule);
	}
	
	public void addStudent(Student s) {
		ArrayList<Student> addAStudent = students;
		addAStudent.add(s);
		setStudent(addAStudent);
	}
	
	public String toString() {
		return "\nCourse Name: " +courseName +"... Start Date: " +startDate+ " ... Finish Date: " +finishDate; 
	}
}