package administrative;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

import personal.Student;

public class Course {
	
	protected String name;
	protected Secretary secretary;
	
	protected ArrayList<Class> classes;

	public Course(String name, ArrayList<Class> classes) {
		super();
		this.name = name;
		this.classes = classes;
		
		for (Class i: classes){
			i.setCourse(this);
		}
	}

	public String getName() {
		return name;
	}
	
	public boolean listClasses(){
		for (int i=0; i<classes.size(); i++){
			System.out.println(i+" - "+classes.get(i).getName());			
		}
		return true;
	}
	
	public Class pickClass(int selector){
		return classes.get(selector);
	}
	
	
	public boolean enroll(Student student){		
		student.setCourse(this);		
		return true;
	}
	
	public Secretary getSecretary() {
		return secretary;
	}

	public void setSecretary(Secretary secretary) {
		this.secretary = secretary;
	}

	public void setClasses(ArrayList<Class> classes) {
		this.classes = classes;
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

