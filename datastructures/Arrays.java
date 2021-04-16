package datastructures;

public class Arrays {
	public static void main(String[] args) {
		String[] alphabeth = {"a", "b", "c", "d", "e"};
		
		for (int i = 0; i < alphabeth.length; i++) {
			System.out.print(alphabeth[i] + " \n");
		}
		
		System.out.println("\nDouble Arrays");
		String[][] users = { 
				{"John", "Smith", "js@company.com", "123448214"},
				{"Nick", "Fury", "nf@theboss.com", "45653221"},
				{"Natasha", "Romanov", "nr@avengers.com", "8772782558"}
			};
		
		// Get the size of the array
		int numOfUsers = users.length;
		int numOfFields = users[0].length;
		System.out.println("Number of users: " + numOfUsers);
		System.out.println("Number of fields: " + numOfFields + "\n");
		
		//Traverse the 2-d array with a single loop (some info known a priori)
		for (int i = 0; i < users.length; i++) {
			String firstName = users[i][0];
			String lastName = users[i][1];
			String email = users[i][2];
			String phone = users[i][3];
			System.out.println(firstName + " " + lastName + " <" + email + "> " + phone);
		}
		
		// Traversing with two loops
		for (String[] userRecord : users) {
			System.out.print("[ ");
			for (String userField : userRecord) {
				System.out.print(userField + " ");
			}
			System.out.println(" ]");
		}
		
		
	}
}
