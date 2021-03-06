package personal;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

import administrative.Class;
import administrative.Course;
import administrative.Departament;
import administrative.Secretary;
import dataGenerators.Main;


public class Student extends Person
{
	
	protected Course course;	
	protected Departament department;
	protected Secretary secretary;
	protected int credits;	
	protected boolean posGrad;
	protected ArrayList<String> classes;
	
	
	public String reportIn(){
		String output = "";
		output = super.reportIn();
		output = output+"Curso: "
		+ 				course.getName()+"\n"
				+"DISCIPLINAS COM MATRÌCULA:\n";
		
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
	
	public static  Student registerStudent(int graduation){
		Scanner scan = new Scanner(System.in);
		System.out.println("Nome: ");
		String name = scan.next();
		System.out.println("1 - Graduando \n 2 - Pos-Graduando");
		boolean grad = false;
		int selector =graduation;// Main.readInt(1,2);		
		if (selector == 1){
			grad = true;
		} else {
			grad = false;
		}
		Student newStudent = new Student(name,1,grad,0);
		return newStudent;
		
	}
	
	public Student(String name, int id, boolean poGrad,int credits) {
		super(name,id);
		this.course = new Course("",new ArrayList<Class>());
		this.credits = credits;
		this.classes = new ArrayList<String>();
		this.ID = -1;
		this.posGrad = posGrad;
		
		
	}


	public void setCourse(Course course) {
		this.course = course;
	}

	public int getCredits() {
		return credits;
	}


	public ArrayList<String> getClasses() {
		return classes;
	}



	public boolean isPosGrad() {
		return posGrad;
	}




	public Departament getDepartment() {
		return department;
	}


	public void setDepartament(Departament department) {
		this.department = department;
	}
	
	
	
	
	

}

