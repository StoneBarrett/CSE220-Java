// Stone Barrett
// Assignment 2

// Import scanner
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		
		// Set up scanner
		Scanner scan = new Scanner(System.in);
		
			// Year
			System.out.println("Enter year (2019-2025): ");
			int year = scan.nextInt();
			while (year < 2019 || year > 2025) {
			System.out.println("Invalid Year.\n Please enter a valid year: ");
			year = scan.nextInt();
			}
		
			// Job number
			System.out.println("Enter the job number (1-9999): ");
			int jobNumber = scan.nextInt();
			while (jobNumber < 1 || jobNumber > 9999) {
			System.out.println("Invalid job number.\n Please enter a valid number: ");
			jobNumber = scan.nextInt();
			}
			
			// Babysitter code
			System.out.println("Enter the babysitter code (1-3): ");
			int employeeCode = scan.nextInt();
			while (employeeCode < 1 || employeeCode > 3) {
			System.out.println("Invalid code.\n Please enter a valid Code: ");
			employeeCode = scan.nextInt();
			}
		
			// Children
			System.out.println("Enter the number of children (1-9): ");
			int numChildren = scan.nextInt();
			while (numChildren < 1 || numChildren > 9) {
			System.out.println("Invalid number of children.\n Please enter a valid number :");
			numChildren = scan.nextInt();
			}
			
			// Hours
			System.out.println("Enter the number of hours (1-12): ");
			int numHours = scan.nextInt();
			while (numHours < 1 || numHours > 12) {
			System.out.println("Invalid hours.\n Please enter valid hours: ");
			numHours = scan.nextInt();
			}
		
		//	Converts year 
		String yeartoString = Integer.toString(year);
		
		// Takes last two digits
		String lastTwo = yeartoString.substring(2,4);
		
		// Creates job code
		String jobcode = lastTwo + (String.format("%04d", jobNumber));
		BabysittingJob Job = new BabysittingJob(jobcode, employeeCode, numChildren, numHours);
	}
}