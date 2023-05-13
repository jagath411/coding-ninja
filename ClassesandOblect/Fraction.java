package ClassesandOblect;

public class Fraction {

	private int numerator;
	private int denominator;
	
	
	public Fraction(int numerator,int denominator) {
		this.numerator=numerator;
		this.denominator=denominator;
		simlify();
	}
	public void simlify() {
		int gcd=1;
		int smaller=Math.min(numerator, denominator);
		for(int i=1;i<=smaller;i++) {
			if(numerator%i==0&&denominator%i==0) {
				gcd=i;
			}
		}
		numerator=numerator/gcd;
		denominator=denominator/gcd;
	}
	public void increament() {
		numerator=numerator+denominator;
		simlify();
	}
     public void setNumerator(int num) {
    	 this.numerator=num;
     }
     public int getNumerator() {
    	 return numerator;
     }
     public void setDenominator(int num) {
    	 if(num==0) {
    		 return;
    	 }
     
     this.denominator=num;
     }
     

     public int getDenominator() {
    	 return denominator; 
     }
	public void print() {
		System.out.println(numerator+"/"+denominator);
		
	}
	public void add(Fraction f2) {
		this.numerator =this.numerator*f2.denominator+this.denominator*f2.numerator;
		this .denominator=this.denominator*f2.denominator;
		simlify();
	}
	public static Fraction add(Fraction f1,Fraction f2) {
		int newNum=f1.numerator*f2.denominator+f1.denominator*f2.numerator;
		int newDeno=f1.denominator*f2.denominator;
		 Fraction f3= new Fraction(newNum, newDeno);
	        return f3;
	}
	

	}


