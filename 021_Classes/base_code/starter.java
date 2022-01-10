import java.util.Scanner;
import java.util.Random;

class character {
	String brand = ("Warrior");
}

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		character mycharacter = new character();
		System.out.println(mycharacter.brand);
		int strength = 5;
		int dexterity = 5;
		int intelligence = 5;
		int Constitution = 5;
		int Charisma = 5;
		System.out.println("Your strength is " + strength);
		System.out.println("Your dexterity is " + dexterity);
		System.out.println("Your intelligence is " + intelligence);
		System.out.println("Your constitution is " + Constitution);
		System.out.println("Your Charisma is " + Charisma);
	}
}
