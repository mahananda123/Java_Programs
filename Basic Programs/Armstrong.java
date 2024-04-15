import java.util.*;
public class Armstrong {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,d=0,rem,temp,arm=0;
		System.out.print("Enter a number:");
		n=sc.nextInt();
		temp=n;
		while(temp>0){
			d++;
			temp/=10;
		}
		int t=n;
		while(t>0) {
			rem=t%10;
			arm+=Math.pow(rem, d);
			t/=10;
		}
		if(arm==n) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not a Armstrong Number");
		}
	}
}
