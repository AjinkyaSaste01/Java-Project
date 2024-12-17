import java.util.*;
class ArrayMaxMarks{
	public static void main(String [] args){
		int [] marks = new int[10];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks of 10 Students");

		for(int i=0; i<10; i++){
			marks[i]=sc.nextInt();
		}
		
		int max = marks[0];
		
		for(int i=1; i<10; i++){
			if(marks[i]>max){
				max=marks[i];
			}
			
		}
		System.out.println("Highest marks : " + max);
	}
}