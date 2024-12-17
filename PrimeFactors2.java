//print prime Factors
import java.util.*;
class PrimeFactors2{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Any Number");
		int no=sc.nextInt();
		int i=2;
		
		while(no>1){
			if(no%i==0){
				System.out.print(i+" ");
				no=no/2;
			}
			else{
				i++;
			}
		}
	}
}