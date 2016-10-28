package personal;
import administrative.Class;
import administrative.Course;


public class Student extends Person
{
	
	protected Course course;

	
	protected int credits;

	
	protected Class classes;

	public Student(){
		super();
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public Class getClasses() {
		return classes;
	}

	public void setClasses(Class classes) {
		this.classes = classes;
	}
	
	

}

