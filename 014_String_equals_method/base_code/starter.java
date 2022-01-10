import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("Please pick between Wizard, Warrior and Rogue");
		Scanner w = new Scanner(System.in);
		String input;
		input = w.nextLine();
		System.out.println("Your character is " + input);
		String wizardd = ("Wizard");
		String warriorr = ("Warrior");
		String roguee = ("Rogue");
		boolean wizard = (input.equals(wizardd));
		boolean warrior = (input.equals(warriorr));
		boolean rogue = (input.equals(roguee));
		if (wizard)
		{
			System.out.println("You can use magic now. Abracadabra >:)");
		}
		else if (warrior)
		{
			System.out.println("You have a sword. Poke Poke ;)");
		}
		else if (rogue)
		{
			System.out.println("You have all abilites. Wowwwwww :)");
		}
		else
		{
			System.out.println("Invaild Option. Please captialize or that name doesnt exist :)");
		}
	}
}
