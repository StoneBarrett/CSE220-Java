// Stone Barrett
// Assignment 2

// Import scanner
import java.util.Scanner;

public class BabysittingJob 
{	

	// Instance variables
	private String jobNum;
	private int employee;
	private int numChildren;
	private int numHours;
	private double jobFee;
	private String employeeName;
	
    // Constructor that accepts four arguments
	public BabysittingJob(String jobNum, int employee, int numChildren, int numHours)
	{
		
		// Assigns arguments to instance variables
		this.jobNum = jobNum;
		this.employee = employee;
		this.numChildren = numChildren;
		this.numHours = numHours;
		
		// Determines which babysitter
		switch (employee) {
		case 1: employeeName = "Cindy"; break;
		case 2: employeeName = "Greg"; break;
		case 3: employeeName = "Marcia"; break;
		}
	
		// Calculates fee
		if (employee == 1)
				{jobFee = (numChildren*numHours*7);}
		else if (employee == 2)
				{jobFee = (9*numHours)+(4*numHours*(numChildren-1));}
		else
				{jobFee = (9*numHours)+(4*numHours*(numChildren-1));}
	
	
	// toString to display information
	String a,b,c,d;
	a = Integer.toString(employee);
	b = Integer.toString(numChildren);
	c = Integer.toString(numHours);
	d = Double.toString(jobFee);
	

	// Display information
	System.out.printf("\nJob Number: "+jobNum
						+ "\nEmployee Code: "+a
						+ "\nNumber of Children: "+b
						+ "\nNumber of Hours: "+c
						+ "\nBabysitter: "+employeeName
						+ "\nFees: "+ d);
	}
	
}