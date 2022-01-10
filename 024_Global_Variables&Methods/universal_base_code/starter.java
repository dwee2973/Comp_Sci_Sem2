import pkg.*;
import java.util.Scanner;
import java.util.Random;

class myCharacter {
	String role;
	int strength;
	int dexterity;
	int intelligence;
	int constitution;
	int charisma;
	public myCharacter() {
		role = ("Warrior");
		strength = 5;
		dexterity = 5;
		intelligence = 5;
		constitution = 5;
		charisma = 5;
	}
	public void myToString() {
		System.out.println("You are a " + role);
		System.out.println("Your strength is " + strength);
		System.out.println("Your dexterity is " + dexterity);
		System.out.println("Your intelligence is  " + intelligence);
		System.out.println("Your constitution is " + constitution);
		System.out.println("Your charisma is " + charisma);
	}
}


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		myCharacter test = new myCharacter();
		test.myToString();
	}
}
