
public class ArrayCount {
	
	public static void evenOddCount(int [] a) {
		int evenCount = 0;
		int oddCount = 0;
		
		for (int i=0; i<a.length; i++) {
			if (i % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}
		
		System.out.println(" even numbers: " + evenCount);
		System.out.println(" odd numbers: " + oddCount);
	}
	public static void main(String[] args) {
	int [] a = {32, 45,33,46,76,11,23,78,89};
	evenOddCount(a);
	}
}
