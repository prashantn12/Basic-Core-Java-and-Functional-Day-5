package prashant;
import java.util.*;
public class Sum_of_N_natural_numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the N number");
		int n =sc.nextInt();
		int ans=0;
		for(int i=1;i<=n;i++) {
			ans=ans+i;
		}
		System.out.print("The sum of first "+ n +" natural number is "+ ans);

	}

}
