import java.util.*;
public class Factorial {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n,fact=1;
		n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			fact*=i;
		}
		System.out.println("Factorial of "+n+" is "+fact);
	}
}
