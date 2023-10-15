package Emailapp;
import java.util.Scanner;
public class Email {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
	private String firstName;
	private String LastName;	
	private String Password;
	private String department;
	private String Email;
	private int mailboxCapacity;
	private int defaultPasswordlength=500;
	private String alternateEmail;
	private String companySuffix="my company.com";
	
	//constructor to recieve the firstname and lastname
	public Email(String firstName,String lastName) {
		this.firstName=firstName;
		this.LastName=lastName;
		System.out.println("Email created:" + this.firstName + ""+this.LastName);
	//calls a method for the department return the department
	this.department=setDepartment();
	System.out.println("Department:"+ this.department);
	//call a method that returns a random password
	this.Password=randomPassword(defaultPasswordlength);
	System.out.println("your password is:"+ this.Password);
	String Email = firstName.toLowerCase()+" "+LastName.toLowerCase()+"" + department +companySuffix;
	System.out.println("your email is:"+Email);
	}
	private String setDepartment() {
		System.out.println("New worker:*+firstName+* +Enter the department \n1 for sales \n2 for development \n3 for accounting \n0 for none:");
	try (Scanner in = new Scanner(System.in)) {
		int depChoice=in.nextInt();
		if(depChoice==1) {return "sales";}
		else if(depChoice==2) {return "dev";}
		else if(depChoice==3) {return "acc";}
		else {return"";}
	}
	}
	//Generate a random password
    private String randomPassword(int length) {
    	String passwordset="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
    char[]password=new char[length];
    for(int i=0;i<length;i++) {
    int rand=(int)(Math.random() * passwordset.length());
    password[i]=passwordset.charAt(rand);
    }
    return new String(password);
    }
//set the mailbox capacity
    public void setMailboxCapacity(int capacity) {
    	this.mailboxCapacity = capacity;
    }
    // set alternate Email
    public void setAlternateemail(String altEmail) {
    	this.alternateEmail=altEmail;
    }
    public void changePassword(String password) {
    	this.Password=password;
    }
    public int getMailboxCapacity() {return mailboxCapacity;}
    public String getAlternateEmail() {return alternateEmail;}
    
    public String getPassword() {return Password;}
	public String showinfo() {
		return " Display name: " + firstName + " " + LastName + "/ncompany Email :"+Email+"/nmailbox Capacity:"+mailboxCapacity+" ab";
	}
}


