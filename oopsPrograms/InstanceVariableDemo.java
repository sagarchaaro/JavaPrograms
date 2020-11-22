package nov_05_2020;

public class InstanceVariableDemo {
	int var1=90;
	
	public static void main(String[] args) {
		InstanceVariableDemo obj = new InstanceVariableDemo();
		
		System.out.println("Using Object Reference "+obj.var1);//By using Object Reference
		
		System.out.println("Using Object "+new InstanceVariableDemo().var1); //By using the Object
	}
}
