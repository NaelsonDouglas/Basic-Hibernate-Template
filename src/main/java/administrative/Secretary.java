package administrative;

import java.util.Set;

public class Secretary {
	
	protected boolean posGrad;
	protected Set<Course> courses;

	public Secretary(boolean posGrad, Set<Course> courses){
		this.posGrad = posGrad;
		this.courses = courses;
	}

	public boolean isPosGrad() {
		return posGrad;
	}

	public void setPosGrad(boolean posGrad) {
		this.posGrad = posGrad;
	}

	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
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

