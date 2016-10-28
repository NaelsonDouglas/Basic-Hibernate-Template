package administrative;


public class Departament {
	
	protected String name;
	protected int ID;
	
	protected Secretary gradSec;
	protected Secretary posGradSec;

	public Departament(String name, int iD, Secretary gradSec, Secretary posGradSec) {
		super();
		this.name = name;
		ID = iD;
		this.gradSec = gradSec;
		this.posGradSec = posGradSec;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public Secretary getGradSec() {
		return gradSec;
	}

	public void setGradSec(Secretary gradSec) {
		this.gradSec = gradSec;
	}

	public Secretary getPosGradSec() {
		return posGradSec;
	}

	public void setPosGradSec(Secretary posGradSec) {
		this.posGradSec = posGradSec;
	}
	
	public String toString() {
		String output = this.name + ":\n" + "Secretaria de graduação:\n" + gradSec.toString() +
				"Secretaria de pós-graduação:\n" + posGradSec.toString();
		
		return output;
	}

}

