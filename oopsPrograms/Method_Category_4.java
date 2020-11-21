package nov_21_2020;

public class MethodDemo1 {
	int x=10;//Instance variable
	
	public static void main(String args[]){
		MethodDemo1 ob=new MethodDemo1();
		ob.avgDemo();//method call statement
		
		System.out.println("This is the methods without arguments and without returntType");
		
		ob.avgDemo();
		
		int c=ob.x+100;
		System.out.println("The C value is :"+c);
		
		ob.avgDemo();
		
		
	}
	
	//method definition and 
	//methods without arguments and without return type
	//Instance method
	void avgDemo(){
		
		int e=45, m=78, sc=90, so=99;
		int avg=(e+m+sc+so)/4;
		
		System.out.println("Student Average marks is :"+avg);
		
	}
	
	
	
}
