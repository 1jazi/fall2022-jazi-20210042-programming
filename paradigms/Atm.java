package paradigms;

import java.util.Scanner;

public class Atm {
	// i have used access modifier here and use private for more secure 
	protected int balance=100000;
	private String password;
    String userName;
	String location;
	public String name="";
	int choice = 0;
     
	// define scanner
	Scanner scanner = new Scanner(System.in);
    // constructor have one parameter 
	public Atm(String name) {

		this.name = name;
		System.out.println("** Welcome to "+name+" bank **");
	}
	//default constructor 
	public Atm() {
		System.out.println("----------------------");
	}
	// encapsulation , getters and setters 
	public String getPassword() {
		return password;
	}
	public void setUserName(String userName) {
        
		System.out.print("Enter user name : ");
		this.userName = scanner.nextLine();
	}
	public void setPassword(String password) {
        
		System.out.print("Enter your passowrd : ");
		this.password = scanner.nextLine();
        
        	
        }
   
	public String getUserName() {
		return userName;
	}
    // method and i make override in  sub class
	public void bank() {
		System.out.println("Hello costumer "+getUserName());
	}

}
