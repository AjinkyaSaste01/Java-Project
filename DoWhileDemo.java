import java.util.*;

class DoWhileDemo{
	public static void main(String [] args){
		int ch,no;
		Scanner sc=new Scanner(System.in);
		
		do{
			System.out.println("1.Print Sqaure and Cube of any number ");
			System.out.println("2.Print Sqaureroot of any number ");
			System.out.println("3.Print reverse of any number ");
			System.out.println("4.Exit ");
			System.out.println("Enter your choice ");
			ch=sc.nextInt();
			
			switch(ch){
				case 1: System.out.println("Enter any number ");
					no=sc.nextInt();
					System.out.println("Sqaure of no = " + no*no);
					System.out.println("Cube of no= " + no*no*no);
					break;
			
				case 2:  System.out.println("Enter any number ");
					 no=sc.nextInt();
					 System.out.println("Squareroot = " +Math.sqrt(no));
					 break;

				case 3:  System.out.println("Enter any number ");
					 no=sc.nextInt();
					 System.out.println("Reverse = " +no/10);
					 break;
		
				case 4:  System.out.println("Exit");
					 break;
				
			      default :  System.out.println("Wrong Choice");
					 break;
			}

		}while(ch!=4);
    
	}
}