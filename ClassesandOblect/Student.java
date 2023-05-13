package ClassesandOblect;

public class Student {

		public String name;
		 final private int rollNumber;
		double cgpa;
		final double coversionFactor=0.95;
		int numStudents;
		public Student(String name,int rollNumber) {
			this.name=name;
			this.rollNumber=rollNumber;
			numStudents++;
		}
//		public Student (String n) {
//			name=n;
//		//	rollNumber=10;
//		}
		public static int getnumStudent() {
			return numStudents;
		}
		public void print() {
			System.out.println(name+"  "+rollNumber);
		}
		public int getrollNumber() {
			return this.rollNumber;
		}
		public void   setrollNumber(int rollNumber) {
			if(rollNumber<=0) {
				return;
			}
//			this.rollNumber=rollNumber;
		}
	}


