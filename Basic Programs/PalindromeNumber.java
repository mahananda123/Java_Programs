import java.util.*;
public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,rev,rem,temp;
		System.out.print("Enter a Number:");
		n=sc.nextInt();
		temp=n;
		rev=0;
		while(temp>0) {
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(rev==n) {
			System.out.println("Palindrome Number");
		}
		else {
			System.out.println("Not a Pallindrome Number");
		}
	}
}
