package Tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
import org.powermock.reflect.Whitebox;

import administrative.Class;
import personal.Person;
import personal.Student;

public class TestCases {

	@Test
	public void test() {
		System.out.println("Teste de matrícula em uma disciplina:");
		Class estruturaDeDados = new Class("Esturtura de Dados", "INF 1620", 60, false, true, 0, null, "Marcus Poggi");
		Student student = new Student("Henrique de Souza Lira", 13210290, 0);
		
		estruturaDeDados.enroll(student);
		
		ArrayList<Student> students = Whitebox.getInternalState(estruturaDeDados, "students");
		
		int credits = Whitebox.getInternalState(estruturaDeDados, "credits");
		
		assertEquals("Número de créditos não corresponde.", 60, credits);
	}

}
