import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner input = new Scanner(System.in);
		String bob = input.nextLine();
		int x = 0;
		while(x < bob.length()) {
			System.out.println(bob.substring(x, x+1));
			x++;
		}
	}
}
