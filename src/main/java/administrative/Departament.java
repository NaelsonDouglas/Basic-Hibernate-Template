package administrative;

import java.util.ArrayList;

import personal.*;
public class Departament {
	
	protected String name;
	protected int ID;
	
	protected Secretary gradSec;
	protected Secretary posGradSec;
	protected ArrayList<Student> students;

	public Departament(String name, int iD, Secretary gradSec, Secretary posGradSec) {
		super();
		this.name = name;
		ID = iD;
		this.gradSec = gradSec;
		this.posGradSec = posGradSec;
		
		this.gradSec.setDepartment(this);
		this.posGradSec.setDepartment(this);
		students = new ArrayList<Student>();
	}
	
	
	public Student pickStudent(int i){
		if (i < 0 || i >= students.size()){
			System.out.println("Número inválido\n");
			return null;
		}
		return students.get(i);
	}
	
	public ArrayList<Student> getStudents(){
		ArrayList<Student> students = new ArrayList<Student>();
		
		
		students.addAll(gradSec.getStudents());
		students.addAll(posGradSec.getStudents());
		
		
		return students;
		
	}
	
	public boolean register(Student student){
		String studentName = student.getName();
		
		for (Student i : students){
			if (studentName.equals(i.getName())){
				System.out.println("Aluno já possui matrícula\n");
				return false;
			}
		}
		
		students.add(student);
		return true;
	}
	
	
	public String reportGradIn(){
		return gradSec.reportIn();
	}
	
	public String reportPosGradIn(){
		return posGradSec.reportIn();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public Secretary getGradSec() {
		return gradSec;
	}

	public void setGradSec(Secretary gradSec) {
		this.gradSec = gradSec;
	}

	public Secretary getPosGradSec() {
		return posGradSec;
	}

	public void setPosGradSec(Secretary posGradSec) {
		this.posGradSec = posGradSec;
	}
	
	public String toString() {
		String output = this.name + ":\n" + "Secretaria de gradua��o:\n" + gradSec.toString() +
				"Secretaria de p�s-gradua��o:\n" + posGradSec.toString();
		
		return output;
	}

	
}

