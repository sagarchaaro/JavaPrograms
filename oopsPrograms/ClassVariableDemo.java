package nov_05_2020;

public class ClassVariableDemo {
	static int t=99;
	public static void main(String[] args) {
		System.out.println("Directly "+t);
		System.out.println("Using Class Name "+ClassVariableDemo.t);
		
		System.out.println("Using Object "+new ClassVariableDemo().t);
		
		ClassVariableDemo abc = new ClassVariableDemo();
		
		System.out.println("Using Object Reference "+abc.t);
	}
}
