package dataGenerators;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import administrative.*;
import administrative.Class;
import personal.Teacher;

public class Generators {
	
	
	public static ArrayList<Departament> generateDepartments(){		
		ArrayList<Departament>  departments = new ArrayList<Departament>();
		
		
		
		
		
		//Cria as matérias de engenharia de computação
		Class labProgramacao = new Class("Laboratório de programação I", "INF 1620",70,false,true,0,null,"Arndt Von Staa",null);
		Class estruturaDeDados = new Class("Esturtura de Dados","INF 1620",60,false,false,0,null,"Marcus Poggi",null);
		Class ProjetoDeSistemaDeSW1 = new Class("Projeto de sistema de Software I","INF 1624",40,true,true,0,null,"Carlos Lucena",null);
		Class programacaoEmPontoGrande = new Class("Programação em Ponto Grande", "INF 1628",50,true,true,0,null,"Arndt von Staa",null);
		
		//Cria o set para organizar as matérias de engenharia de computação e adciona as matérias nele
		Set<Class> engInfoGradClasses = new HashSet<Class>();		
		engInfoGradClasses.add(labProgramacao);
		engInfoGradClasses.add(estruturaDeDados);
		engInfoGradClasses.add(ProjetoDeSistemaDeSW1);
		engInfoGradClasses.add(programacaoEmPontoGrande);
		
		//Cria o curso de engenharia de computação com as matérias		
		Course engComputacao = new Course("Engenharia de computação", engInfoGradClasses);		
		//---------------------------------------------------------------------------------------------------------
				
		//Cria Matérias do curso de bacharelado de computação
		Class introCienciaDaComputacao = new Class("Introdução à Ciência da Computação", "INF 1001", 40, false, true,0, null,"Bruno Feijó", null);		
		Class calculoNumerico = new Class("Cálculo Numérico","INF 1002",40,false,true,100,null,"Marcos Poggi",null);
		Class softwareBasico = new Class("Software Básico", "INF 1600",50,true, true, 40,null,"Arndt von Staa",null);
		
		
		//Cria o set para organizar as matérias de bacharelado de computação e adciona as matérias nele
		Set<Class> bachInfoGradClasses= new HashSet<Class>();
		bachInfoGradClasses.add(introCienciaDaComputacao);
		bachInfoGradClasses.add(calculoNumerico);
		bachInfoGradClasses.add(softwareBasico);
		
		//Cria o curso de engenharia de computação com as matérias		
		Course bachareladoComputacao = new Course("Engenharia de computação", bachInfoGradClasses);	
		
		//--------------------------organiza todos os cursos de graduação em uma lista----------------------------
		
		Set<Course> gradInfoCourses = new HashSet<Course>();
		gradInfoCourses.add(bachareladoComputacao);
		gradInfoCourses.add(engComputacao);		
		//---------------------------------------------------------------------------------------------------------
		
		//Cria as matérias do doutorado de informática
		Class hipermidiaAdaptativa = new Class("Hipermídia adaptativa","INF 1303", 30, true, true, 0, null, "Daniel Schawbe", null);
		
		
		//Cria o curso de doutorado em informática
		Set<Class> doutInfoPosClasses = new HashSet<Class>();
		Course doutoradoInfo = new Course("Doutorado - Informática", doutInfoPosClasses);	
		
		
		Set<Course> posGradInfoCourses = new HashSet<Course>();
		posGradInfoCourses.add(doutoradoInfo);
		
		//Cria as duas secratarias de informática, já com os cursos inclusos
		Secretary gradInfo = new Secretary(false,gradInfoCourses);
		Secretary posGradInfo = new Secretary(true,posGradInfoCourses);
		
		//Cria o departamento de informática
		Departament deptInfo = new Departament("Informática",0,gradInfo,posGradInfo);
		
		
		
		
		///-----------------------------------Letras----------------------------------------------------
		
		Class inglesI = new Class("Inglês I","LET 1501", 30, false, true, 0, null, "Ângelo Souza", null);
		
		//Cria o set para organizar as matérias de português-inglês e adciona as matériasnele
		Set<Class> ptrIngGradClasses = new HashSet<Class>();
		ptrIngGradClasses.add(inglesI);
		
		//Cria o curso de português-inglês com as matérias
		Course ptrIngGrad = new Course("Letras", ptrIngGradClasses);
		
		Set<Course> gradLetrasCourses = new HashSet<Course>();
		gradLetrasCourses.add(ptrIngGrad);
		
		
		//Secretaria de graduação de letras
		Secretary letrasGrad = new Secretary(false,gradLetrasCourses);
		Departament deptLetras = new Departament("Letras",1,letrasGrad,null);

		
		departments.add(deptLetras);
		departments.add(deptInfo);	
		
		
		
		
		return departments;		
		
	}
	
	

}
