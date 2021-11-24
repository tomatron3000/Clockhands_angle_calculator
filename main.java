import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
		for (int i = 0; i < 20; i++){
		Scanner userInput = new Scanner(System.in);  // Creating a simple Scanner to take a users input
		System.out.println("Please Enter A time to find the smallest angle between the hands. e.g. 0356");
		String time = userInput.nextLine();
		// A check to see if the inputted string is 4 in length
		if (time.length() > 4){
			System.out.println("Please enter a valid Time");
			main.main(null);
		}

		Clock c = new Clock();
		System.out.println(c.ClockAngleFinder(time));
		}
	}
	catch (Exception e) {
		System.out.println("Please enter a valid Time");
		main.main(null);
		}

	}

	
}
