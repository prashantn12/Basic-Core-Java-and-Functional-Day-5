package prashant;
import java.util.*;

public class Prime_number {

//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//
//       
//        System.out.print("Enter a number: ");
//        int number = scanner.nextInt();
//
//        
//        boolean isPrime = (number > 1);
//
//        for (int i = 2; i < number; i++) {
//            if (number % i == 0) {
//                isPrime = false;
//                break;
//            }
//        }
//
//        
//        if (isPrime) {
//            System.out.println(number + " is a prime number.");
//        } else {
//            System.out.println(number + " is not a prime number.");
//        }

	}
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    System.out.print("Enter the number of times to flip the coin: ");
    int numberOfFlips = scanner.nextInt();

    // Ensure the input is a positive integer
    if (numberOfFlips <= 0) {
        System.out.println("Please enter a positive integer.");
        return;
    }

    int headsCount = 0;
    int tailsCount = 0;

    // Flip the coin the specified number of times
    for (int i = 0; i < numberOfFlips; i++) {
        // Generate a random value between 0 and 1
        if (random.nextDouble() < 0.5) {
            tailsCount++;
        } else {
            headsCount++;
        }
    }

    // Calculate the percentage of heads and tails
    double headsPercentage = ((double) headsCount / numberOfFlips) * 100;
    double tailsPercentage = ((double) tailsCount / numberOfFlips) * 100;

    // Print the results
    System.out.println("Heads: " + headsCount + " (" + headsPercentage + "%)");
    System.out.println("Tails: " + tailsCount + " (" + tailsPercentage + "%)");
}

}
