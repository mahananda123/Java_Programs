import java.util.Scanner;
public class Fibonaccii {
	public static void main(String args[]) {
		System.out.print("Enter a number n:");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int a,b;
		a=0;
		b=1;
		int c=0;
		for (int i=0;i<n;i++) {
			c=a+b;
			System.out.print(a+" ");
			a=b;
			b=c;
		}
	}
}
