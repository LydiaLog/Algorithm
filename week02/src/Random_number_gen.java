
import java.util.*;
public class Random_number_gen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int n = 50; 
		int range = 100;
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
		     a[i] = random.nextInt(range);
		for (int i = 0; i < n; i++)
		     System.out.println(i+ "> "+ a[i] );

	}

}
