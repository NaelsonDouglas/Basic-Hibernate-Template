package main;



public class Pessoa {
	
	protected long id;	
	protected String nome;
	protected Departamento departamentoID;	
	
	
	public void setDepartamentoID(Departamento departamentoID) {
		this.departamentoID = departamentoID;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
}
