package dataGenerators;

import java.util.ArrayList;
import java.util.Scanner;

import administrative.Departament;
import personal.Student;

public class Main {
	static ArrayList<Departament>departaments = new ArrayList<Departament>();
	
	public static void main(String[] args) {
		
		
		departaments = Generators.generateDepartments();	
		
		while(true){
			int selector = -1;
			System.out.println("---------------------------------");
			
			System.out.println("---------------------------------");
			System.out.println("Selecione a opção desejada");
			System.out.println("1 - Registrar um novo aluno em um departamento");
			System.out.println("2 - Matricular aluno em disciplina");
			System.out.println("3 - Consultas");
			selector = readInt(1, 3);
			
			if (selector == 1){
				Departament department = pickDepartment();				
				department.register(Student.registerStudent());			
			} else if (selector == 2){
				Departament department = pickDepartment();
				int numberOfStudents = department.listStudents();
				int innerSelector = readInt(0, numberOfStudents) ;
				Student student = department.pickStudent(innerSelector);
				
				student.getDepartment().enroll(student);
				
				
				
				
			}
			
			
			
			
			
			//break;
		}
		
		
		
		
	//	ArrayList<Student> students = departaments.get(0).getStudents();
		
	}
	
	
	public static Departament pickDepartment(){
		
		System.out.println("Selecione um departamento: ");
		for (int i = 0;  i<departaments.size(); i++){
			System.out.println(i+" - "+departaments.get(i).getName());
		}
		
		
		int selector = readInt(0, departaments.size()-1);
		return departaments.get(selector);		
	}
	
	
	
	
	
	public static int readInt(int min, int max){
		Scanner scan = new Scanner(System.in);
		int input = min-1;
		
		try {
			input = scan.nextInt();
		} catch (Exception e) {
			System.out.print("Valor inválido");
			input = scan.nextInt();
		}
		while(input < min || input > max){
		
			System.out.print("O valor deve ficar entre "+min+" e "+max);
			
			try {
				input = scan.nextInt();
			} catch (Exception e) {
			}
		}
		return input;	
	}

}
