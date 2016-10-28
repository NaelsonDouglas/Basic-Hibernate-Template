package administrative;
import java.awt.List;
import java.util.Set;

import personal.Student;
import personal.Teacher;



public class Class
{
	
	protected String name;	
	protected String ID;	
	protected int credits;	
	protected boolean isElective;	
	protected boolean isAvailable;	
	protected int minCredits;	
	protected Set<Class> prerequisites;	
	protected String teacher;	
	protected Set<Student> students;
	
	
	
	public String toString(){
		String output="";
		output = "Nome: "+name+"\n"+"Código: "+ID+"\n"+"Créditos: "+Integer.toString(credits)+"\n"+"Eletiva: "+booleanToSimNao(isElective())+"\n"+
		"Disponível: "+booleanToSimNao(isAvailable())+"\n"+"Créditos necessários: "+Integer.toString(getMinCredits())+"\n"+"TODO PREREQUISITOS"+"\n"+"Professor: "+getTeacher()+"\n";
		return output;		
		
	}
	
	private String booleanToSimNao(boolean bool){
		if (bool){
			return "Sim";
		} else {
			return "Não";
		}
	}

	public Class(){
		super();
	}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
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





	public Set<Student> getStudents() {
		return students;
	}





	public void setStudents(Set<Student> students) {
		this.students = students;
	}





	public Class(String name, String iD, int credits, boolean isElective, boolean isAvailable, int minCredits,
			Set<Class> prerequisites, String teacher, Set<Student> students) {
		super();
		this.name = name;
		ID = iD;
		this.credits = credits;
		this.isElective = isElective;
		this.isAvailable = isAvailable;
		this.minCredits = minCredits;
		this.prerequisites = prerequisites;
		this.teacher = teacher;
		this.students = students;
	}
	
	
	

}

