package basics;

public class Days {

	public static void main(String[] args) {
		// Execute different blocks depending on a condition.
		
		String dayOfWeek = "Saturday";
		
		switch (dayOfWeek) {
		case "Monday", "Tuesday", "Wednesday", "Thursday": {
			System.out.println("Today is a weekday, and there's a looooong week ahead!");
			break;
		}
		case "Saturday", "Sunday":{
			System.out.println("Happy weekend");
			break;
		}
		default:
			System.out.println("T.G.I.F!!!");
			break;
//		default:
//			throw new IllegalArgumentException("Unexpected value: " + dayOfWeek);
		}
	}
}
