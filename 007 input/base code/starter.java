import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner Bob = new Scanner(System.in);
		String name;
		System.out.println("Type name");
		name = Bob.nextLine();
		System.out.println("First name is: " + name);
		Scanner Joe = new Scanner(System.in);
		String age;
		System.out.println("Type age");
		age = Joe.nexLine();
		System.out.println("Your age is: " + age);
		Scanner Josh = new Scanner(System.in);
		String bmonth;
		System.out.println("Type birthday month");
		bmonth = Josh.nextLine();
		System.out.println("Your birthday month is: " + bmonth);
		Scanner John = new Scanner(System.in);
		String bday;
		System.out.println("Type birthday day");
		bday = John.nextLine();
		System.out.println("Your birthday day is: " + bday);
		Scanner Peter = new Scanner(System.in);
		String byear;
		System.out.println("Type birthday year");
		byear = Peter.nextLine();
		System.out.println("Your birthday year is: " + byear);
		Scanner money = new Scanner(System.in);
		String caching;
		System.out.println("How much is a buck fifty");
		caching = money.nextLine();
		System.out.println("A buck fifty: " + caching);
	}
}
