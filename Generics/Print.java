package Generics;

import inheritance.Vechile;

public class Print {
	  public static<T extends Vechile>  void printArray(T arr[]){
	        for(int i=0;i<arr.length;i++){
	         arr[i].print();
//	      /  System.out.println(arr[i]);
	        }
	    }

	    public static void main(String[] args){
//	      Integer arr[]= new Integer[5];
//	      for(int i=0;i<arr.length;i++){
//	        arr[i]=i+1;
//	      }
//	      printArray(arr);
//
//	      String arrS[]= new String[5];
//	      for(int i=0;i<arrS.length;i++){
//	        arrS[i]="abc";
//	      }
//	      printArray(arrS);

	      Vehicle v[] = new Vehicle[5];
	      for(int i=0;i<v.length;i++){
	        v[i]= new Vehicle(10,"abc");
	      }
	      printArray(v);
//
//	      Student students[] = new Student[5];
//	      for(int i=0;i<students.length;i++){
//	        students[i]= new Student(10*i+1);
//	      }
//	      printArray(v);

	    }
	}

