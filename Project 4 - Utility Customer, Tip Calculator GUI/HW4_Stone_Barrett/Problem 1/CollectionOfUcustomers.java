// Stone Barrett
// Assignment 4 - Problem 1

// Import library and scanner
import java.util.Arrays;
import java.util.Scanner;

// Class begin
public class CollectionOfUcustomers {

		// Main function
       	public static void main(String args[]) {
       		
       		// Set up scanner
       		Scanner input = new Scanner(System.in);

       		// Initialization
       		UtilityCustomer[] utilityCustomers = new UtilityCustomer[10];
       		int accountNo = 0, cubicMetUsed, kWattUsed;

       		// Interface
            for (int idx = 0; idx < 10; idx++) 
            {
            	System.out.println("User #" + (idx + 1));
            	
            	// Electric
            	if (idx % 2 == 0) 
            	{
            		System.out.print("Gas Account Number: ");
            		accountNo = Integer.parseInt(input.nextLine());
            		System.out.print("Gas consumption : ");
            		cubicMetUsed = Integer.parseInt(input.nextLine());
            		utilityCustomers[idx] = new GasCustomer(accountNo, cubicMetUsed);
            	}

                 // Gas
            	else 
            	{
            		System.out.print("Electricity Account Number: ");
            		accountNo = Integer.parseInt(input.nextLine());
            		System.out.print("Electricity consumption : ");
            		kWattUsed = Integer.parseInt(input.nextLine());
            		utilityCustomers[idx] = new ElectricCustomer(accountNo, kWattUsed);
            	}

             }

            // Sort in descending order
            Arrays.sort(utilityCustomers);

            System.out.println("Sorted list of Utiliy Customers");

            // print utility customer details
            for (int idx = 0; idx < 10; idx++) 
            {
            	System.out.println("=========================================");
            	System.out.println(utilityCustomers[idx]);
            }

            // Close scanner
            input.close();
       }
}