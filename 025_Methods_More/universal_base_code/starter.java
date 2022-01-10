import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	
	public String setRole(String a); {
		String a;
		if (a.equals("Warrior")){
			System.out.println("You are a warrior");
		}
		else if (a.equals("warrior")){
			System.out.println("You are a warrior");
		}
		else if (a.equals("Rogue")){
			System.out.println("You are a Rogue");
		}
		else if (a.equals("rogue")){
			System.out.println("You are a Rogue");
		}
		else if (a.equals("Wizard")){
			System.out.println("You are a wizard");
		}
		else if (a.equals("wizard")){
			System.out.println("You are a wizard");
		}
		else {
			System.out.println("no role. Invalid input");
		}
	}
		public int setStrenght(int a) {
			System.out.println(a);
			return a;
		}
		public int setDexterity(int a) {
			System.out.println(a);
			return a;
		}
		public int setIntelligence(int a) {
			System.out.println(a);
			return a;
		}
		public int setConstitution(int a) {
			System.out.println(a);
			return a;
		}
		public int setCharisma(int a) {
			System.out.println(a);
			return a;
		}
	
	public static void main(String args[]) {
		// Your code goes below here
		String name = ("Warrior");
		setRole(name);
		setStrenght(5);
		setDexterity(5);
		setIntelligence(5);
		setConstitution(5);
		setCharisma(5);
	}
}
