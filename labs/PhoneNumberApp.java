package labs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PhoneNumberApp {

	public static void main(String[] args) {
		// This program will read a text file (containing a phone number).
		// It will display the phone number if it is "valid" (see criteria in comments below).
		// TODO: Improve upon this to read the entire file for multiple phone numbers
		// .....and notify the user of which ones are valid and which ones are not. 
		
		String filename = "C:\\SDETuniversity\\Workspaces\\JavaTraining\\src\\PhoneNumber.txt";
		File file = new File(filename);
		String phoneNum = null;
		
		// TECHNIQUE:
		// This try-catch is for file-reading related errors.  
		// A second try-catch below is used for validating the phone number prior to displaying it.
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			phoneNum = br.readLine();
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: File not found!");
		} catch (IOException e) {
			System.out.println("ERROR: Could not read file");
		}
		
		// Valid phone number meets the following criteria:
				// (a) exactly 10 digits long
				// (b) Area code cannot start in 0 or 9
				// (c) There can be no 911 in the phone number
		try {
			
			if (phoneNum.length() != 10) {
				// Criteria (a)
				throw new TenDigitsException(phoneNum);
			}
			if ((phoneNum.substring(0, 1).equals("0")) || (phoneNum.substring(0, 1).equals("9"))) {
				// Criteria (b)
				throw new AreaCodeException(phoneNum);
			}
			if (phoneNum.contains("911")) {
				// Criteria (c)
				throw new EmergencyException(phoneNum);
			}
			
			System.out.println(phoneNum);	// This is the 'potential problem statement' around which this try-catch is built...
			// The "if statements" above it are to throw specific user-defined errors that are handled in the relevant classes below.
		} catch (TenDigitsException e) {
			System.out.println("ERROR: Phone number is not 10 digits");
			//	e.printStackTrace();
			System.out.println(e.toString());
		} catch (AreaCodeException e) {
			System.out.println("ERROR: Invalid area code.");
			// e.printStackTrace();
			System.out.println(e.toString());
		} catch (EmergencyException e) {
			System.out.println("ERROR: Phone number string containing emergency numbers not allowed.");
			// e.printStackTrace();
			System.out.println(e.toString());
		}

	}

}


// The following are custom-built exception handlers.
class TenDigitsException extends Exception {
	String num;
	TenDigitsException(String num){
		// Constructor for the exception
		this.num = num;
	}
	public String toString() {
		// Overriding used to re-purpose this function.
		return("TenDigistException: " + num);
	}
}

class AreaCodeException extends Exception {
	String num;
	AreaCodeException(String num){
		// Constructor
		this.num = num;
	}
	public String toString() {
		// Overriding used to re-purpose this function.
		return("AreaCodeException: " + num);
	}
}

class EmergencyException extends Exception {
	String num;
	EmergencyException(String num) {
		// Constructor
		this.num = num;
	}
	public String toString() {
		// Overriding used to re-purpose this function.
		return("EmergencyException: " + num);
	}
}

