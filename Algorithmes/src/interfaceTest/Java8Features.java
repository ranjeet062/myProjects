package interfaceTest;

import java.util.stream.IntStream;

public class Java8Features {

	public static void main(String[] args) {
		
	Interface1 i1 = () -> {
		System.out.println("printing Interface abstact method");
		};
	
	Runnable r = new Runnable() {
		
		@Override
		public void run() {
			System.out.println("runnable method for r");
		}
	};
	
	Runnable r1 = () -> {
		System.out.println("runnable method for r1");
	};
	
	System.out.println(" num 2 isPrime : "+isPrime(2));
	System.out.println(" num 1 isPrime : "+isPrime(1));
	System.out.println(" num 3 isPrime : "+isPrime(3));
	System.out.println(" num 4 isPrime : "+isPrime(4));
	System.out.println(" num 5 isPrime : "+isPrime(5));
	}
	
	public static boolean isPrime(int num)
	{
		return num > 0 && IntStream.range(2, num).noneMatch(index -> num% index	 == 0);
	}
}
