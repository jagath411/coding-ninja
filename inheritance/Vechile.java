package inheritance;

public class Vechile {

	private String color;
	protected int Maxspeed;
	public Vechile(int MaxSpeed) {
		System.out.println("Vechile Constructor");
	    this.Maxspeed=MaxSpeed;
	}

	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public void print(){
		
		System.out.println("Vechile "+"color "+color+" Maxspeed "+Maxspeed);
	}
	 
	
}
