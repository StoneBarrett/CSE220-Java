// Stone Barrett
// Assignment 5 - Problem 1

public class SSNCharacterException extends Exception
{
	public SSNCharacterException(String ssn)
	{
		super("SSN entered: " + ssn + ".\nSSN should contain 9 digits (no dashes, spaces, or characters)");
	}
}