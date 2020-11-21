package nov_21_2020;

public class MethodDemo2 {
	
	public static void main(String args[]){
		MethodDemo2 ob = new MethodDemo2();
		System.out.println("Student 1 marks");
		ob.avgDemo(50, 60, 65, 80);
		
		System.out.println("Student 2 marks");
		ob.avgDemo(89, 45, 78, 80);
		
		System.out.println("Student 3 marks");
		ob.avgDemo(88, 92, 96, 99);
		
		
	}
	
	//Instance method
	//method definition
	//methods with arguments and without returnType
	
	void avgDemo(int e, int m, int sc, int so){
		int avg=(e+m+sc+so)/4;
		
		System.out.println("Student Average marks is :"+avg);
		
	}
	
	
}
