import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner input = new Scanner(System.in);
		String bob = input.nextLine();
		for (int x = 0; x < bob.length(); x++) {
			System.out.println(bob.substring(x, x+1));
		}
	}
}
