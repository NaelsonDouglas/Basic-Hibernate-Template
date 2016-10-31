package personal;


public class Person{
	
	protected String name;	
	protected int ID;
	
	public String reportIn(){
		String output = "";
		output = "Nome: "+name+"\n"+"Matrícula: "+Integer.toString(ID)+"\n";	
		
		return output;
	}
	
	public Person(String name, int iD) {
		super();
		this.name = name;
		ID = iD;
	}

	public String getName() {
		return name;
	}


	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}
	
	

}

