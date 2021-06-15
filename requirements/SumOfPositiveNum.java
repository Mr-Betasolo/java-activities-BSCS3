package requirements;
import java.util.Scanner;
public class SumOfPositiveNum {

	public static void main(String[] args) {
		int limit, total = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input the limit: ");
		limit = sc.nextInt();
		
		for (int i = 1; i <= limit; i++) {
			total += i;
		}
		
		System.out.println("\nThe total of numbers from 1 to " + limit + " was " + total);
		sc.close();
		
	}

}
