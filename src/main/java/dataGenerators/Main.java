package dataGenerators;

import java.util.ArrayList;

import administrative.Departament;
import personal.Student;

public class Main {

	public static void main(String[] args) {
		ArrayList<Departament>departaments = new ArrayList<Departament>();
		
		departaments = Generators.generateDepartments();	
		
		
		System.out.println(departaments.get(1).pickStudent(2).reportIn());
		
		
		
		ArrayList<Student> students = departaments.get(0).getStudents();
		System.out.println(students.size());
		
	}

}
