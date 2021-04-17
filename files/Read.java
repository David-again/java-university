package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read {

	public static void main(String[] args) {
		// 1. Define the file (path) to be read
		
		String filename = "\\FileToRead.txt";    
		// IMPORTANT: Change the above to a full path on your computer if you cloned from gitHub.
				
		String text = null;
		boolean fileReadSuccessful = false;

		// 2. Create a file object in Java.
		File file = new File(filename);
		
		// 3. Open the file
		BufferedReader br;
		try {
			// Food for thought: could the BufferedReader be declared within the try block here?
			//			or must it be declared outside?
			br = new BufferedReader(new FileReader(file));
			fileReadSuccessful = true;
			
			// 4. Read the file
			text = br.readLine();
			
			// 5. Close the resources
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: File not found: " + filename);
//			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("ERROR: Could not read the file: " + filename);
//			e.printStackTrace();
		} finally {
			if (fileReadSuccessful) {
				System.out.println("Here's the contents of the file:");
				System.out.println(text);
			} else {
//				System.out.println("File read attempt failed!  Sorry.");
			}
		}
	}

}
