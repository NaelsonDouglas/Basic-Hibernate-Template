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
	protected Teacher teacher;	
	protected Set<Student> students;
	
	
	
	

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





	public Teacher getTeacher() {
		return teacher;
	}





	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}





	public Set<Student> getStudents() {
		return students;
	}





	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	

}

