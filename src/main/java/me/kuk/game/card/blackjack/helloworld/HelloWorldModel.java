public class HelloWorldModel{

	private String message = "Hellow world";
	private String name = "";

	public HelloWorldModel(){
	}

	public String getMessage(){
		return this.message;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}
}
