//Write a program to accept a no and print whether it is 4 digit no or not

import java.util.*;

class Digit{
	public static void main(String [] args){
		int no;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number");
		no=sc.nextInt();

		if(no>999){
			if(no<=9999){
			
				System.out.println("The Number is 4 Digit no");
			}else{
			System.out.println("The Number is not 4 Digit no");
		}
		
		}
	}
}