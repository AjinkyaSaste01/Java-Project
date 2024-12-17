//Write a program to accept a number and if the number is greater than 100 then print discount other wise print no discount
import java.util.*;
class Test{
	public static void main(String []args){
		int no;	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number :");
		no=sc.nextInt();
		
		if(no>=100){
			System.out.println("Discount is Available");
		}else{
			System.out.println("No Discount is Available");
		}				
	}
}