// Stone Barrett
// Assignment 3

// Import scanner
import java.util.Scanner;

// Open class
public class Website_User
{
	
	// Main function
	public static void main(String[] args)
	{
		
		// Set up scanner
		Scanner sc = new Scanner(System.in);
		
		// Interface with user, prompting for information
		String[] userInfo = new String[6];
		System.out.println("Enter username:");
		userInfo[0] = sc.nextLine();
		System.out.println("Enter your name:");
		userInfo[1] = sc.nextLine();
		System.out.println("Enter password:");
		userInfo[2] = sc.nextLine();
		System.out.println("Re-enter password:");
		userInfo[3] = sc.nextLine();
		System.out.println("Enter email address:");
		userInfo[4] = sc.nextLine();
		System.out.println("Enter phone number:");
		userInfo[5] = sc.nextLine();
		
		// Checks with other class to verify email or prompt re-entry
		ProcessForm processForm = new ProcessForm(userInfo);
		while (!processForm.CheckEmailAdd(userInfo[4]))
		{
			System.out.println("Enter valid email address:");
			processForm.setInfo(sc.nextLine(),4);
		}
		
		// Checks with other class to verify password re-entry or prompt second attempt
		while (!processForm.CheckPasswords(userInfo[2],userInfo[3]))
		{
			System.out.println("Passwords didn't match.\nEnter password:");
			processForm.setInfo(sc.nextLine(),2);
			System.out.println("Re-enter password:");
			processForm.setInfo(sc.nextLine(),3);
		}
		
		// Checks with other class to verify phone number or prompt re-entry
		while (!processForm.CheckPhone(userInfo[5]))
		{
			System.out.println("Enter valid phone number (xxx-xxx-xxxx or xxx-xxxx):");
			processForm.setInfo(sc.nextLine(),5);
		}
		
		// Prints information
		System.out.print(processForm.toString());
		
		// Close scanner
		sc.close();
	}
}
