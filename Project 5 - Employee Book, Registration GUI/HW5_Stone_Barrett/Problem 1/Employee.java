// Stone Barrett
// Assignment 5 - Problem 1

// Open class
public class Employee 
{
	// Initialization
	private String name;
	private double salary;
    private String ssnNumber;

    // Constructor
    public Employee(String name, double salary, String ssnNumber) throws SSNCharacterException, SSNLengthException
    {
    	setName(name);
    	setSalary(salary);
    	setSSNNumber(ssnNumber);
    }

    // Mutators
    public void setName(String name)
    {
    	this.name = name;
    }

    public void setSalary(double salary)
    {
    	this.salary = salary;
    }

    public void setSSNNumber(String ssnNumber) throws SSNCharacterException, SSNLengthException
    {
    	validateSSNNumber(ssnNumber);
    	this.ssnNumber = ssnNumber;
    }

    // Validate SSN
    private void validateSSNNumber(String ssnNumber) throws SSNCharacterException, SSNLengthException
    {
    	int count = 0;

        for(int i = 0; i < ssnNumber.length(); i++)
        {
            if(ssnNumber.charAt(i) >= '0' && ssnNumber.charAt(i) <= '9')
            	count++;
            else if((ssnNumber.charAt(i) != '-') && (ssnNumber.charAt(i) != ' '))
            	throw new SSNCharacterException(ssnNumber);
        }
            
        if(count != 9) 
        {
        	throw new SSNLengthException(ssnNumber);
        }
    }
       // Accessors
       public String getName()
       {
    	   return name;
       }

       public double getSalary()
       {
    	   return salary;
       }

       public String getSSNNumber()
       {
    	   return ssnNumber;
       }

       public boolean equals(Employee other)
       {
    	   return((name.equalsIgnoreCase(other.name)) || (ssnNumber.equalsIgnoreCase(other.ssnNumber)));
       }

       // Preparing information to be displayed
       public String toString()
       {
    	   return("SSN: " + ssnNumber + " Name: " + name + " Salary: " + String.format("%.2f", salary));
       }
}