/*
 *  Module Class
 *  Name: James Ward, ID: 18394566
 */
package CT417AssignmentOne;

import java.util.*;

public class Module {

	public String moduleName;
	public String moduleId;
	public ArrayList<Student> students;
	public ArrayList<CourseProgramme> courses;
	
	public Module(String moduleName, String moduleId) {
		this.moduleName = moduleName;
		this.moduleId = moduleId;
		this.students = new ArrayList<>();
		this.courses = new ArrayList<>();
	}
	
	public String geModuleName() {
		return moduleName;
	}
	
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	
	public String geModuleId() {
		return moduleId;
	}
	
	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}
	
	public ArrayList<CourseProgramme> getCourse() {
		return courses;
	}
	
	public void setCourse(ArrayList<CourseProgramme> courses) {
		this.courses = courses;
	}
	
	public ArrayList<Student> getStudent() {
		return students;
	}
	
	public void setStudent(ArrayList<Student> students) {
		this.students = students;
	}
	
	public void addCourse(CourseProgramme c) {
		ArrayList<CourseProgramme> addCourseProgramme = courses;
		addCourseProgramme.add(c);
		setCourse(addCourseProgramme);
	}

	public void addStudent(Student s) {
		ArrayList<Student> addAStudent = students;
		addAStudent.add(s);
		setStudent(addAStudent);
	}
	
	public String toString() {
		return " \nModule Name: " +moduleName+ " ... Module ID: " +moduleId; 
	}
}