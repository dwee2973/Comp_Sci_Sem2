import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner bob = new Scanner(System.in);
		System.out.println("Please print out a phrase. Ex: I like chicken");
		String input = bob.nextLine();
		for(int x = input.length(); x < 0; x--) {
			int s = input.indexOf(" ");
		}
		String bobb = (input.substring(s+1));
		System.out.println(bobb);
	}
}
