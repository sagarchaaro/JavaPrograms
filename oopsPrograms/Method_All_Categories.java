package nov_22_2020;

public class Method_All_Categories {

	public static void main(String args[]){
		Method_All_Categories obj= new Method_All_Categories();
		int sumArray=obj.sumofArray();
		System.out.println("The sum of the Array Values are :"+sumArray);
		
		obj.evenOrOdd(69);
		obj.evenOrOdd(850);
		
		obj.primes();
		
		int y=obj.facts(5);
		System.out.println("Factorial of a given number is :"+y);
		
		obj.evenOrOdd(113);
	}
	
	//method with arguments and without retunType
	void evenOrOdd(int x){
		if(x%2==0){
			System.out.println("Given number is Even");
		}else{
			System.out.println("Given number is Odd");
		}
		
	}
	
	//method with arguments and with returnType
	int facts(int x){
		int fact=1;
		for(int i=x;i>=1;i--){
			fact=fact*i;
		}
		return fact;
	}
	
	//method without arguments and with returnType
	int sumofArray(){
		int a[]={56,74,100,562,21};
		int sum=0;
		for(int b:a){
			sum=sum+b;
		}
		
		return sum;
	}
	
	//methods without arguments and without returnType
	void primes(){
		
		int x=17;
		int count=0;
		for(int i=1;i<=x;i++){
			if(x%2==0){
				count++;
			}
		}
		
		if(count>2){
			System.out.println("The given number is Not Prime");
		}else{
			System.out.println("The given number is Prime");
		}
		
	}
	
	
}
