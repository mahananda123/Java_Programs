import java.util.*;
public class Prime {
	public static void main(String args[]) {
		System.out.print("Enter a number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=0;
		if (n<2) {
			System.out.println("Not a Prime Number");
		}
		if (n==2) {
			System.out.println("Prime Number");
		}
		for(int i=2;i<n;i++) {
			if (n%i==0) {
				c+=1;
			}
		}
		if(c==0) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Not a Prime Number");
		}
	}
}
