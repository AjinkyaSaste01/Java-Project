//Write a program to accept two numbers and print welcome if thefirst number is 3 digit number and print good bye if the second number is 2 digit number otherwise print hello.

import java.util.*;

class Welcome{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		int a,b;
		System.out.println("Enter the number ");
			a=sc.nextInt();	
			b=sc.nextInt();
		if(a>=99 && a<=999){
			System.out.println("Welcome");
		}
			 if(b>=10 && b<=99){
				System.out.println("Good Bye");
			}
			else{
				System.out.println("Hello");	
			} 		
			
	}
}