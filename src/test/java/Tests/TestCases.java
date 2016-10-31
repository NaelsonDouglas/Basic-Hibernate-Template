package Tests;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

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
import dataGenerators.Generators;
import dataGenerators.Main;
import personal.Person;
import personal.Student;
import personal.Teacher;

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
	public void classEnrollTest() {
		System.out.println("Teste de matr�cula em uma disciplina:");
		Class estruturaDeDados = new Class("Esturtura de Dados", "INF 1620", 60, false, true, 0, "Marcus Poggi");
		Student student = new Student("Henrique de Souza Lira", 13210290, false, 0);
		
		estruturaDeDados.enroll(student);
		
		ArrayList<Student> students = Whitebox.getInternalState(estruturaDeDados, "students");
		
		assertEquals("Aluno n�o encontrado.", student, students.get(0));
	}
	
	
	
	@Test
	public void classEnrollTest2(){
		System.out.println("\nTeste de matr�cula com cr�ditos insuficientes:");
		Class estruturaDeDados = new Class("Esturtura de Dados", "INF 1620", 60, false, true, 30, "Marcus Poggi");
		Student student = new Student("Henrique de Souza Lira", 13210290, false, 0);
		
		Boolean enrolled = estruturaDeDados.enroll(student);
		
		assertEquals(false, enrolled);
	}
	
	@Test
	public void ClassenrollTest3(){
		System.out.println("\nTeste de matr�cula de um aluno j� matriculado:");
		Class estruturaDeDados = new Class("Esturtura de Dados", "INF 1620", 60, false, true, 0, "Marcus Poggi");
		Student student = new Student("Henrique de Souza Lira", 13210290, false, 0);
		
		estruturaDeDados.enroll(student);
		
		Boolean enrolled = estruturaDeDados.enroll(student);
		
		assertEquals(false, enrolled);
	}
	
	@Test
	public void classEnrollTest4(){
		System.out.println("\nTeste de matr�cula em uma disciplina n�o dispon�vel:");
		Class estruturaDeDados = new Class("Esturtura de Dados", "INF 1620", 60, false, false, 0, "Marcus Poggi");
		Student student = new Student("Henrique de Souza Lira", 13210290, false, 0);
		
		Boolean enrolled = estruturaDeDados.enroll(student);
		
		assertEquals(false, enrolled);
	}
	
	@Test
	public void classAddPreRequisiteTest(){
		System.out.println("\nTeste de adi��o de pr�-requisitos em uma disciplina:");
		Class estruturaDeDados = new Class("Esturtura de Dados", "INF 1620", 60, false, true, 0, "Marcus Poggi");
		Class estruturaDeDados2 = new Class("Esturtura de Dados 2", "INF 1621", 60, false, true, 0, "Marcus Poggi");
		
		Boolean isPreRequisitAdded = estruturaDeDados2.addPreRequisite(estruturaDeDados);
		
		assertEquals(true, isPreRequisitAdded);
	}
	@Test 
	public void classToStringTest(){
		Departament departament = Generators.generateDepartments().get(0);
		
		Class studentClass =  departament.getGradsec().getCourses().get(0).getClasses().get(0);
		
		Student student = new Student("eu", 1,false, 60000);
		studentClass.enroll(student);
		String classContent =  studentClass.toString();
		
		String tolken1 = "Créditos";
		String tolken2 = "Eletiva";
		String tolken3 = "Professor";
		
		boolean comparationTk1 = classContent.toLowerCase().contains(tolken1.toLowerCase());
		boolean comparationTk2 = classContent.toLowerCase().contains(tolken2.toLowerCase());
		boolean comparationTk3 = classContent.toLowerCase().contains(tolken3.toLowerCase());
		
		assertEquals(true, comparationTk1);
		assertEquals(true, comparationTk2);
		assertEquals(true, comparationTk3);




	
	}
	
	
	
	@Test
	public void classListRequisitesTest(){
		System.out.println("\nTeste de listagem de pr�-requisitos de uma disciplina:");
		Class estruturaDeDados = new Class("Esturtura de Dados", "INF 1620", 60, false, true, 0, "Marcus Poggi");
		Class estruturaDeDados2 = new Class("Esturtura de Dados 2", "INF 1621", 60, false, true, 0, "Marcus Poggi");
		
		estruturaDeDados2.addPreRequisite(estruturaDeDados);
		
		String preRequisites = estruturaDeDados2.listRequisites();
		
		assertEquals("|INF 1620| ", preRequisites);
	}
	
	
	@Test
	public void courseListClassesTest(){
	 ArrayList<Departament> dpts = Generators.generateDepartments();
	 Course course = dpts.get(0).getGradsec().getCourses().get(0);
	 assertEquals(course.listClasses(),true);
	 
	}
	@Test
	public void coursePickClassTest(){
		System.out.println("\nCourse::pickClass() test:");
		Class estruturaDeDados = new Class("Esturtura de Dados", "INF 1620", 60, false, true, 0, "Marcus Poggi");
		Class estruturaDeDados2 = new Class("Esturtura de Dados 2", "INF 1621", 60, false, true, 0, "Marcus Poggi");
		
		ArrayList<Class> classes = new ArrayList<>();
		
		classes.add(estruturaDeDados);
		classes.add(estruturaDeDados2);
		
		Course info = new Course("Inform�tica", classes);
		
		assertEquals(estruturaDeDados, info.pickClass(0));
	}
	
	@Test
	public void courseEnrollTest(){
		System.out.println("\nTeste de matr�cula em um curso:");
		Class estruturaDeDados = new Class("Esturtura de Dados", "INF 1620", 60, false, true, 0, "Marcus Poggi");
		Class estruturaDeDados2 = new Class("Esturtura de Dados 2", "INF 1621", 60, false, true, 0, "Marcus Poggi");
		
		ArrayList<Class> classes = new ArrayList<>();
		
		classes.add(estruturaDeDados);
		classes.add(estruturaDeDados2);
		
		Student student = new Student("Henrique de Souza Lira", 13210290, false, 0);
		Course info = new Course("Inform�tica", classes);
		
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
		
		Course info = new Course("Inform�tica", classes);
		
		assertEquals(student, info.getStudents().get(0));
	}
	/*
	@Test
	public void secretaryEnroll(){
		ArrayList<Course> courses = new ArrayList<Course>();
		ArrayList<Class> classes = new ArrayList<Class>();
		Class english = new Class("English", "1", 0, false, true, 0, "Me");
		Class portuguese = new Class("Portuguese", "1", 0, false, true, 0, "Me");
		classes.add(english);
		classes.add(portuguese);
		Course  course = new Course("Course", classes);
		Course  course2 = new Course("Course2", classes);	
		courses.add(course);
		courses.add(course2);
		Secretary secretary = new Secretary(false, courses);
		Student student = new Student("Eu", 1, false, 0);
		
		InputStream stdin = System.in;
		try {
			  String input = "1\n"+System.getProperty("line.separator")+"1";
			  System.setIn(new ByteArrayInputStream(input.getBytes()));
			  Scanner scanner = new Scanner(System.in);
			  secretary.enroll(student);
			  
			} finally {
			  System.setIn(stdin);
			}
			
		
	}
	*/
	
	@Test
	public void secretaryPickCourseTest(){
		System.out.println("\nSecretary::pickCourse() test:");
		Class estruturaDeDados = new Class("Esturtura de Dados", "INF 1620", 60, false, true, 0, "Marcus Poggi");
		Student student = new Student("Henrique de Souza Lira", 13210290, false, 0);
		estruturaDeDados.enroll(student);
		
		ArrayList<Class> classes = new ArrayList<>();
		classes.add(estruturaDeDados);
		
		Course info = new Course("Inform�tica", classes);
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
		
		Course info = new Course("Inform�tica", classes);
		ArrayList<Course> courses = new ArrayList<>();
		courses.add(info);
		
		Secretary infoSecretary = new Secretary(false, courses);
		
		ArrayList<Student> students = infoSecretary.getStudents();
		
		assertEquals(student, students.get(0));
	}
	
	@Test
	public void secretaryToString(){
		
		Course portuguese = new Course("Portugês", new ArrayList<Class>());
		Course english = new Course("English", new ArrayList<Class>());
		ArrayList<Course> courses = new ArrayList<Course>();
		courses.add(portuguese);
		courses.add(english);
		
		Secretary secretary = new Secretary(false, courses);
		String a = secretary.toString();
		
		
	}
	
	
	
	@Test
	public void departamentHasStudentsTest(){
		System.out.println("\nDepartment::hasStudents() test:");
		Class estruturaDeDados = new Class("Esturtura de Dados", "INF 1620", 60, false, true, 0, "Marcus Poggi");
		Student student = new Student("Henrique de Souza Lira", 13210290, false, 0);
		estruturaDeDados.enroll(student);
		
		ArrayList<Class> classes = new ArrayList<>();
		classes.add(estruturaDeDados);
		
		Course info = new Course("Inform�tica", classes);
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
		
		Course info = new Course("Inform�tica", classes);
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
		
		Course info = new Course("Inform�tica", classes);
		ArrayList<Course> courses = new ArrayList<>();
		courses.add(info);
		
		Secretary infoSecretary = new Secretary(false, courses);
		Secretary infoPosSecretary = new Secretary(true, courses);
		
		Departament department = new Departament("Departamento I", 0, infoSecretary, infoPosSecretary);
		department.register(student);
		
		assertEquals(student, department.pickStudent(0));
	}
	
	@Test
	public void departamentPickStudentTest2(){
		System.out.println("\nDepartment::pickStudent() com n�mero invalido (-1):");
		Class estruturaDeDados = new Class("Esturtura de Dados", "INF 1620", 60, false, true, 0, "Marcus Poggi");
		Student student = new Student("Henrique de Souza Lira", 13210290, false, 0);
		estruturaDeDados.enroll(student);
		
		ArrayList<Class> classes = new ArrayList<>();
		classes.add(estruturaDeDados);
		
		Course info = new Course("Inform�tica", classes);
		ArrayList<Course> courses = new ArrayList<>();
		courses.add(info);
		
		Secretary infoSecretary = new Secretary(false, courses);
		Secretary infoPosSecretary = new Secretary(true, courses);
		
		Departament department = new Departament("Departamento I", 0, infoSecretary, infoPosSecretary);
		department.register(student);
		
		assertEquals(null, department.pickStudent(-1));
	}
	
	@Test
	public void departamentPickStudentTest3(){
		System.out.println("\nDepartment::pickStudent() com n�mero invalido (1):");
		Class estruturaDeDados = new Class("Esturtura de Dados", "INF 1620", 60, false, true, 0, "Marcus Poggi");
		Student student = new Student("Henrique de Souza Lira", 13210290, false, 0);
		estruturaDeDados.enroll(student);
		
		ArrayList<Class> classes = new ArrayList<>();
		classes.add(estruturaDeDados);
		
		Course info = new Course("Inform�tica", classes);
		ArrayList<Course> courses = new ArrayList<>();
		courses.add(info);
		
		Secretary infoSecretary = new Secretary(false, courses);
		Secretary infoPosSecretary = new Secretary(true, courses);
		
		Departament department = new Departament("Departamento I", 0, infoSecretary, infoPosSecretary);
		department.register(student);
		
		assertEquals(null, department.pickStudent(1));
	}
	
	@Test
	public void departamentPickStudentTest4(){
		System.out.println("\nDepartment::pickStudent() com n�mero invalido (2):");
		Class estruturaDeDados = new Class("Esturtura de Dados", "INF 1620", 60, false, true, 0, "Marcus Poggi");
		Student student = new Student("Henrique de Souza Lira", 13210290, false, 0);
		estruturaDeDados.enroll(student);
		
		ArrayList<Class> classes = new ArrayList<>();
		classes.add(estruturaDeDados);
		
		Course info = new Course("Inform�tica", classes);
		ArrayList<Course> courses = new ArrayList<>();
		courses.add(info);
		
		Secretary infoSecretary = new Secretary(false, courses);
		Secretary infoPosSecretary = new Secretary(true, courses);
		
		Departament department = new Departament("Departamento I", 0, infoSecretary, infoPosSecretary);
		department.register(student);
		
		assertEquals(null, department.pickStudent(1));
	}
	
	@Test
	public void departamentGetStudentsTest(){
		System.out.println("\nDepartment::getStudents() test:");
		Class estruturaDeDados = new Class("Esturtura de Dados", "INF 1620", 60, false, true, 0, "Marcus Poggi");
		Student student = new Student("Henrique de Souza Lira", 13210290, false, 0);
		estruturaDeDados.enroll(student);
		
		ArrayList<Class> classes = new ArrayList<>();
		classes.add(estruturaDeDados);
		
		Course info = new Course("Inform�tica", classes);
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
		
		Course info = new Course("Inform�tica", classes);
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
		System.out.println("\nTeste de matr�cula em um departamento de um estudante j� matriculado:");
		Class estruturaDeDados = new Class("Esturtura de Dados", "INF 1620", 60, false, true, 0, "Marcus Poggi");
		Student student = new Student("Henrique de Souza Lira", 13210290, false, 0);
		estruturaDeDados.enroll(student);
		
		ArrayList<Class> classes = new ArrayList<>();
		classes.add(estruturaDeDados);
		
		Course info = new Course("Inform�tica", classes);
		ArrayList<Course> courses = new ArrayList<>();
		courses.add(info);
		
		Secretary infoSecretary = new Secretary(false, courses);
		Secretary infoPosSecretary = new Secretary(true, courses);
		
		Departament department = new Departament("Departamento I", 0, infoSecretary, infoPosSecretary);
		department.register(student);
		
		assertEquals(false, department.register(student));
	}
	
	@Test
	public void departamentRegisterTest2(){
		System.out.println("\nTeste de matr�cula em um departamento com outro estudante j� matriculado:");
		Class estruturaDeDados = new Class("Esturtura de Dados", "INF 1620", 60, false, true, 0, "Marcus Poggi");
		Student student = new Student("Henrique de Souza Lira", 13210290, false, 0);
		Student student2 = new Student("Naelson Cirilo", -1, false, 0);
		estruturaDeDados.enroll(student);
		estruturaDeDados.enroll(student2);
		
		ArrayList<Class> classes = new ArrayList<>();
		classes.add(estruturaDeDados);
		
		Course info = new Course("Inform�tica", classes);
		ArrayList<Course> courses = new ArrayList<>();
		courses.add(info);
		
		Secretary infoSecretary = new Secretary(false, courses);
		Secretary infoPosSecretary = new Secretary(true, courses);
		
		Departament department = new Departament("Departamento I", 0, infoSecretary, infoPosSecretary);
		department.register(student);
		
		assertEquals(true, department.register(student2));
	}
	
	@Test 
	public void generatorGenerateDepartmentsTest(){
		ArrayList<Departament> departments =  Generators.generateDepartments();
		assertEquals(departments.size(),2);
		assertEquals(0,departments.get(0).getStudents().size());
		assertEquals(2,departments.get(1).getStudents().size());
		
	}
	
	@Test
	public void studentRegisterStudentTest(){
		String name = "João\n";
		InputStream stdin = System.in;
		try {
			
		  System.setIn(new ByteArrayInputStream(name.getBytes()));
		  Scanner scanner = new Scanner(System.in);
		  Student.registerStudent(1);
		  
		} finally {
		  System.setIn(stdin);
		}
		
		name = "Maria\n";
		stdin = System.in;
		try {
			
		  System.setIn(new ByteArrayInputStream(name.getBytes()));
		  Scanner scanner = new Scanner(System.in);
		  Student.registerStudent(2);
		  
		} finally {
		  System.setIn(stdin);
		}
	}

	
	
	@Test
	public void studentReportIn(){
		ArrayList<Class> classes = new ArrayList<Class>();
		Class english = new Class("English","1",1,false,true,10,"Pasquale");
		Class portuguese= new Class("Portuguese","1",1,false,true,10,"Pasquale");
		classes.add(english);
		classes.add(portuguese);
		Course course = new Course("curso", classes);		
		Student student = new Student("João", 1,false, 0);
		course.enroll(student);
		student.reportIn();
	}
	
	@Test
	public void mainReadIntTest(){
		InputStream stdin = System.in;
		int a;
		int b;
		int c;
		try {
			  String input = "1\n"+System.getProperty("line.separator");
			  System.setIn(new ByteArrayInputStream(input.getBytes()));
			  Scanner scanner = new Scanner(System.in);
			  a=Main.readInt(1, 10);
			  
			} finally {
			  System.setIn(stdin);
			}
		
		
		try {
			  String input = "2\n"+System.getProperty("line.separator");
			  System.setIn(new ByteArrayInputStream(input.getBytes()));
			  Scanner scanner = new Scanner(System.in);
			  b=Main.readInt(1, 10);
			  
			} finally {
			  System.setIn(stdin);
			}
		
		
		try {
			  String input = "a\n"+System.getProperty("line.separator");
			  System.setIn(new ByteArrayInputStream(input.getBytes()));
			  Scanner scanner = new Scanner(System.in);
			  c=Main.readInt(1, 10);
			  
			} finally {
			  System.setIn(stdin);
			}
		
		
		assertEquals(1, a);
		assertEquals(2, b);
		assertEquals(-1, c);
	}
	
	
	@Test
	public void teatcherConstructorTest(){
		Teacher teacher = new Teacher();
		assertEquals(teacher.getDepartment(), null);
	}
	
	
}

