import java.util.Scanner;
import java.lang.Math;

class helloWorld
{

	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Guesss a Number up to ten: ");

		int usernumber = scanner.nextInt();
		double numgen = Math.random() * 10;
		System.out.println(((int)numgen == usernumber) ? "Your Guess is Correct. The number is " + (int)numgen : "Your Guess is Wrong. The number is " + (int)numgen);
	}

}