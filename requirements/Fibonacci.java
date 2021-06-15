package requirements;
import java.util.Scanner;
public class Fibonacci {
	
	public static void main(String[] args) {
		int interval, fib1 = 0, fib2 = 1, temp;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		interval = scanner.nextInt();
		
		System.out.print("\nFibonacci Sequence: ");
		for(int i = 1; i <= interval; i++) {
			 System.out.print(fib1 + " ");
			 temp = fib1 + fib2;
			 fib1 = fib2;
			 fib2 = temp;
		}
		
		scanner.close();
	}

}
