import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner one = new Scanner(System.in);
		int onee;
		System.out.println("Type a number");
		onee = one.nextInt();
		System.out.println("First number is " + onee);
		Scanner two = new Scanner(System.in);
		int twoo;
		System.out.println("Type another number");
		twoo = two.nextInt();
		System.out.println("Second number is " + twoo);
		boolean x = onee>twoo;
		if(x)
		{
			System.out.println(onee + " is bigger than " + twoo);
		}
		boolean z = onee<twoo;
		if(z)
		{
			System.out.println(onee + " is smaller than " + twoo);
		}
		
		
	}
}
