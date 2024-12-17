// Array Sorting.

import java.util.*;

class Sorting2{

	void sort(int []a){
		int temp;
		for(int i=0; i<10; i++){
			for(int j=0; j<9-i; j++){
				if(a[j]<a[j+1]){
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}

	void print(int [] a){
		for(int i=0; i<a.length; i++){
			System.out.print(a[i] +" ");
		}
	}
	public static void main(String []args){
		int [] a=new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any 10 Numbers");
		for(int i=0; i<10; i++){
			a[i]=sc.nextInt();
		}
		Sorting2 a1 = new Sorting2();
		a1.sort(a);
		a1.print(a);
	}
}