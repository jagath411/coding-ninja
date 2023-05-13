package inheritance;

public class Car extends Vechile {
	
	int NumDoors;
	int Maxspeed;
	public  Car(int NumDoors,int Maxspeed) {
		super(100);
		System.out.println("car's Contructor");
	     this.NumDoors=NumDoors;
	}
	public void print() {
		super.print();
		System.out.println("car "+" numdoors "+NumDoors);
	}
	public void printMaxspeed() {
		super.Maxspeed=150;
		System.out.println(Maxspeed+" "+super.Maxspeed);
	}
	

}
