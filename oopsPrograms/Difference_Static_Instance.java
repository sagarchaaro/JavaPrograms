package nov_20_2020;

public class Demo {
	int x=5;//Instance variable
	static int y=10;//class variable
	
	public static void main(String[] args) {
		Demo ob1=new Demo();
		Demo ob2=new Demo();
		
		ob1.x=ob1.x+2;
		ob1.y=ob1.y+2;
		
		System.out.println(ob1.x);//7
		System.out.println(ob1.y);//12
		System.out.println(ob2.x);//5
		System.out.println(ob2.y);//12
		
		
	}
}
