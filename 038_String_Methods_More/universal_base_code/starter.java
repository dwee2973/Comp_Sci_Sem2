import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner input = new Scanner(System.in);
		System.out.println("Type in your full name");
		String bob = input.nextLine();
		int i = bob.indexOf(" ");
		String bobb = (bob.substring(i+1));
		System.out.println(bobb);
	}
}
