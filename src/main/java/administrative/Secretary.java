package administrative;


public class Secretary
{
	
	protected boolean posGrad;	
	protected Course courses;

	public Secretary(){
		super();
	}

	public boolean isPosGrad() {
		return posGrad;
	}

	public void setPosGrad(boolean posGrad) {
		this.posGrad = posGrad;
	}

	public Course getCourses() {
		return courses;
	}

	public void setCourses(Course courses) {
		this.courses = courses;
	}

	public Secretary(boolean posGrad, Course courses) {
		super();
		this.posGrad = posGrad;
		this.courses = courses;
	}
	
	
	
	

}

