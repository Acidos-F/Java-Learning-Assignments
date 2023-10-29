import java.util.Scanner;
import java.lang.Math;

class rangeSum
{

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Sum of Number to 0: ");
		int num = sc.nextInt(); System.out.println();
		
		System.out.print("Start of the Sum range: "); int start = sc.nextInt(); System.out.print("End of the Sum range: "); int end = sc.nextInt(); System.out.println();
		
		System.out.println("Using For Loop: "+ rangesum1(num));
		System.out.println("Using Method Recursion(start, end): "+ rangeSumRecursion2(start, end));
	}
	
	public static int rangesum1(int i) {
		int k = 0;
		for (int x = i; x != 0; x--) {
			k += x;
		}
		return k;
	}
	
	public static int rangeSumRecursion(int i) {
		if (i > 0) {
			return i + rangeSumRecursion(i - 1);
		} else {
			return 0;
		}
	}

	public static int rangeSumRecursion2(int start, int end) {
		if (end > start) {
			return end + rangeSumRecursion2(start, end - 1);
		} else {
			return end;
		}
	}
}