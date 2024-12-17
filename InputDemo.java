import java.util.*;

class InputDemo{
	public static void main(String [] args){
		int age;
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name");
		name=sc.next();
		System.out.println("Enter Your Age");
		age=sc.nextInt();
		float salary;
		System.out.println("Your Salary is");
		salary=sc.nextFloat();
		System.out.println("Hello!! "+ name +" Your Age is "+ age +" Your Salary is "+ salary);
	}

}