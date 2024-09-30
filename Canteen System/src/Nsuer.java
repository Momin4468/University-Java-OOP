
public class Nsuer {

	private String Name,Department;
	private int Id;
	
	public Nsuer() {
		
	}
	
	public Nsuer(String Name, String Department, int Id) {
		super();
		this.Name = Name;
		this.Department = Department;
		this.Id = Id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}


	public String toString() {
		return "Name= " + getName() + "\nDepartment= " + getDepartment() + "\nId=" + getId();
	}
	
	
	
}
