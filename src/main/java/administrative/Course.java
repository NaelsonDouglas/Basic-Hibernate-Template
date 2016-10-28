package administrative;

import java.util.Set;

public class Course{
	
	protected String name;

	
	protected Set<Class> classes;

	public Course(){
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Class> getClasses() {
		return classes;
	}

	public void setClasses(Set<Class> classes) {
		this.classes = classes;
	}

	public Course(String name, Set<Class> classes) {
		super();
		this.name = name;
		this.classes = classes;
	}
	
	
	
}

