package oop;

public class BankAccount {
	// Define variables (or properties?)
	String accountNumber;
	
	// static >> belongs to the CLASS, not the object
	// final >> constant (often static final)
	static final String routingNumber = "0241";
	String name;
	String ssn;
	String accountType;
	
	// Constructor definitions (i.e. unique methods)
		// 1. The define/setup/initialize properties of the object
		// 2. IMPLICITLY called upon object instantiation
		// 3. The same name as the class itself.
		// 4. Constructors have NO return type at all 
		//		(i.e. no void, no String, no int, etc preceeding the constructor name)
	BankAccount() {
		System.out.println("NEW ACCOUNT CREATED");
	}
	
	// Overloading: call same method name with different arguments
	BankAccount(String accountType){
		System.out.println("NEW ACCOUNT: " + accountType);
	}
	
	BankAccount(String accountType, double initDeposit) {
		System.out.println("NEW ACCOUNT: " + accountType);
		System.out.println("INITIAL DEPOSIT OF: $" + initDeposit);
	}
	
	// Define methods
	void deposit() {
		
	}
	
	void withdraw() {
		
	}
	
	void checkBalance() {
		
	}
	
	void getStatus() {
		
	}
	
	

}
