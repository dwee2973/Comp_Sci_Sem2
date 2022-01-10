import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		int secret;
		secret = rand.nextInt(1000);
		System.out.println("You shall try to guess a number between 1 and 1000");
		System.out.println("If you get it wrong, you can keep guessing");
		int num;
		num = input.nextInt();
		while(true)
			if (num==secret)
			{
				System.out.println("You got it right. Boohoo");
				break;
			}
			System.out.println("Please try again");
	}
}
