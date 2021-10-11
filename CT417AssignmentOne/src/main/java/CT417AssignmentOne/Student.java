/*	Student Class
 *  Name: James Ward, ID: 18394566
 */
package CT417AssignmentOne;

import java.util.*;

public class Student {

	public String name;
	public int age;
	public String dateOfBirth;
	public int id;
	public String username;
	public ArrayList<CourseProgramme> courses;
	public ArrayList<Module> modulesRegisteredFor;
	
	public Student(String name, int age, String dateOfBirth, int id) {
		this.name = name;
		this.age = age;
		this.dateOfBirth = dateOfBirth;
		this.id = id;
		this.courses = new ArrayList<>();
		this.modulesRegisteredFor = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getUsername() {
		return name + age;
	}
	
	
	public ArrayList<CourseProgramme> getCourse() {
		return courses;
	}
	
	public void setCourse(ArrayList<CourseProgramme> courses) {
		this.courses = courses;
	}
	
	public ArrayList<Module> getModulesRegisteredFor() {
		return modulesRegisteredFor;
	}
	
	public void setModulesRegisteredFor(ArrayList<Module> modulesRegisteredFor) {
		this.modulesRegisteredFor = modulesRegisteredFor;
	}
	
	public void addCourse(CourseProgramme c) {
		ArrayList<CourseProgramme> addCourseProgramme = courses;
		addCourseProgramme.add(c);
		setCourse(addCourseProgramme);
	}

	public void addModule(Module m) {
		ArrayList<Module> addAModule = modulesRegisteredFor;
		addAModule.add(m);
		setModulesRegisteredFor(addAModule);
	}
	
	public String toString() {
		return "Name: " +name+ " ... Age: " +age+ " ... Date of Birth: " +dateOfBirth+ " ... ID: " +id+ " ... Username: " +getUsername(); 
	}
}