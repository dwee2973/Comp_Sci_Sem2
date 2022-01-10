import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Random rand = new Random();
		int[] arnold;
		arnold = new int[1000];
		int c = 0;
		while (c<arnold.length) {
			int bob = rand.nextInt(100);
			arnold[c] = bob;
			c++;
		}
		int r = 0;
		while(r<arnold.length) {
			System.out.println(arnold[r]);
			r++;
		}
		
	}
}
