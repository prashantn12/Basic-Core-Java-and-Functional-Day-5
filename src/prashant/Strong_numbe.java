package prashant;
import java.util.Scanner;
public class Strong_numbe {
	//145 is a strong number because 1! + 4! + 5! = 1 + 24 + 120 = 145.

	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);

        // Input number from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int sum = 0;

        // Calculate the sum of the factorial of each digit
        while (number > 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }

        // Check if the sum of factorials equals the original number
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is a Strong number.");
        } else {
            System.out.println(originalNumber + " is not a Strong number.");
        }

        scanner.close();
    }

    // Method to calculate the factorial of a digit
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

}
