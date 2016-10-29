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
	protected Set<Class> prerequisites;	
	protected String teacher;	
	protected ArrayList<Student> students;
	
	
	
	
	public Class(String name, String iD, int credits, boolean isElective, boolean isAvailable, int minCredits,
			Set<Class> prerequisites, String teacher) {
		this.name = name;
		ID = iD;
		this.credits = credits;
		this.isElective = isElective;
		this.isAvailable = isAvailable;
		this.minCredits = minCredits;
		this.prerequisites = prerequisites;
		this.teacher = teacher;
		this.students = new ArrayList<Student>();
	}
	
	
	public boolean enroll(Student student){
		
		for (String i : student.getClasses()){
			if (this.name.equals(i)){
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
		output = "Nome: " + name + "\n" + "Código: " + ID + "\n" + "Créditos: " + Integer.toString(credits) + "\n" + "Eletiva: " + booleanToSimNao(isElective()) + "\n" +
		"Disponível: " + booleanToSimNao(isAvailable()) + "\n" + "Créditos necessários: " + Integer.toString(getMinCredits()) + "\n"+"TODO PREREQUISITOS" + "\n" + "Professor: " + getTeacher() + "\n\n";
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

	public void setName(String name) {
		this.name = name;
	}
	
	

	public Course getCourse() {
		return course;
	}


	public void setCourse(Course course) {
		this.course = course;
	}


	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public boolean isElective() {
		return isElective;
	}

	public void setElective(boolean isElective) {
		this.isElective = isElective;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public int getMinCredits() {
		return minCredits;
	}

	public void setMinCredits(int minCredits) {
		this.minCredits = minCredits;
	}

	public Set<Class> getPrerequisites() {
		return prerequisites;
	}

	public void setPrerequisites(Set<Class> prerequisites) {
		this.prerequisites = prerequisites;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

}

