package hello;

public class Comment {
	private int id;
	private String com;
	private int state;
	
	public Comment (){
		
	}

	public Comment(int id, String com, int state) {
		super();
		this.id = 1;
		this.com = com;
		this.state = state;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getCom() {
		return com;
	}

	public void setCom(String com) {
		this.com = com;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}
	
	public void update(int id, String comentario){
		//update object
	}
	
	public void delete(int id){
		//delete object
	}
	
}
