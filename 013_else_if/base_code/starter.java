import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Random rand = new Random();
		int my = rand.nextInt(1000);
		System.out.println("Please pick a number between 1 and 1000");
		Scanner Ash = new Scanner(System.in);
		int unum;
		unum = Ash.nextInt();
		boolean h = (unum==my);
		boolean g = (unum>my);
		if (h)
		{
			System.out.println("NOOOOOOO, you guessed the correct number");
		}
		else if(g)
		{
			System.out.println("You suck. >:) Your number is too big");
		}
		else{
			System.out.println("You suckkkkk. >>:) Your number is too small");
		}
	}
}
