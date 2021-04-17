package exceptionsfiles;

public class NegativePaymentException extends Exception {

	double payment;
	
	// 1. Constructor that takes as argument, the value which threw the exception.
	public NegativePaymentException(double payment) {
		// 2. Use class variable to make the argument available to other class methods.
		this.payment = payment;
	}
	
	// Override the toString() method to include user-defined message.
	public String toString() {
		return "ERROR: Cannot take a negative payment (" + this.payment + ")";
	}
}
