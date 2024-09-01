package prashant;
import java.util.*;

public class Sum_of_numbers_in_a_given_range {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first range : ");
		int f=sc.nextInt();
		System.out.println("Enter last range : ");
		int l=sc.nextInt();
		int ans=0;
		for(int i=f;i<=l;i++) {
			ans=ans+i;
			
		}
		System.out.println(ans);

	}

}
