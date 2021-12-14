// Stone Barrett
// Triangle Calculator

// Importing libraries
import java.util.Scanner;
import java.lang.Math;
import java.text.DecimalFormat; 

// Class for all calculations
public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Variable initiation
		double x1, x2, x3, y1, y2, y3, p1p2, p2p3, p3p1, p, a, h;
		
		// Scan setup
		Scanner scan = new Scanner(System.in);
		
		// Round the output to three decimal places
        DecimalFormat fmt = new DecimalFormat("0.##");

		// Interface
		System.out.println("Triangle Calculator");
		System.out.println("Enter the first vertex point: ");
		System.out.print("X = ");
		x1 = scan.nextDouble();
		System.out.print("Y = ");
		y1 = scan.nextDouble();
		System.out.println("\nEnter the second vertex point: ");
		System.out.print("X = ");
		x2 = scan.nextDouble();
		System.out.print("Y = ");
		y2 = scan.nextDouble();
		System.out.println("\nEnter the third vertex point: ");
		System.out.print("X = ");
		x3 = scan.nextDouble();
		System.out.print("Y = ");
		y3 = scan.nextDouble();
		
		// Calculations
		p1p2 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2-y1, 2));
		p2p3 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3-y2, 2));
		p3p1 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1-y3, 2));
		System.out.print("\nThe distance between P1 and P2 is: " + fmt.format(p1p2));
		System.out.print("\nThe distance between P2 and P3 is: " + fmt.format(p2p3));
		System.out.print("\nThe distance between P3 and P1 is: " + fmt.format(p3p1));
		p = p1p2 + p2p3 + p3p1;
		System.out.print("\nPerimeter: " + fmt.format(p));
		h = p / 2;
		System.out.print("\n" + fmt.format(h));
		a = Math.sqrt(h * (h - p1p2) * (h - p2p3) * (h - p3p1));
		System.out.print("\nArea: " + fmt.format(a));
		
	}

}
