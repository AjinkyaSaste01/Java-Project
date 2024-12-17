//Write a java program to accept 10 numbers from user and store them in an array and print the sum of all elements.

import java.util.Scanner;
class Sum{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
	
		int [] a = new int[10];
		int sum = 0;
		
		System.out.println("Enter 10 numbers: ");
			for(int i=0; i<10; i++){
				a[i]=sc.nextInt();		
				sum = sum+a[i];
			}
			
	
			System.out.println("The Sum of All numbers : "+sum);
			 sc.close();
	}
}