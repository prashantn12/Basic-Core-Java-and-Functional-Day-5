package prashant;
import java.util.Scanner;


public class Sum_of_First_N_Natural_numbers {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a positive integer : ");
	        int N = scanner.nextInt();

	        int sum = 0;

	        for (int i = 1; i <= N; i++) {
	            sum += i;
	        }

	        System.out.println("The sum of the first " + N + " natural numbers is: " + sum);

	}

}
