package administrative;
import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import personal.Student;
import personal.Teacher;

public class Class {
	
	protected String name;	
	protected String ID;	
	protected int credits;	
	protected boolean isElective;	
	protected boolean isAvailable;	
	protected int minCredits;	
	protected Course course;
	protected ArrayList<Class> prerequisites;	
	protected String teacher;	
	protected ArrayList<Student> students;
	
	
	
	
	public Class(String name, String iD, int credits, boolean isElective, boolean isAvailable, int minCredits, String teacher) {
		this.name = name;
		ID = iD;
		this.credits = credits;
		this.isElective = isElective;
		this.isAvailable = isAvailable;
		this.minCredits = minCredits;
		this.prerequisites = new ArrayList<Class>();
		this.teacher = teacher;
		this.students = new ArrayList<Student>();
	}
	
	public boolean addPreRequisite(Class requisite){
		prerequisites.add(requisite);
		return true;
	}
	
	public String listRequisites(){
		String output = "|";
		for (Class i: prerequisites){
			output = output+i.getID()+"| ";
		}
		return output;
	}
	
	public boolean enroll(Student student){
		
		for (String i : student.getClasses()){
			if (this.name.equals(i)){
				System.out.println("Aluno(a) já está matriculado(a) na disciplina");
				return false;
			}
		}
		
		
		System.out.println(name);
		if (!this.isAvailable){
			System.out.println("Disciplina não disponível\n");
			return false;
		}
		
		if (student.getCredits() < minCredits){
			System.out.println("Aluno"+student.getName()+" não tem os requisitos mínimos para ingressar na disciplina\nAluno possui "+Integer.toString(student.getCredits())+"créditos"+"\n"+
		"E o mínimo da disciplina é de "+getMinCredits());
			return false;
		}
		
		students.add(student);
		student.addClass(getName());
		System.out.println("Aluno matriculado com sucesso\n\n");	
		
		return true;
	}

	public String reportIn(){
		if(isAvailable()){
			return toString();
		} else {
			return "";
		}
	}
	
	
	public String toString(){
		String output = "";
		String studentsList ="";
		for (Student i:students){
			studentsList = studentsList+i.getName()+" | ";
		}
		output = "Nome: " + name + "\n" + 
		"Código: " + ID +"\n" + 
		"Créditos: " + Integer.toString(credits) +	"\n" +
		"Eletiva: " +
		booleanToSimNao(isElective()) +"\n" +
		"Disponível: " + booleanToSimNao(isAvailable()) + "\n" +
		"Créditos necessários: " + Integer.toString(getMinCredits()) + "\n"+
		"Pre-requisitos: "+listRequisites() +
		"\n" + "Professor: " + getTeacher() + "\n"+
		"Matriculado(a)s: "+studentsList+"\n\n";
		return output;		
		
	}
	
	
	private String booleanToSimNao(boolean bool){
		if (bool){
			return "Sim";
		} else {
			return "Não";
		}
	}

	public String getName() {
		return name;
	}

	
	



	public void setCourse(Course course) {
		this.course = course;
	}


	public String getID() {
		return ID;
	}


	public int getCredits() {
		return credits;
	}


	public boolean isElective() {
		return isElective;
	}


	public boolean isAvailable() {
		return isAvailable;
	}


	public int getMinCredits() {
		return minCredits;
	}




	public String getTeacher() {
		return teacher;
	}


	public ArrayList<Student> getStudents() {
		return students;
	}


}

