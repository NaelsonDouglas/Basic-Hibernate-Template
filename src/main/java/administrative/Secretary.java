package administrative;

import java.util.ArrayList;
import java.util.Set;

import personal.Student;

public class Secretary {
	
	protected boolean posGrad;
	protected ArrayList<Course> courses;

	public Secretary(boolean posGrad, ArrayList<Course> courses){
		this.posGrad = posGrad;
		this.courses = courses;
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

