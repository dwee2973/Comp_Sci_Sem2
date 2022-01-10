import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Random rand = new Random();
		int[] num = new int [100];
		int min = 1000;
		int c = 0;
		while(c<num.length) {
			num[c] = rand.nextInt(150) +51;
			System.out.println(num[c] + " ");
			c++;
		}
		c = 0;
		System.out.println();
		while(c<num.length) {
			if(num[c] < min) {
				min = num[c];
			}
			c++;
		}
		int v = 0;
		int max = num[0];
		System.out.println();
		while(v<num.length) {
			if(num[v] > max) {
				max = num[v];
			}
			v++;
		}
		double total = 0;
		for (int i=0; i<num.length; i++) {
			total = total + num[i];
		}
		double average = total / num.length;
		
		System.out.println("The minimum number of 10 numbers is " + min);
		System.out.println("The maximum number of 10 numbers is " + max);
		System.out.println("The average number of 10 numbers is " + average);
	}
}
