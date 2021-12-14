// Stone Barrett
// Assignment 5 - Problem 1

public class SSNLengthException extends Exception
{
	public SSNLengthException(String ssn)
		{
			super("SSN entered: " + ssn + ".\nSSN should contain 9 digits (no dashes, spaces, or characters)");
		}
}