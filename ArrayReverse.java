import java.util.*;
public class ArrayReverse {
		
	public static void arrayReverse(int [] a){
		int start = 0;
		int end = a.length-1;
		
		while (start < end) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;

			start++;
			end--;
		}
		
		System.out.println("Reversed array:");
		for (int num : a) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.prinln("Enter the Array :");
		int a=sc.nextInt();
		arrayReverse(a);
	}
}
