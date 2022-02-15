package pojoclass;

public class postrequest {

	private int id;

	private String stream;

	private String firstname;

	private String lastname;
	
	  private Category category;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

	public void setStream(String stream) {
		this.stream = stream;
	}

	public String getStream() {
		return this.stream;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getFirstname() {
		return this.firstname;
	}
	
	 public void setCategory(Category category){
	        this.category = category;
	    }
	    public Category getCategory(){
	        return this.category;
	    }

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getLastname() {
		return this.lastname;
	}
}
