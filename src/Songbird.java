public class Songbird extends Birds{
	
	public String order;
	
	public Songbird(String name, String size, String order){
		super (name, size);
		this.order= order;
	}

	@Override
	public String MakeSound(){
		return "tweet tweet";
	}
	
	public String getOrder(){
		return order;
	}
	
	public void setOrder(String order){
		this.order = order;
	}

}
