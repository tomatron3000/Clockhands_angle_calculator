import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 20; i++){
		Scanner userInput = new Scanner(System.in);  // Creating a simple Scanner to take a users input
		System.out.println("Please Enter A time to find the smallest angle between the hands. e.g. 0356");
		String time = userInput.nextLine();

		Clock c = new Clock();
		System.out.println(c.ClockAngleFinder(time));
		}
	}

}
