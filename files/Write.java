package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String[] args) {
		// 1. Define the path that we want to write the file to
		String filename = "...your path goes here\\FileToWrite.txt";
		// IMPORTANT: You need to specify a complete path (with desired filename) in the line above.
		//		e.g. "C:\\LearnJava\\FileToWrite.txt"
		String message = "This sentence is evidence that the file writing operation succeeded!";
		boolean fileWriteSuccessful = false;
		
		// 2. Create the file (using a file object)
		File file = new File(filename);
		
		FileWriter fw;
		try {
			// 3. Open the file
			fw = new FileWriter(file);
			
			// 4. Write to the file
			fw.write(message);
			fileWriteSuccessful = true;
			
			// 5. Close the resources
			fw.close();			
		} catch (IOException e) {
			System.out.println("Could not write file to " + filename);
			e.printStackTrace();
		} finally {
			if (fileWriteSuccessful) {
				System.out.println("Writing into the file was successful!");
			}
		}
		// Food for thought: 
		// How do I handle "any and all" errors that may be thrown by my program???  
	}

}
