package dataGenerators;

import java.util.ArrayList;

import administrative.Departament;
import personal.Student;

public class Main {

	public static void main(String[] args) {
		ArrayList<Departament>departament = new ArrayList<Departament>();
		
		departament = Generators.generateDepartments();	
		
		
		System.out.println(departament.get(1).getGradSec().reportIn());
		
		
	}

}
