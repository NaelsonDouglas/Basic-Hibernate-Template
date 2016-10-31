package administrative;

import java.util.ArrayList;

import dataGenerators.Main;
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
	
	
	public boolean enroll(Student student){
		if (student.isPosGrad()){
			posGradSec.enroll(student);
		} else {
			gradSec.enroll(student);
		}
		return true;
	}
	
	public Student pickStudent(){
		listStudents();
		int selector = Main.readInt(0, students.size());
		return students.get(selector);		
	}
	
	public boolean hasStudents(){
		if (students.size()>0){
			return true;
		}
		
		return false;
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
	
	
	public int listStudents(){
		for (int i=0; i<students.size(); i++){
			System.out.println(i+" - "+students.get(i).getName());
		}
		return students.size();
	}
	
	public boolean register(Student student){
		String studentName = student.getName();
		
		for (Student i : students){
			if (studentName.equals(i.getName())){
				System.out.println("Aluno já possui matrícula\n");
				return false;
			}
		}
		
		if (student.getID() == -1){
			String deptID =  Integer.toString(this.ID);		
			int studentID = Integer.parseInt(deptID+"0");		
			
			if (students.size() > 0){
				String lastStudentID = Integer.toString(this.students.size()); 
				studentID = Integer.parseInt(deptID+lastStudentID);
			}
			student.setID(studentID);
			students.add(student);		
		}
		student.setDepartament(this);
		System.out.println("Aluno "+student.getName()+" registrado(a) com a matrícula: "+student.getID());
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

