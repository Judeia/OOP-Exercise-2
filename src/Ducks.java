public class Ducks extends Birds
{
	private String type;
	
	public Ducks (String name, String size, String type){
		super(name, size);
		this.type= type;
	}
	
	@Override
	public String MakeSound(){
		return "quack quack";
	}
	
	public String getType (){
		return type;
	}
	public void setType(String type){
		this.type = type;
	}
}


