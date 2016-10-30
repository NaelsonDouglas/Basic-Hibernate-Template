package administrative;

import java.util.ArrayList;
import java.util.Set;

import dataGenerators.Main;
import personal.Student;

public class Secretary {
	
	protected boolean posGrad;
	protected ArrayList<Course> courses;
	protected Departament department;

	public Secretary(boolean posGrad, ArrayList<Course> courses){
		this.posGrad = posGrad;
		this.courses = courses;
		
		for (Course i: courses){
			i.setSecretary(this);
		}
	}
	
	
	public boolean enroll(Student student){
		for (int i=0; i<courses.size(); i++){
			System.out.println(i+" - "+courses.get(i).getName());
		}
		int selector = Main.readInt(0, courses.size()-1);
		Course course = pickCourse(selector);
		course.listClasses();
		selector = Main.readInt(0, course.getClasses().size()-1);
		course.pickClass(selector).enroll(student);		
		
		return true;
	}
	
	public Course pickCourse(int selector){
		return courses.get(selector);
	}
	
	public ArrayList<Student> getStudents(){
		
		ArrayList<Student> students = new ArrayList<Student>();
		
		
		for (Course i : courses){
			students.addAll(i.getStudents());
		}
		
		
		return students;
		
	}
	public boolean isPosGrad() {
		return posGrad;
	}

	public void setPosGrad(boolean posGrad) {
		this.posGrad = posGrad;
	}

	public ArrayList<Course> getCourses() {
		return courses;
	}
	
	

	public Departament getDepartment() {
		return department;
	}


	public void setDepartment(Departament department) {
		this.department = department;
	}


	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}
	
	
	public String reportIn(){
		String output = "";
		for(Course course : courses) {
			output += course.reportIn();
		}
		
		return output;
		
	}
	public String toString() {
		String output = "";
		for(Course course : courses) {
			output += course.toString();
		}
		
		return output;
	}

}

