package basics;

public class Weather {
	public static void main(String[] args) {
		// Suggest what to wear based on weather (mostly the temperature)
		int temp = 65;
		if (temp > 80 ) {
			System.out.println("It's pleasant. Wear shorts and t-shirt");
		} else {
			System.out.println("Perhaps wear a jacket... it's gonna be chilly.");
		}
	}
}
