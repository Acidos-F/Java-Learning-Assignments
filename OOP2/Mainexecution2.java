import java.util.Scanner;

class Mainexecution2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		studentClass studentInfo = new studentClass();
		System.out.println(); System.out.println();
		
		for (int i = 1; i <= studentInfo.Numstudent; i++) {
			System.out.println("Student "+i+":"); 
			System.out.print("Student Name: "); String name = sc.nextLine(); 
			System.out.print("Student Grade: ");
			int grade = sc.nextInt();
			sc.nextLine(); 
			if (grade >= 1 && grade <= 100) {studentInfo.StudentGrade = grade; studentInfo.totalGrade += grade;} else {System.out.println("NOT A VALID GRADE"); i--;}
			
			studentInfo.studentGradeClassifierMethod();
			
			System.out.println("Interpretation of Grade: "+studentInfo.gradeetoLetter);
			System.out.println(); System.out.println();
		}
		studentInfo.totalGrade = studentInfo.totalGrade / studentInfo.Numstudent;
		studentInfo.weightedAverage = studentInfo.totalGrade;
		
		studentInfo.overallGradeClassifierMethod();
		
		System.out.println("Overall Avarage of Student:" + studentInfo.totalGrade + " to letter: "+ studentInfo.gradeetoLetter);
		
	}
}



/* OUTPUT EXAMPLE:
student 1:
Student name: ()
student grade: ()
interpretation of grade: ( A+ - F-)


student 2:
Student name: ()
student grade: ()
interpretation of grade: ( A+ - F-)


student 3:
Student name: ()
student grade: ()
interpretation of grade: ( A+ - F-)

overall avarage of student: ()
*/