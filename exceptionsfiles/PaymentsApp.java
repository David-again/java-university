package exceptionsfiles;

import java.util.Scanner;

public class PaymentsApp {
	
	// Take a payment from a user
	public static void main(String[] args) {
		double payment = 0;
		boolean positivePayment = false;
		
		do {
			// 1. Ask user for input
			System.out.print("Please enter the payment amount: ");

			// 2. Get the amount and test the value
			Scanner input = new Scanner(System.in);
			// 3. Handle any exceptions.
			try {
				payment = input.nextDouble();
				if (payment >= 0) {
					positivePayment = true;
				} else {
					// "Throw" a user-defined exception (which is also created here)
					throw new NegativePaymentException(payment);
				}
			} catch (NegativePaymentException e) {
				// ...and here's where we "catch" the error
				System.out.println(e.toString());
				System.out.println("Please try again...");
			} 
		} while (!positivePayment);
			
		
		// 4. Print confirmation.
		
		System.out.println("Your payment of " + payment + " was received!");	
		
	}

}
