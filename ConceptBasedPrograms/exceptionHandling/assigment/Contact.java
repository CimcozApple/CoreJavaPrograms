package com.psl.training.assigment;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Contact {
	String firstName ="Nidhi";
	String lastName="Agrawal";
	String misddleName="G";
	String datOfBirth="06/10/1998";
	String gender="Female";
	String address;
	String Area;
	String city;
	String pincode;
	String telephone="252200";
	String mobile="845120";
	String email="agrawal.nidhi6@gmail.com";
	String website;
	
	
	private static final String EMAIL_REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\."+"[a-zA-Z0-9_+&*-]+)*@" +"(?:[a-zA-Z0-9-]+\\.)+[a-z" +"A-Z]{2,7}$";

	private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

	public static boolean checkEmail(String email) {
		Matcher matcher = EMAIL_PATTERN.matcher(email);
		return matcher.matches();
	}
	
	public  void validate() throws Exception
	{
		try {
			if(firstName==null || lastName == null || datOfBirth == null || email == null)
				throw new Exception("Mandatory fields can not be empty");
			else if(telephone== null && mobile == null)
			{
				throw new Exception("Either Telephone or Mobile no must be specified");
			}
			else if(checkEmail(email) == false)
			{
				throw new Exception("Wrong Email-format,Correct Format is abc@xyz.com");
			}
					
		}catch(Exception ex)
		{
			throw ex;
		}
	}
	

	
}
