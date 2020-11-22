package nov_22_2020;

public class MethodDemo2 {
	public static void main(String args[]){
		MethodDemo2 ob = new MethodDemo2();
		int s1=ob.avgDemo(56, 92, 74, 56);
		System.out.println("Student1 avg marks are :"+s1);
		
		int s2=ob.avgDemo(85, 63, 78, 90);
		System.out.println("Student2 avg marks are :"+s2);
		
		int s3=ob.avgDemo(88, 99, 77, 66);
		System.out.println("Student3 avg marks are :"+s3);
		
		
	}
	
	//method definition
	//method with arguments and with returnType
	//Instance method
	int avgDemo(int e, int m, int sc, int so){
		
		int avg = (e+m+sc+so)/4;
		return avg;
		
	}
}
