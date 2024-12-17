import java.util.*;

class Grade{
	public static void main{
		int m1,m2,m3;
		System.out.println("Enter the marks of 3 subject");
		Scanner sc = new Scanner(System.in);
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
		int totatl=m1+m2+m3;
		int avg=total/3;
		System.out.println("Total Marks :"+total);
		System.out.println("Average Marks :"+avg);

		if(avg>=80){
			System.out.println("Distingtion ");
		
		}else{
			if(avg>60){
				System.out.println("First Class");
			
			}else{
				if(avg>50){
					System.out.println("Second class");
				}
			}
			else{
				if(avg>40){
					System.out.println("Pass");
				}
			else{
				Sytem.out.println("Fail");
			}
			}
			
		}
	}
}
