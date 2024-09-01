package prashant;
import java.util.*;

public class Sum_of_digits_of_a_number {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter The Digit : ");
        int n =sc.nextInt();
        int ans=0;
        int number=n;
        while(n>0) {
        	int digit=n%10;
        	ans=ans+digit;
        	n=n/10;
        }

        // Output the result
        System.out.println("The sum of the digits of " + number + " is: " + ans);

	}

}
