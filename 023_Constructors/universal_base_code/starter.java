import pkg.*;
import java.util.Scanner;
import java.util.Random;
class myCharacter {
	String role;
	public myCharacter() {
		role = ("no role");
	}
	public myCharacter(String a) {
		role = a;
		if (a.equals("Warrior")) {
			System.out.println("You picked Warrior. Heres your sword and die");
		}
		else if (a.equals("Wizard")) {
			System.out.println("You picked Wizard. Go do Abracadabra weirdo");
		}
		else if (a.equals("Rogue")) {
			System.out.println("Congrats no one wants you. Go survive by yourself.");
		}
		else {
			System.out.println("no role");
		}
	}
	
}


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Please pick either Warrior, Wizard or Rogue");
		String role = sc.nextLine();
		myCharacter test = new myCharacter();
		test.myCharacter(role);
	}
}
