// Stone Barrett
// Assignment 5 - Problem 1

// Importing scanner
import java.util.Scanner;

// Open class
public class EmployeeBuilder 
{
	// Check if employee number already in use
    private static boolean checkEmployeeEquality(Employee employees[], Employee emp, int count)
    {
        for(int i = 0; i < count; i++)
        {
            if(employees[i].equals(emp))
            	return true;
        }
        return false;
    }

    // Calculate average salary of all employees
    private static double averageSalary(Employee employees[], int count)
    {
    	double total = 0;

        for(int i = 0; i < count; i++)
        {
        	total += employees[i].getSalary();
        }

        if(count > 0)
        	return(total/count);
        else
        	return 0;
    }

    // Main function
    public static void main(String[] args)
    {
    	Employee employees[] = new Employee[100];
    	int count = 0;
    	String choice, name, ssnNumber;

        Scanner scan = new Scanner(System.in);

        double salary;

        // Loop until user enters "n" or array reaches 100 entries
        do
        {
        	// UI, prompting for information
            System.out.println("Enter details for Employee " + (count + 1) + ": ");
            System.out.print("Name: ");
            name = scan.nextLine();
            System.out.print("SSN: ");
            ssnNumber = scan.nextLine();
            System.out.print("Salary: ");
            salary = scan.nextDouble();
            scan.nextLine();

            try 
            {
            	employees[count] = new Employee(name, salary, ssnNumber);

                // Check if employee already exists
                if(!checkEmployeeEquality(employees, employees[count], count))
                	count++;
                else
                	System.out.println("Employee with same name or SSN already exists");
            } catch(SSNCharacterException | SSNLengthException e) 
            		{
            			System.out.println(e.getMessage());
                    }

                // Prompt for more employees
                System.out.print("Do you want to enter more records? (y/n)");
                choice = scan.nextLine();

        }while((choice.equalsIgnoreCase("y")) && (count < 100));

        double avg = averageSalary(employees, count);

        // Display all records
        System.out.println("Details of the Employees : ");

        for(int i = 0; i < count; i++)
        {
        	if(employees[i].getSalary() < avg)
        		System.out.println(employees[i] + " Salary below average");
            else
            	System.out.println(employees[i] + " Salary above average");
        }
        scan.close();
    }
}

