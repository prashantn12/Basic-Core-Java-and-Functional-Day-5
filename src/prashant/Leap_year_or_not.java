package prashant;
import java.util.Scanner;

public class Leap_year_or_not {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Prompt the user to enter a year
	        System.out.print("Enter a year: ");
	        int year = scanner.nextInt();

	        // Determine if the year is a leap year
	        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

	        // Output the result
	        if (isLeapYear) {
	            System.out.println(year + " is a leap year 2024"
	            		+ "");
	        } else {
	            System.out.println(year + " is not a leap year ");
	        }

	}

}
