
public class Author {

	private int id;
	public Author() {
		
	}
	
	public Author( int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String toString() {
		return "\nId=" + getId();
	}
	
	
}
