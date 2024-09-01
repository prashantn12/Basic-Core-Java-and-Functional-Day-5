package prashant;
import java.util.*;

public class Reverse_of_a_number {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int reversedNumber = 0;
        int temp = number;

        // Reverse the number
        while (temp != 0) {
            int digit = temp % 10;          // Extract the last digit
            System.out.print(digit);
            //reversedNumber = reversedNumber * 10 + digit; // Append the digit to the reversed number
            temp /= 10;                     // Remove the last digit
        }

         // Output the result
        //System.out.println("The reverse of " + number + " is: " + reversedNumber);

	}

}
