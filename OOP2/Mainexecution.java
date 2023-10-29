import java.util.Scanner;

class Mainexecution
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		studentClass studentInfo = new studentClass();
		
		for (int i = 1; i <= studentInfo.Numstudent; i++) {
			System.out.print(i + ".) Enter your name: "); String name = sc.nextLine(); 
			System.out.print(i + ".) Student Grade: ");
			int grade = sc.nextInt();
			sc.nextLine(); 
			if (grade >= 1 && grade <= 100) {studentInfo.totalGrade += grade;} else {System.out.println("NOT A VALID GRADE"); i--;}
		}
		
		studentInfo.weightedAverage = studentInfo.totalGrade / studentInfo.Numstudent;
		
		if (studentInfo.weightedAverage >= 97 && studentInfo.weightedAverage <= 100) {studentInfo.gradeetoLetter = "A+";}
		else if (studentInfo.weightedAverage >= 93 && studentInfo.weightedAverage <= 96) {studentInfo.gradeetoLetter = "A";}
		else if (studentInfo.weightedAverage >= 90 && studentInfo.weightedAverage <= 92) {studentInfo.gradeetoLetter = "A-";}
		else if (studentInfo.weightedAverage >= 87 && studentInfo.weightedAverage <= 89) {studentInfo.gradeetoLetter = "B+";}
		else if (studentInfo.weightedAverage >= 83 && studentInfo.weightedAverage <= 86) {studentInfo.gradeetoLetter = "B";}
		else if (studentInfo.weightedAverage >= 80 && studentInfo.weightedAverage <= 82) {studentInfo.gradeetoLetter = "B-";}
		else if (studentInfo.weightedAverage >= 77 && studentInfo.weightedAverage <= 79) {studentInfo.gradeetoLetter = "C+";}
		else if (studentInfo.weightedAverage >= 73 && studentInfo.weightedAverage <= 76) {studentInfo.gradeetoLetter = "C";}
		else if (studentInfo.weightedAverage >= 70 && studentInfo.weightedAverage <= 72) {studentInfo.gradeetoLetter = "C-";}
		else if (studentInfo.weightedAverage >= 67 && studentInfo.weightedAverage <= 69) {studentInfo.gradeetoLetter = "D+";}
		else if (studentInfo.weightedAverage >= 65 && studentInfo.weightedAverage <= 66) {studentInfo.gradeetoLetter = "D";}
		else if (studentInfo.weightedAverage < 65 ) {studentInfo.gradeetoLetter = "E/F";}
		else {studentInfo.gradeetoLetter = "UNKNOWN GRADE";}
		
		System.out.println("Weighted Average: " + studentInfo.weightedAverage + " to letter: "+ studentInfo.gradeetoLetter);
		
	}
}
