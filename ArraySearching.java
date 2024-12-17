import java.util.*;
class ArraySearching{

	public void search(int [] a,int key){
		boolean flag=false;
		for(int i=0;i<10;i++){
			if(a[i] == key){
				System.out.println("The Number is found at position "+ (i+1));
				flag=true;
				break;
			}
		}
		if(flag==false){
			System.out.println("The number is not found");
		}
	}
	public static void main(String [] args){
		int [] a=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 10 Numbers");
		
		for(int i=0; i<10; i++){
			a[i]=sc.nextInt();
		}
	
		System.out.println("Enter the number to search");
		int key = sc.nextInt();
		
		ArraySearching a1=new ArraySearching();
		a1.search(a,key);
		
			
	}
}