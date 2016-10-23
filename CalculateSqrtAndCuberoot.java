package Day3.Assignment1;

import java.util.Scanner;

public class CalculateSqrtAndCuberoot {

	public static void main(String[] args) {

		// Input of the number for which Sq Root and Cube Root is to be found
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number : ");
		Double d = scan.nextDouble();
		scan.close();
		// Printing the Square Root by using static method : sqrt
		System.out.println("Square Root of " + d + " = " + Math.sqrt(d));

		// Printing the Square Root by using static method : cbrt
		System.out.println("Cube root " + d + " = " + Math.cbrt(d));

	}

}
