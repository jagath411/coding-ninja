package Generics;

public class PairUse {
	  public static void main(String[] args){
		  Pair<String,Integer> p=new Pair<String,Integer>();
		  System.out.println(p.getFirst()+p.getSecond());

		  
		  Pair<String> pS=new  Pair<String>("aa","bb");
		  System.out.println(pS.getFirst()+" "+pS.getSecond());
		  pS.setFirst("10");
		  
		  Pair<Integer> pI =new Pair<Integer>(1,20);;
		  System.out.println(pI.getFirst()+" "+pI.getSecond());
		  
		  
		  
		  
		  
		  
//	      Pair p=new Pair(10,20);
//	      System.out.println(p.getFirst()+""+p.getSecond());

	      
	      
//	      PairString p=new PairString("aa","bb");
//	      PairDouble pd=new PairString(1.2,8.9);
}
}
