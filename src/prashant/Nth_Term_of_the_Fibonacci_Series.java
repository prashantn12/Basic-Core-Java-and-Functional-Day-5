package prashant;
import java.util.Scanner;

public class Nth_Term_of_the_Fibonacci_Series {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the term number (N): ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int firstTerm = 0, secondTerm = 1;
            int nthTerm = 0;
            
            if (n == 1) {
                nthTerm = firstTerm;
            } else if (n == 2) {
                nthTerm = secondTerm;
            } else {
                for (int i = 3; i <= n; i++) {
                    nthTerm = firstTerm + secondTerm;
                    firstTerm = secondTerm;
                    secondTerm = nthTerm;
                }
            }
            
            System.out.println("The " + n + "th term of the Fibonacci series is: " + nthTerm);
        }

	}

}
