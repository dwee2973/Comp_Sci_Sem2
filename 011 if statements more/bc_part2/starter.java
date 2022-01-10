import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		System.out.println("Type in three numbers and I will say which is the biggest number and which is the smallest :)");
		Scanner Sam = new Scanner(System.in);
		int three;
		System.out.println("Type one number");
		three = Sam.nextInt();
		System.out.println("Your first numebr is " + three);
		Scanner Yoon = new Scanner(System.in);
		int four;
		System.out.println("Type one number");
		four = Yoon.nextInt();
		System.out.println("Your second numebr is " + four);
		Scanner John = new Scanner(System.in);
		int five;
		System.out.println("Type one number");
		five = John.nextInt();
		System.out.println("Your first numebr is " + five);
		if ((three > four) && (three > five)){
			System.out.println(three + " is the biggest number");
		}
		if ((three < four) && (three > five)){
			System.out.println(three + " is the second biggest number");
		}
		if ((three > four) && (three < five)){
			System.out.println(three + " is the second biggest number");
		}
		if ((three < four) && (three < five)){
			System.out.println(three + " is the smallest number");
		}
		if ((four < three) && (four < five)){
			System.out.println(four + " is the smallest number");
		}
		if ((four < three) && (four > five)){
			System.out.println(four + " is the second biggest number");
		}
		if ((four > three) && (four < five)){
			System.out.println(four + " is the second biggest number");
		}
		if ((four > three) && (four > five)){
			System.out.println(four + " is the biggest number");
		}
		if ((five < three) && (five < four)){
			System.out.println(five + " is the smallest number");
		}
		if ((five < three) && (five > four)){
			System.out.println(five + " is the second biggest number");
		}
		if ((five > three) && (five < four)){
			System.out.println(five + " is the second biggest number");
		}
		if ((five > three) && (five > four)){
			System.out.println(five + " is the biggest number");
		}
	}
}
