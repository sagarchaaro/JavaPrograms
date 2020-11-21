package nov_05_2020;

public class InstanceVariableDemo {
	int s=90;
	
	public static void main(String[] args) {
		InstanceVariableDemo obj = new InstanceVariableDemo();
		
		System.out.println("Using Object Reference "+obj.s);//By using Object Reference
		
		System.out.println("Using Object "+new InstanceVariableDemo().s); //By using the Object
	}
}
