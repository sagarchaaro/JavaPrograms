package nov_22_2020;

public class MethodDemo1 {

	public static void main(String args[]){
		MethodDemo1 ob = new MethodDemo1();
		int x=ob.avgDemo();
		
		System.out.println("Avg marks of the student is :"+x);
		
	}
	
	//Instance method
	//method with returnType and without arguments
	int avgDemo(){
		int e=45, m=78, sc=90, so=99;
		int avg=(e+m+sc+so)/4;
		
		return so;//return statement
	}
	
}
