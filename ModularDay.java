import java.util.Scanner;
import java.lang.Math;

class modularDay
{

	public static void main(String args[])
	{
		menu();
	}
	
	public static void menu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Modular Arithmetic Calculator");
		System.out.println("1 - Hours Modular Arithmetic");
		System.out.print("Pick Menu Number: ");
		int menuNum = scanner.nextInt();
		
		switch (menuNum) {
			case 1:
				System.out.println();
				hoursCalculator();
				break;
			default:
				System.out.println("Invalid Menu Number. Try Again.");
		} 
	}
	
	public static void hoursCalculator() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hours Modular Arithmetic Calculator");
		
		System.out.print("Enter the Hours: ");
		int hours = scanner.nextInt();
		
		while (hours < 0) {
			System.out.println("Invalid Hours. Only Positive Numbers.");
			System.out.print("Enter the Hours: ");
			hours = scanner.nextInt();
		}
		
		System.out.print("Enter the Time: ");
		int time = scanner.nextInt();
		
		while (time <= 0 || time > 12) {
			System.out.println("Invalid Time. Only 1-12.");
			System.out.print("Enter the Time: ");
			time = scanner.nextInt();
		}
		
		scanner.nextLine();
		System.out.print("AM OR PM: ");
		String meridiem = scanner.nextLine();
		
		while (true) {
			if (meridiem.equalsIgnoreCase("pm") || meridiem.equalsIgnoreCase("am")) {
				break;
			} else {
				System.out.println("Invalid Meridiem. Only PM OR AM.");
				System.out.print("AM OR PM: ");
				meridiem = scanner.nextLine();
			}
		}
		
		System.out.print("Before or After: ");
		String when = scanner.nextLine();
		
		while (true) {
			if (when.equalsIgnoreCase("before") || when.equalsIgnoreCase("after")) {
				break;
			} else {
				System.out.println("Invalid when. Only Before OR After.");
				System.out.print("Before or After: ");
				when = scanner.nextLine();
			}
		}
		
		
		
		int hourremainder;
		int hourWholenumber = hours / time;
		String whenUPPER = when.toUpperCase(); 
		
		
		if (whenUPPER.equalsIgnoreCase("after")) {
			hourremainder = (hours % 12) + time;
		} else {
			hourremainder = time - (hours % 12);
		}
		
		switch (whenUPPER) {
			case "AFTER":
			
			if ((hourWholenumber % 2) == 0) {
				if (hourremainder > 12) {
					System.out.println("Time after: "+ (hourremainder-12) + meridiem);
				} else {
				System.out.println("Time after: "+ hourremainder + meridiem);
				}	
			} else {
			
				if (meridiem.equalsIgnoreCase("am")) {
					meridiem = "PM";
				} else {
					meridiem = "AM";
				}

			
				if (hourremainder > 12) {
					System.out.println("Time after: "+ (hourremainder-12) + meridiem);
				} else {
				System.out.println("Time after: "+ hourremainder + meridiem);
				}
				
			}
			break;
			case "BEFORE":
			
			if ((hourWholenumber % 2) == 0) {
				if (hourremainder < 0) {
					System.out.println("Time after: "+ (hourremainder+12) + meridiem);
				} else {
				System.out.println("Time after: "+ hourremainder + meridiem);
				}	
			} else {
				if (meridiem.equalsIgnoreCase("am")) {
					meridiem = "PM";
				} else {
					meridiem = "AM";
				}

			
				if (hourremainder < 0) {
					System.out.println("Time after: "+ (hourremainder+12) + meridiem);
				} else {
				System.out.println("Time after: "+ hourremainder + meridiem);
				}
				
			}
		}
	}
}
