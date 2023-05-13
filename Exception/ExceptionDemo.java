package Exception;



public class ExceptionDemo {

	public static int divide(int a,int b)throws DivideZeroException{
		if(b==0) {
			throw new DivideZeroException();
	
		}
		return a/b;
	}
	public static void main(String[] args) {
//		System.out.println(4/0);
//		System.out.println("main");
		try{
	        divide(10,0);
	        System.out.println("Within Try");
	      }catch (DivideZeroException e){
	          System.out.println("Divide by zero exception raised");
	      }
	      System.out.println("Main");

	}

}
