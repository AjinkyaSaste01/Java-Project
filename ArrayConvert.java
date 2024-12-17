import java.util.*;
class ArrayConvert{
	void convertTONumber(int [] a){
		int no=0;		
		for(int i=0; i<a.length; i++){
			no=no*10+a[i];
		}
		System.out.println("No : "+no);
	}
	
	public static void main(String [] args){
		int [] a = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any 10 Numbers");
		for(int i=0; i<10; i++){
			a[i]=sc.nextInt();
		}
	
		ArrayConvert a1=new ArrayConvert();
		a1.convertTONumber(a);
	}
}