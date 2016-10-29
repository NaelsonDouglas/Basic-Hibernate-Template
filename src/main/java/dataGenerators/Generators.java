package dataGenerators;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import administrative.*;
import administrative.Class;
import personal.Student;
import personal.Teacher;

public class Generators {
	
	
	public static ArrayList<Departament> generateDepartments(){		
		ArrayList<Departament>  departments = new ArrayList<Departament>();
		
		
		
		
		
		//Cria as matérias de engenharia de computação
		Class labProgramacao = new Class("Laboratório de programação I", "INF 1622",70,false,true,0,null,"Arndt Von Staa");
		Class estruturaDeDados = new Class("Esturtura de Dados","INF 1620",60,false,false,0,null,"Marcus Poggi");
		Class ProjetoDeSistemaDeSW1 = new Class("Projeto de sistema de Software I","INF 1624",40,true,true,0,null,"Carlos Lucena");
		Class programacaoEmPontoGrande = new Class("Programação em Ponto Grande", "INF 1628",50,true,true,0,null,"Arndt von Staa");
		
		
		
		
		Student alexCarvalho = new Student("Alex Carvalho",98124812, 130);		
		Student jurema = new Student("Jurema Torres",9924812, 100);	
		Student joseVasconcelos = new Student("José Vasconcelos",9915918, 0);		
		Student joaoDaSilva = new Student("João da Silva",9914918, 0);
		
		
		labProgramacao.enroll(alexCarvalho);
		estruturaDeDados.enroll(alexCarvalho);
		estruturaDeDados.enroll(jurema);
		
		
		
		
		
		
		
		
		
		//Cria o set para organizar as matérias de engenharia de computação e adciona as matérias nele
		ArrayList<Class> engInfoGradClasses = new ArrayList<Class>();		
		engInfoGradClasses.add(labProgramacao);
		engInfoGradClasses.add(estruturaDeDados);
		engInfoGradClasses.add(ProjetoDeSistemaDeSW1);
		engInfoGradClasses.add(programacaoEmPontoGrande);
		
		//Cria o curso de engenharia de computação com as matérias		
		Course engComputacao = new Course("Engenharia de computação", engInfoGradClasses);		
		//---------------------------------------------------------------------------------------------------------
				
		
		
		
		//Cria Matérias do curso de bacharelado de computação
		Class introCienciaDaComputacao = new Class("Introdução à Ciência da Computação", "INF 1001", 40, false, true,0, null,"Bruno Feijó");		
		Class calculoNumerico = new Class("Cálculo Numérico","INF 1002",40,false,true,100,null,"Marcos Poggi");
		Class softwareBasico = new Class("Software Básico", "INF 1600",50,true, true, 40,null,"Arndt von Staa");
		introCienciaDaComputacao.enroll(jurema);
		
		
		//Cria o set para organizar as matérias de bacharelado de computação e adciona as matérias nele
		ArrayList<Class> bachInfoGradClasses= new ArrayList<Class>();
		bachInfoGradClasses.add(introCienciaDaComputacao);
		bachInfoGradClasses.add(calculoNumerico);
		bachInfoGradClasses.add(softwareBasico);
		
		
		//Cria o curso de engenharia de computação com as matérias		
		Course bachareladoComputacao = new Course("Engenharia de computação", bachInfoGradClasses);	
		
		
		
		//--------------------------organiza todos os cursos de graduação em uma lista----------------------------
		
		ArrayList<Course> gradInfoCourses = new ArrayList<Course>();
		gradInfoCourses.add(bachareladoComputacao);
		gradInfoCourses.add(engComputacao);		
		
		
		//---------------------------------------------------------------------------------------------------------
		
		//Cria as matérias do doutorado de informática
		Class hipermidiaAdaptativa = new Class("Hipermídia adaptativa","INF 1303", 30, true, true, 0, null, "Daniel Schawbe");
		
		
		//Cria o curso de doutorado em informática
		ArrayList<Class> doutInfoPosClasses = new ArrayList<Class>();
		Course doutoradoInfo = new Course("Doutorado - Informática", doutInfoPosClasses);	
		
		
		ArrayList<Course> posGradInfoCourses = new ArrayList<Course>();
		posGradInfoCourses.add(doutoradoInfo);
		
		//Cria as duas secratarias de informática, já com os cursos inclusos
		Secretary gradInfo = new Secretary(false,gradInfoCourses);
		Secretary posGradInfo = new Secretary(true,posGradInfoCourses);
		
		//Cria o departamento de informática
		Departament deptInfo = new Departament("Informática",0,gradInfo,posGradInfo);
		
		
		
		
		///-----------------------------------Letras----------------------------------------------------
		
		Class inglesI = new Class("Inglês I","LET 1501", 30, false, true, 0, null, "Ângelo Souza");
		
		
		//Cria o set para organizar as matérias de português-inglês e adciona as matériasnele
		ArrayList<Class> ptrIngGradClasses = new ArrayList<Class>();
		ptrIngGradClasses.add(inglesI);
		
		
		//Cria o curso de português-inglês com as matérias
		Course ptrIngGrad = new Course("Letras", ptrIngGradClasses);
		
		
		
		ArrayList<Course> gradLetrasCourses = new ArrayList<Course>();
		gradLetrasCourses.add(ptrIngGrad);
		
		
		//Secretaria de graduação de letras
		Secretary letrasGrad = new Secretary(false,gradLetrasCourses);
		Departament deptLetras = new Departament("Letras",1,letrasGrad,new Secretary(true, new ArrayList<Course>()));

		
		departments.add(deptLetras);
		departments.add(deptInfo);	
		
		Student mariaAntonia = new Student("Maria antônia", 12398,0);
		
		
		//-----------------------------------Alunos----------------------------------------------------
		
		
	
		
		
		
		
		
		return departments;		
		
	}
	
	

}
