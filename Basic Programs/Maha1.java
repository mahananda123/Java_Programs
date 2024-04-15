
import java.util.Scanner;
public class Maha1 {
	public static void main(String args[]) {
		System.out.print("Enter a number:");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		if (n%2==0) {
			System.out.println("Given number is even");
		}
		else {
			System.out.println("given number is odd");
		}
	}
}
