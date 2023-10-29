import java.util.Scanner;
import java.lang.Math;

class loginCheck
{

	public static void main(String args[])
	{
		loginChecker();
	}
	
	public static void loginChecker() {
		Scanner sc = new Scanner(System.in); int retry = 3;
		
		while (true) {
			if (retry == 0) {System.out.println();System.out.println("You have reached the limit. Try again later.");break;} 
			System.out.print("Enter your username: "); String user = sc.nextLine(); System.out.print("Enter your password: "); String pass = sc.nextLine();
			if (user.equalsIgnoreCase("gab") && pass.equals("gab123")) {System.out.println("Correct Information. Logging in."); break;} else {System.out.println("Incorrect Username/Password. Try Again.");retry -= 1;}
		}
	}

}