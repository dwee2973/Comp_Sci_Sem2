import java.util.Scanner;
import java.util.Random;
class starter {
public static void toString(String a) {
		System.out.println(a);
	}
	
public static void StringCombined(String a, String b) {
		System.out.println(a + " " + b);
	}

	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input one things peasant and I'll print them out");
		String input = sc.nextLine();
		toString(input);
		System.out.println("Please input two other things peasant and I'll print them out");
		String input1 = sc.nextLine();
		String input2 = sc.nextLine();
		StringCombined(input1, input2);
		}
}
