import java.util.*;
public class Random_Numbers {
	public static void main(String[] args) {
		Random random=new Random();
		int x=random.nextInt(50);
		float y=random.nextFloat(100);
		boolean z=random.nextBoolean();
		System.out.print(x+"\n"+y+"\n"+z);
		
	}
}
