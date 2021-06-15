package requirements;
import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		int year;
		boolean isLeapYear = false;
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the year: ");
		year = s.nextInt();
		
		if (year % 4 == 0) {
			if (year % 100 != 0) {
				isLeapYear = true;
			} else if (year % 100 == 0 && year % 400 == 0) {
				isLeapYear = true;
			} else {
				isLeapYear = false;
			}
		} 
		
		if (isLeapYear) {
			System.out.println("\n" + year + " is a leap year.");
		} else {
			System.out.println("\n" + year + " is not a leap year.");
		}
		
		s.close();
	}

}
