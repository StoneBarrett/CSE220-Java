// Stone Barrett
// Binary to Decimal Converter

import java.util.Scanner;

public class BinarytoDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Variables
		String binary, sub1, sub2, sub3, sub4, sub5, sub6, sub7, sub8;
		int decimal, nsub1, nsub2, nsub3, nsub4, nsub5, nsub6, nsub7, nsub8;
		
		// Scan setup
		Scanner scan = new Scanner(System.in);
		
		// Interface
		System.out.print("Enter a number in binary to be converted to decimal: \n");
		binary = scan.nextLine();
		
		// Substrings
		sub1 = binary.substring(0,1);
		sub2 = binary.substring(1,2);
		sub3 = binary.substring(2,3);
		sub4 = binary.substring(3,4);
		sub5 = binary.substring(4,5);
		sub6 = binary.substring(5,6);
		sub7 = binary.substring(6,7);
		sub8 = binary.substring(7,8);
		
		// Convert subs to int
		nsub1 = Integer.parseInt(sub1);
		nsub2 = Integer.parseInt(sub2);
		nsub3 = Integer.parseInt(sub3);
		nsub4 = Integer.parseInt(sub4);
		nsub5 = Integer.parseInt(sub5);
		nsub6 = Integer.parseInt(sub6);
		nsub7 = Integer.parseInt(sub7);
		nsub8 = Integer.parseInt(sub8);
		
		// Convert binary to decimal
		decimal = nsub8 + (2 * nsub7) + (4 * nsub6) + (8 * nsub5) + (16 * nsub4) + (32 * nsub3) + (64 * nsub2) + (128 * nsub1);
		
		// Final
		System.out.print("\nThe base-10 equivalent is: " + decimal);
		
	}

}

