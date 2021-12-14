// Stone Barrett
// Assignment 3


// Import pattern

import java.util.regex.Pattern;

// Open class
public class ProcessForm
{
	
	// Create string array for users' information
	String[] UserInfo = new String[6];
	
	// Constructor, makes sure no empty elements are initialized
	public ProcessForm(String[] userInfo)
	{
		if(UserInfo.length == userInfo.length)
			UserInfo = userInfo;
		else
			System.out.println("Error");
	}
	
	public void setInfo(String value, int index)
	{
		UserInfo[index] = value;
	}
	
	// Creates method prepared to print all user information once verified
	@Override
	public String toString()
	{
		return "Username: "+UserInfo[0]+"\nName: "+UserInfo[1]+"\nEmail address: "+UserInfo[4]+"\nPhone: "+UserInfo[5];
	}
	
	// Makes sure passwords are the same
	public boolean CheckPasswords(String pass1, String pass2)
	{
		return pass1.equals(pass2);
	}
	
	// Verifies that email address is valid
	public boolean CheckEmailAdd(String email)
	{
		return Pattern.compile("\\w+@\\w+\\.+\\w+").matcher(email).matches();
	}
	
	// Verifies that phone number is valid
	public boolean CheckPhone(String phone)
	{
		boolean b1 = Pattern.compile("[2-9]\\d{2}-\\d{4}").matcher(phone).matches();
		boolean b2 = Pattern.compile("\\d{3}-[2-9]\\d{2}-\\d{4}").matcher(phone).matches();
		return b1||b2;
	}
}