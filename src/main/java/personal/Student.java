package personal;
import java.util.ArrayList;
import java.util.Set;

import administrative.Class;
import administrative.Course;


public class Student extends Person
{
	
	protected String course;	
	protected int credits;	
	protected ArrayList<String> classes;
	
	
	public String reportIn(){
		String output = "";
		output = super.reportIn();
		output = output+"Curso: "+course+"\n"+"DISCIPLINAS MATRICULADO:\n";
		
		for (int i=0; i<classes.size(); i++){
			output=output+classes.get(i)+"\n";
		}
		output=output+"\n";		
		return output;
	}
	

	public boolean addClass(String className){
		classes.add(className);
		return true;
	}
	
	public Student(String name, int id, int credits) {
		super(name,id);
		this.course = "";
		this.credits = credits;
		this.classes = new ArrayList<String>();
		
	}




	public Student(){
		super();
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public ArrayList<String> getClasses() {
		return classes;
	}

	public void setClasses(ArrayList<String> classes) {
		this.classes = classes;
	}
	
	

}

