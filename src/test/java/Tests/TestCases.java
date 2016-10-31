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
import administrative.Course;
import administrative.Departament;
import administrative.Secretary;
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
	
	@Test
	public void enrollTest2(){
		System.out.println("\nTeste de matrícula com créditos insuficientes:");
		Class estruturaDeDados = new Class("Esturtura de Dados", "INF 1620", 60, false, true, 30, "Marcus Poggi");
		Student student = new Student("Henrique de Souza Lira", 13210290, false, 0);
		
		Boolean enrolled = estruturaDeDados.enroll(student);
		
		assertEquals(false, enrolled);
	}
	
	@Test
	public void enrollTest3(){
		System.out.println("\nTeste de matrícula de um aluno já matriculado:");
		Class estruturaDeDados = new Class("Esturtura de Dados", "INF 1620", 60, false, true, 0, "Marcus Poggi");
		Student student = new Student("Henrique de Souza Lira", 13210290, false, 0);
		
		estruturaDeDados.enroll(student);
		
		Boolean enrolled = estruturaDeDados.enroll(student);
		
		assertEquals(false, enrolled);
	}
	
	@Test
	public void enrollTest4(){
		System.out.println("\nTeste de matrícula em uma disciplina não disponível:");
		Class estruturaDeDados = new Class("Esturtura de Dados", "INF 1620", 60, false, false, 0, "Marcus Poggi");
		Student student = new Student("Henrique de Souza Lira", 13210290, false, 0);
		
		Boolean enrolled = estruturaDeDados.enroll(student);
		
		assertEquals(false, enrolled);
	}
	
	@Test
	public void addPreRequisiteTest(){
		System.out.println("\nTeste de adição de pré-requisitos em uma disciplina:");
		Class estruturaDeDados = new Class("Esturtura de Dados", "INF 1620", 60, false, true, 0, "Marcus Poggi");
		Class estruturaDeDados2 = new Class("Esturtura de Dados 2", "INF 1621", 60, false, true, 0, "Marcus Poggi");
		
		Boolean isPreRequisitAdded = estruturaDeDados2.addPreRequisite(estruturaDeDados);
		
		assertEquals(true, isPreRequisitAdded);
	}
	
	@Test
	public void listRequisitesTest(){
		System.out.println("\nTeste de listagem de pré-requisitos de uma disciplina:");
		Class estruturaDeDados = new Class("Esturtura de Dados", "INF 1620", 60, false, true, 0, "Marcus Poggi");
		Class estruturaDeDados2 = new Class("Esturtura de Dados 2", "INF 1621", 60, false, true, 0, "Marcus Poggi");
		
		estruturaDeDados2.addPreRequisite(estruturaDeDados);
		
		String preRequisites = estruturaDeDados2.listRequisites();
		
		assertEquals("|INF 1620| ", preRequisites);
	}
	
	@Test
	public void coursePickClassTest(){
		System.out.println("\nCourse::pickClass() test:");
		Class estruturaDeDados = new Class("Esturtura de Dados", "INF 1620", 60, false, true, 0, "Marcus Poggi");
		Class estruturaDeDados2 = new Class("Esturtura de Dados 2", "INF 1621", 60, false, true, 0, "Marcus Poggi");
		
		ArrayList<Class> classes = new ArrayList<>();
		
		classes.add(estruturaDeDados);
		classes.add(estruturaDeDados2);
		
		Course info = new Course("Informática", classes);
		
		assertEquals(estruturaDeDados, info.pickClass(0));
	}
	
	@Test
	public void courseEnrollTest(){
		System.out.println("\nTeste de matrícula em um curso:");
		Class estruturaDeDados = new Class("Esturtura de Dados", "INF 1620", 60, false, true, 0, "Marcus Poggi");
		Class estruturaDeDados2 = new Class("Esturtura de Dados 2", "INF 1621", 60, false, true, 0, "Marcus Poggi");
		
		ArrayList<Class> classes = new ArrayList<>();
		
		classes.add(estruturaDeDados);
		classes.add(estruturaDeDados2);
		
		Student student = new Student("Henrique de Souza Lira", 13210290, false, 0);
		Course info = new Course("Informática", classes);
		
		info.enroll(student);
		
		Course course = Whitebox.getInternalState(student, "course");
		
		assertEquals(info, course);
	}
	
	@Test
	public void courseGetStudentsTest(){
		System.out.println("\nCourse::getStudents() test:");
		Class estruturaDeDados = new Class("Esturtura de Dados", "INF 1620", 60, false, true, 0, "Marcus Poggi");
		Student student = new Student("Henrique de Souza Lira", 13210290, false, 0);
		estruturaDeDados.enroll(student);
		
		ArrayList<Class> classes = new ArrayList<>();
		classes.add(estruturaDeDados);
		
		Course info = new Course("Informática", classes);
		
		assertEquals(student, info.getStudents().get(0));
	}
	
	@Test
	public void secretaryPickCourseTest(){
		System.out.println("\nSecretary::pickCourse() test:");
		Class estruturaDeDados = new Class("Esturtura de Dados", "INF 1620", 60, false, true, 0, "Marcus Poggi");
		Student student = new Student("Henrique de Souza Lira", 13210290, false, 0);
		estruturaDeDados.enroll(student);
		
		ArrayList<Class> classes = new ArrayList<>();
		classes.add(estruturaDeDados);
		
		Course info = new Course("Informática", classes);
		ArrayList<Course> courses = new ArrayList<>();
		courses.add(info);
		
		Secretary infoSecretary = new Secretary(false, courses);
		
		assertEquals(info, infoSecretary.pickCourse(0));
	}
	
	@Test
	public void secretaryGetStudentsTest(){
		System.out.println("\nSecretary::getStudents() test:");
		Class estruturaDeDados = new Class("Esturtura de Dados", "INF 1620", 60, false, true, 0, "Marcus Poggi");
		Student student = new Student("Henrique de Souza Lira", 13210290, false, 0);
		estruturaDeDados.enroll(student);
		
		ArrayList<Class> classes = new ArrayList<>();
		classes.add(estruturaDeDados);
		
		Course info = new Course("Informática", classes);
		ArrayList<Course> courses = new ArrayList<>();
		courses.add(info);
		
		Secretary infoSecretary = new Secretary(false, courses);
		
		ArrayList<Student> students = infoSecretary.getStudents();
		
		assertEquals(student, students.get(0));
	}
	
	@Test
	public void departamentHasStudentsTest(){
		System.out.println("\nDepartment::hasStudents() test:");
		Class estruturaDeDados = new Class("Esturtura de Dados", "INF 1620", 60, false, true, 0, "Marcus Poggi");
		Student student = new Student("Henrique de Souza Lira", 13210290, false, 0);
		estruturaDeDados.enroll(student);
		
		ArrayList<Class> classes = new ArrayList<>();
		classes.add(estruturaDeDados);
		
		Course info = new Course("Informática", classes);
		ArrayList<Course> courses = new ArrayList<>();
		courses.add(info);
		
		Secretary infoSecretary = new Secretary(false, courses);
		Secretary infoPosSecretary = new Secretary(true, courses);
		
		Departament department = new Departament("Departamento I", 0, infoSecretary, infoPosSecretary);
		department.register(student);
		
		assertEquals(true, department.hasStudents());
	}
	
	@Test
	public void departamentHasStudentsTest2(){
		System.out.println("\nDepartment::hasStudents() test 2:");
		Class estruturaDeDados = new Class("Esturtura de Dados", "INF 1620", 60, false, true, 0, "Marcus Poggi");
		Student student = new Student("Henrique de Souza Lira", 13210290, false, 0);
		estruturaDeDados.enroll(student);
		
		ArrayList<Class> classes = new ArrayList<>();
		classes.add(estruturaDeDados);
		
		Course info = new Course("Informática", classes);
		ArrayList<Course> courses = new ArrayList<>();
		courses.add(info);
		
		Secretary infoSecretary = new Secretary(false, courses);
		Secretary infoPosSecretary = new Secretary(true, courses);
		
		Departament department = new Departament("Departamento I", 0, infoSecretary, infoPosSecretary);
		
		assertEquals(false, department.hasStudents());
	}
	
	@Test
	public void departamentPickStudentTest(){
		System.out.println("\nDepartment::pickStudent() test:");
		Class estruturaDeDados = new Class("Esturtura de Dados", "INF 1620", 60, false, true, 0, "Marcus Poggi");
		Student student = new Student("Henrique de Souza Lira", 13210290, false, 0);
		estruturaDeDados.enroll(student);
		
		ArrayList<Class> classes = new ArrayList<>();
		classes.add(estruturaDeDados);
		
		Course info = new Course("Informática", classes);
		ArrayList<Course> courses = new ArrayList<>();
		courses.add(info);
		
		Secretary infoSecretary = new Secretary(false, courses);
		Secretary infoPosSecretary = new Secretary(true, courses);
		
		Departament department = new Departament("Departamento I", 0, infoSecretary, infoPosSecretary);
		department.register(student);
		
		assertEquals(student, department.pickStudent(0));
	}
	
	public void departamentPickStudentTest2(){
		System.out.println("\nDepartment::pickStudent() com número invalido (-1):");
		Class estruturaDeDados = new Class("Esturtura de Dados", "INF 1620", 60, false, true, 0, "Marcus Poggi");
		Student student = new Student("Henrique de Souza Lira", 13210290, false, 0);
		estruturaDeDados.enroll(student);
		
		ArrayList<Class> classes = new ArrayList<>();
		classes.add(estruturaDeDados);
		
		Course info = new Course("Informática", classes);
		ArrayList<Course> courses = new ArrayList<>();
		courses.add(info);
		
		Secretary infoSecretary = new Secretary(false, courses);
		Secretary infoPosSecretary = new Secretary(true, courses);
		
		Departament department = new Departament("Departamento I", 0, infoSecretary, infoPosSecretary);
		department.register(student);
		
		assertEquals(null, department.pickStudent(-1));
	}
	
	public void departamentPickStudentTest3(){
		System.out.println("\nDepartment::pickStudent() com número invalido (1):");
		Class estruturaDeDados = new Class("Esturtura de Dados", "INF 1620", 60, false, true, 0, "Marcus Poggi");
		Student student = new Student("Henrique de Souza Lira", 13210290, false, 0);
		estruturaDeDados.enroll(student);
		
		ArrayList<Class> classes = new ArrayList<>();
		classes.add(estruturaDeDados);
		
		Course info = new Course("Informática", classes);
		ArrayList<Course> courses = new ArrayList<>();
		courses.add(info);
		
		Secretary infoSecretary = new Secretary(false, courses);
		Secretary infoPosSecretary = new Secretary(true, courses);
		
		Departament department = new Departament("Departamento I", 0, infoSecretary, infoPosSecretary);
		department.register(student);
		
		assertEquals(null, department.pickStudent(1));
	}
	
	public void departamentPickStudentTest4(){
	System.out.println("\nDepartment::pickStudent() com número invalido (2):");
	Class estruturaDeDados = new Class("Esturtura de Dados", "INF 1620", 60, false, true, 0, "Marcus Poggi");
	Student student = new Student("Henrique de Souza Lira", 13210290, false, 0);
	estruturaDeDados.enroll(student);
	
	ArrayList<Class> classes = new ArrayList<>();
	classes.add(estruturaDeDados);
	
	Course info = new Course("Informática", classes);
	ArrayList<Course> courses = new ArrayList<>();
	courses.add(info);
	
	Secretary infoSecretary = new Secretary(false, courses);
	Secretary infoPosSecretary = new Secretary(true, courses);
	
	Departament department = new Departament("Departamento I", 0, infoSecretary, infoPosSecretary);
	department.register(student);
	
	assertEquals(null, department.pickStudent(2));
}
	
	@Test
	public void departamentGetStudentsTest(){
		System.out.println("\nDepartment::getStudents() test:");
		Class estruturaDeDados = new Class("Esturtura de Dados", "INF 1620", 60, false, true, 0, "Marcus Poggi");
		Student student = new Student("Henrique de Souza Lira", 13210290, false, 0);
		estruturaDeDados.enroll(student);
		
		ArrayList<Class> classes = new ArrayList<>();
		classes.add(estruturaDeDados);
		
		Course info = new Course("Informática", classes);
		ArrayList<Course> courses = new ArrayList<>();
		courses.add(info);
		
		Secretary infoSecretary = new Secretary(false, courses);
		Secretary infoPosSecretary = new Secretary(true, courses);
		
		Departament department = new Departament("Departamento I", 0, infoSecretary, infoPosSecretary);
		department.register(student);
		
		assertEquals(student, department.getStudents().get(0));
	}
	
	@Test
	public void departamentListStudentsTest(){
		System.out.println("\nDepartment::listStudents() test:");
		Class estruturaDeDados = new Class("Esturtura de Dados", "INF 1620", 60, false, true, 0, "Marcus Poggi");
		Student student = new Student("Henrique de Souza Lira", 13210290, false, 0);
		estruturaDeDados.enroll(student);
		
		ArrayList<Class> classes = new ArrayList<>();
		classes.add(estruturaDeDados);
		
		Course info = new Course("Informática", classes);
		ArrayList<Course> courses = new ArrayList<>();
		courses.add(info);
		
		Secretary infoSecretary = new Secretary(false, courses);
		Secretary infoPosSecretary = new Secretary(true, courses);
		
		Departament department = new Departament("Departamento I", 0, infoSecretary, infoPosSecretary);
		department.register(student);
		
		assertEquals(1, department.listStudents());
	}
	
	@Test
	public void departamentRegisterTest(){
		System.out.println("\nTeste de matrícula em um departamento de um estudante já matriculado:");
		Class estruturaDeDados = new Class("Esturtura de Dados", "INF 1620", 60, false, true, 0, "Marcus Poggi");
		Student student = new Student("Henrique de Souza Lira", 13210290, false, 0);
		estruturaDeDados.enroll(student);
		
		ArrayList<Class> classes = new ArrayList<>();
		classes.add(estruturaDeDados);
		
		Course info = new Course("Informática", classes);
		ArrayList<Course> courses = new ArrayList<>();
		courses.add(info);
		
		Secretary infoSecretary = new Secretary(false, courses);
		Secretary infoPosSecretary = new Secretary(true, courses);
		
		Departament department = new Departament("Departamento I", 0, infoSecretary, infoPosSecretary);
		department.register(student);
		
		assertEquals(false, department.register(student));
	}
	
	public void departamentRegisterTest2(){
		System.out.println("\nTeste de matrícula em um departamento com outro estudante já matriculado:");
		Class estruturaDeDados = new Class("Esturtura de Dados", "INF 1620", 60, false, true, 0, "Marcus Poggi");
		Student student = new Student("Henrique de Souza Lira", 13210290, false, 0);
		Student student2 = new Student("Naelson Cirilo", -1, false, 0);
		estruturaDeDados.enroll(student);
		estruturaDeDados.enroll(student2);
		
		ArrayList<Class> classes = new ArrayList<>();
		classes.add(estruturaDeDados);
		
		Course info = new Course("Informática", classes);
		ArrayList<Course> courses = new ArrayList<>();
		courses.add(info);
		
		Secretary infoSecretary = new Secretary(false, courses);
		Secretary infoPosSecretary = new Secretary(true, courses);
		
		Departament department = new Departament("Departamento I", 0, infoSecretary, infoPosSecretary);
		department.register(student);
		
		assertEquals(false, department.register(student2));
	}
	
}
