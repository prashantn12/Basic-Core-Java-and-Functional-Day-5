package prashant;
import java.util.Scanner;

public class Perfect_Squar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Input number from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Calculate the square root of the number
        int sqrt = (int) Math.sqrt(number);

        // Check if the square of the square root equals the original number
        if (sqrt * sqrt == number) {
            System.out.println(number + " is a Perfect Square.");
        } else {
            System.out.println(number + " is not a Perfect Square.");
        }

	}

}
