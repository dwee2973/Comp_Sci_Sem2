import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Random rand = new Random();
		int nine = rand.nextInt(10);
		System.out.println(nine);
		Random randd = new Random();
		int hundred = randd.nextInt(100);
		System.out.println(hundred);
		Random randdd = new Random();
		double twothree = randdd.nextDouble()*1 + 2.5;
		System.out.println(twothree);
		Random randddd = new Random();
		double fiveeightnine = randddd.nextDouble()*575 + 14;
		System.out.println(fiveeightnine);
	}
}
