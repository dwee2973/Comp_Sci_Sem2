import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	
	 static void toStringArray(int[] a) {
		int c = 0;
		while(c<b.length) {
			System.out.println(a[c] + " ");
			c++;
		}
	 }
	 public static int getArrayAverage(int[] a) {
	 	int total = 0;
		for (int i=0; i<a.length; i++) {
			total = total + a[i];
		}
		return 
	 }
	public static void main(String args[]) {
		// Your code goes below here
		Scanner Input1 = new Scanner(System.in);
		System.out.println("How many numbers do you want in your array");
		int a = Input1.nextInt();
		
		Random rand = new Random();
		int[] b;
		b = new int[a];
		int c = 0;
		while(c<b.length) {
			b[c] = rand.nextInt(10);
			c++;
		}
		
		toStringArray(b);
		System.out.println("The average of this array is: " + getArrayAverage(a));
	}
}
