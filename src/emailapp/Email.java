package emailapp;

import java.util.Scanner;

public class Email {

	private String firstname;
	private String lastname;
	private String department;
	private String email;
	private String company;
	private String password;
	private int mailboxCapacity;
	private int passwordLength = 8;
	
	// Constructor to receive the first name and last name
	public Email(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
		
		this.password = generateRandomPassword(passwordLength);
		this.department = AssignDepartment();
		this.email = this.firstname + "." + this.lastname + "@" + this.department + ".com";
		
		System.out.print(this.email + "\n");
	}
	
	// Ask for the department
	private String AssignDepartment() {
		System.out.print("enter dep code: ");
		Scanner in = new Scanner(System.in);
		int DepCode = in.nextInt();
		
		switch (DepCode) {
		case 1:
			department = "sales";
			break;
		case 2:
			department = "development";
			break;
		case 3:
			department = "accounting";
			break;
		default:
			department = "";
			break;
		}
		return department;
	}
	
	// Generate a random password
	private String generateRandomPassword(int length) {
		String passwordSet = ";lkajsdfoiuerns,asdf";
		char[] password = new char[length];
		for (int i=0; i<length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	

}
