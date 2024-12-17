import java.util.*;
class ArrayMinMarks{

	void acceptArray(){
		int [] marks = new int[10];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks of 10 Students");

		for(int i=0; i<10; i++){
			marks[i]=sc.nextInt();
		}
		findMinMarks(marks);
	}
	
	void findMinMarks(int [] marks){
		int min = marks[0];
		for(int i=0; i<10; i++){
			if(marks[i]<min){
				min=marks[i];
			}
		}
		System.out.println("Lowest marks : " + min);
	}
	public static void main(String [] args){
		ArrayMinMarks a1 = new ArrayMinMarks();
		a1.acceptArray();	
	
	}
}