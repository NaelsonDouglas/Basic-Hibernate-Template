package dataGenerators;

import java.util.ArrayList;

import administrative.Departament;
import personal.Student;

public class Main {

	public static void main(String[] args) {
		ArrayList<Departament>departament = new ArrayList<Departament>();
		
		departament = Generators.generateDepartments();	
		
		
		
		ArrayList<Student> students = departament.get(1).getStudents();
		System.out.println(students.get(1).reportIn());
		
	}

}
