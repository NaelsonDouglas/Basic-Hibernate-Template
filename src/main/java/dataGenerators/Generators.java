package dataGenerators;
import java.util.HashSet;
import java.util.Set;

import administrative.*;
import administrative.Class;
import personal.Teacher;

public class Generators {
	
	
	public Set<Departament> generateDepartments(){		
		Set<Departament>  departments = new HashSet<Departament>();
		
		
		
		
		
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
		Set<Class> bachInfoGreadClasses= new HashSet<Class>();
		bachInfoGreadClasses.add(introCienciaDaComputacao);
		bachInfoGreadClasses.add(calculoNumerico);
		bachInfoGreadClasses.add(softwareBasico);
		
		//Cria o curso de engenharia de computação com as matérias		
		Course bachareladoComputacao = new Course("Engenharia de computação", bachInfoGreadClasses);		
		
		
		
		
		
		

		
		Departament letras = new Departament();
		
		
		
		
		
		return departments;		
		
	}
	
	

}
