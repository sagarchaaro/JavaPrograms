package nov_22_2020;

public class StaticMethods_All_Categories {
	public static void main(String args[]){
		float z=halfValue();
		System.out.println("Half Value of the given number is :"+z);
		
		show();//Directly
		
		cube(6);
		
		cube(10);
		
		boolean b=StaticMethods_All_Categories.palindrome(121);//By using the class Name
		if(b){
			System.out.println("Given number is palindrome");
		}else{
			System.out.println("Given number is not palindrome");
		}
		
		StaticMethods_All_Categories obj = new StaticMethods_All_Categories();
		obj.show();//By using the Object Reference
		
	}
	
	//method without arguments and without returnType
	static void show(){
		System.out.println("This is the static show method");
	}
	
	//method with arguments and without returnType
	static void cube(int x){
		int cube=x*x*x;
		System.out.println("Cube of the given number is :"+cube);
	}
	
	//method without arguments and with returnType
	static float halfValue(){
		int x=95;
		float y=x/2;
		
		return y;
	}
	
	//method with arguments and with returnType
	static boolean palindrome(int x){
		
		int temp=x;
		int sum=0;
		while(x!=0){
			int r=x%10;
			sum=sum*10+r;
			x=x/10;
		}
		
		if(sum==temp){
			return true;
		}else{
			return false;
		}
		
	}
}
