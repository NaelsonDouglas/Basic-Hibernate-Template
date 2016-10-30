package Tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.powermock.reflect.Whitebox;

import administrative.Class;
import personal.Person;
import personal.Student;

public class TestCases {
	
	@BeforeClass
	public static void setUpClass() {
		//System.out.println("setUpClass");
	}
	
	@AfterClass
	public static void tearDownClass() {
		//System.out.println("tearDownClass");
	}
	
    public TestCases()
    {
		//System.out.println("Constructor");
    }
    
	@Before
	public void setUp() {
		//System.out.println("setUp");
	}
	
	@After
	public void tearDown() {
		//System.out.println("tearDown");
	}

	@Test
	public void enrollTest() {
		System.out.println("Teste de matrícula em uma disciplina:");
		Class estruturaDeDados = new Class("Esturtura de Dados", "INF 1620", 60, false, true, 0, "Marcus Poggi");
		Student student = new Student("Henrique de Souza Lira", 13210290, false, 0);
		
		estruturaDeDados.enroll(student);
		
		ArrayList<Student> students = Whitebox.getInternalState(estruturaDeDados, "students");
		
		assertEquals("Aluno não encontrado.", student, students.get(0));
	}
	
//	@Test
//	public void {
//		
//	}

}
