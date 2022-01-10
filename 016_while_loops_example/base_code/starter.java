import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner joe = new Scanner(System.in);
		String name;
		System.out.println("What is you name?");
		name = joe.nextLine();
		int bob;
		System.out.println("How many times do you want your name to be printed?");
		bob = joe.nextInt();
		int c = 0;
		while(true)
	{
			if(c == bob)
			{
				break;
			}
			c = c + 1;
			
			System.out.println(name);
	}
	}
}
