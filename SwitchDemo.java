import java.util.*;

class SwitchDemo{
	public static void main(String [] args){
		int no1,no2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Numbers");
		no1=sc.nextInt();
		no2=sc.nextInt();

		System.out.println("Please Select your Option");
		System.out.println("1.Add 2.Sub 3.Multiply 4.Divide 5.Modulus ");
		int opt=sc.nextInt();

		switch(opt){
			case 1 : System.out.println("Addition : "+(no1+no2));
				 break;

			case 2 : System.out.println("Subtraction : "+(no1-no2));
				 break;

			case 3 : System.out.println("Multiplication : "+(no1*no2));
				 break;

			case 4 : System.out.println("Division: "+(no1/no2));
				 break;
		
			case 5 : System.out.println("Modulus : "+(no1%no2));
				 break;

			default : System.out.println("Invalid Selection");
		}
	}
}