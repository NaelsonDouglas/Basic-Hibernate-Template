package administrative;

import java.util.HashSet;

public class Secretary
{
	
	protected boolean posGrad;	
	HashSet<Course> courses;

	public Secretary(boolean posGrad, HashSet<Course> courses){
		this.posGrad = posGrad;
		this.courses = courses;
	}

	public boolean isPosGrad() {
		return posGrad;
	}

	public void setPosGrad(boolean posGrad) {
		this.posGrad = posGrad;
	}

	public HashSet<Course> getCourses() {
		return courses;
	}

	public void setCourses(HashSet<Course> courses) {
		this.courses = courses;
	}

}

