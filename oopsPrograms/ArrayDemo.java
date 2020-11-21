package nov_20_2020;

public class ArrayDemo {
	public static void main(String[] args) {
		int a[]={72, 45, 50, 60, 83, 56};
		
		for(int i=1;i<=20;i++){
			System.out.println(i);
		}
		
		//Normal for loop
		/*for(int i=0;i<5;i++){
			
			System.out.println(a[i]);
			
		}*/
		
		//Enhanced for loop
		for(int b:a){
			System.out.println(b);
		}
	}
}
