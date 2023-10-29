import java.util.Scanner;

public class studentClass {
	Scanner sc = new Scanner(System.in);
	int Numstudent;
	int totalGrade = 0;
	int StudentGrade = 0;
	int weightedAverage;
	String gradeetoLetter;
	
	public studentClass() {
		System.out.print("Enter the number of Student: ");
		int studentnum = sc.nextInt();
		Numstudent = studentnum;
	}
	
	public void studentGradeClassifierMethod() {
		if (StudentGrade >= 97 && StudentGrade <= 100) {gradeetoLetter = "A+";}
		else if (StudentGrade >= 93 && StudentGrade <= 96) {gradeetoLetter = "A";}
		else if (StudentGrade >= 90 && StudentGrade <= 92) {gradeetoLetter = "A-";}
		else if (StudentGrade >= 87 && StudentGrade <= 89) {gradeetoLetter = "B+";}
		else if (StudentGrade >= 83 && StudentGrade <= 86) {gradeetoLetter = "B";}
		else if (StudentGrade >= 80 && StudentGrade <= 82) {gradeetoLetter = "B-";}
		else if (StudentGrade >= 77 && StudentGrade <= 79) {gradeetoLetter = "C+";}
		else if (StudentGrade >= 73 && StudentGrade <= 76) {gradeetoLetter = "C";}
		else if (StudentGrade >= 70 && StudentGrade <= 72) {gradeetoLetter = "C-";}
		else if (StudentGrade >= 67 && StudentGrade <= 69) {gradeetoLetter = "D+";}
		else if (StudentGrade >= 65 && StudentGrade <= 66) {gradeetoLetter = "D";}
		else if (StudentGrade < 65 ) {gradeetoLetter = "E/F";}
		else {gradeetoLetter = "UNKNOWN GRADE";}
	}
	
	public void overallGradeClassifierMethod() {
		if (weightedAverage >= 97 && weightedAverage <= 100) {gradeetoLetter = "A+";}
		else if (weightedAverage >= 93 && weightedAverage <= 96) {gradeetoLetter = "A";}
		else if (weightedAverage >= 90 && weightedAverage <= 92) {gradeetoLetter = "A-";}
		else if (weightedAverage >= 87 && weightedAverage <= 89) {gradeetoLetter = "B+";}
		else if (weightedAverage >= 83 && weightedAverage <= 86) {gradeetoLetter = "B";}
		else if (weightedAverage >= 80 && weightedAverage <= 82) {gradeetoLetter = "B-";}
		else if (weightedAverage >= 77 && weightedAverage <= 79) {gradeetoLetter = "C+";}
		else if (weightedAverage >= 73 && weightedAverage <= 76) {gradeetoLetter = "C";}
		else if (weightedAverage >= 70 && weightedAverage <= 72) {gradeetoLetter = "C-";}
		else if (weightedAverage >= 67 && weightedAverage <= 69) {gradeetoLetter = "D+";}
		else if (weightedAverage >= 65 && weightedAverage <= 66) {gradeetoLetter = "D";}
		else if (weightedAverage < 65 ) {gradeetoLetter = "E/F";}
		else {gradeetoLetter = "UNKNOWN GRADE";}
	}
	
}