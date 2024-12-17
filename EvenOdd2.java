import java.util.*;
class EvenOdd2{
	/*void acceptnumber(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number ");
		int no=sc.nextInt();
		EvenOdd(no);
	}*/	

	void EvenOdd(int num){
		if(num%2==0){
			System.out.println("Even");
		}
		else{
			System.out.println("Odd");
		}
	}
	public static void main(String [] args){
		EvenOdd e1 = new EvenOdd();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number ");
		int no=sc.nextInt();
		e1.EvenOdd(no);
			
	}
}