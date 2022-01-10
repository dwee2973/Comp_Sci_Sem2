import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner Zoe = new Scanner(System.in);
		int one;
		System.out.println("Type one number");
		one = Zoe.nextInt();
		System.out.println("Your first numebr is " + one);
		Scanner Joe = new Scanner(System.in);
		int two;
		System.out.println("Type a second number");
		two = Joe.nextInt();
		System.out.println("Your second number is " + two);
		boolean x = (one==two);
		if (x)
		{
			System.out.println(one + " is equal to " + two);
		}
		boolean z = one>two;
		if (z)
		{
			System.out.println(one + " is not equal to " + two);
		}
		boolean y = one<two;
		if (y)
		{
			System.out.println(one + " is not equal to " + two);
		}
		
	}
}
