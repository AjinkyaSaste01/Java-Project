import java.util.Scanner;

class WeekDay{
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
                System.out.println("Enter Total Number Of Days");
                 int days=sc.nextInt();

                System.out.println(" "+ days/7 + " weeks and "+ days%7 +" days");			
	}
}