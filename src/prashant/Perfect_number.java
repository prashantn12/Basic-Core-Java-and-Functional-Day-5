package prashant;
import java.util.Scanner;

public class Perfect_number {

	public static void main(String[] args) {
		//6 is a perfect number because its divisors (excluding itself) are 1, 2, and 3, and their sum is 6 (1 + 2 + 3 = 6).
		Scanner scanner = new Scanner(System.in);

        // Input number from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sum = 0;

        // Calculate the sum of proper divisors
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        // Check if the sum of divisors equals the number
        if (sum == number) {
            System.out.println(number + " is a Perfect number.");
        } else {
            System.out.println(number + " is not a Perfect number.");
        }
	}

}
