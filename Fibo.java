// Print FIbonacci Series for 10 digits using for loop.

class Fibo{
	public static void main(String [] args){
		int a=0,b=1;
		for(int i=1; i<=10; i++){
			System.out.print(a+" ");
			int c=a+b;
			a=b;
			b=c;
		}
	}
}