package nov_21_2020;

public class MaxNumberDemo {
	
	public static void main(String args[]){
		
		int a[]={10,69,45,5425,790,82};
		int max=a[0];
		
		for(int b:a){
			if(b>max){
				max=b;
			}
		}
		
		System.out.println("Maximum number of the array is :"+max);
		
	}
	
}
