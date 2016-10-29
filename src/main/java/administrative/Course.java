package administrative;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

import personal.Student;

public class Course {
	
	protected String name;
	
	protected ArrayList<Class> classes;

	public Course(String name, ArrayList<Class> classes) {
		super();
		this.name = name;
		this.classes = classes;
	}

	public String getName() {
		return name;
	}

	
	public ArrayList<Student> getStudents(){
		ArrayList<Student> students = new ArrayList<Student>();
		
		for (Class i : classes){
			students.addAll(i.getStudents());
		}
		
		
		return students;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Class> getClasses() {
		return classes;
	}

	public void setClasses(ArrayList classes) {
		this.classes = classes;
	}
	
	
	public String reportIn(){
		String output = "";
		for(Class class_ : classes) {
			output += class_.reportIn();
		}
		
		return output;
		
	}
	
	
	public String toString(){
		String output = "";
		for(Class class_ : classes) {
			output += class_.toString();
		}
		
		return output;
	}

	

}

