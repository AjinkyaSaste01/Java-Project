import java.util.*;

class PositiveNegative{
	public static void main(String [] args){
		int no;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		no=sc.nextInt();

		if(no>=0){
			System.out.println("The Number is Positive");
		}
		else{
			System.out.println("The Number is Negative");
		}
	}

}