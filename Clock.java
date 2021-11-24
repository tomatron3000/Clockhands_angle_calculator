import java.util.Scanner;

public class Clock {

	public Clock() {}
	
	public float ClockAngleFinder(String time) {
		
		float angle;
		// Hour is first two numbers in string parsed into integers
		float hour = Integer.parseInt(time.substring(0,2));

		//Minute is last two numbers in string parsed into integers
		float min = Integer.parseInt(time.substring(2,4));
		
		//Find percentage of the hour 
		float hourPer = min/60;
		
		//First transform from 24 hour into 12 hour for calculation to work
		if (hour > 12) hour = hour - 12;
		
		//Now check that the minute hand is further ahead than the hour hand
		//1 minute on the clock is equal to 6 degrees hence 5*min then each hour is 30 degrees likewise
		//For angle minus minutes from hours or either way round
		if (min/5 > hour) {
			angle = 6*min - (30*hour+30*hourPer);
		}
		// Found an error in first version where the angles where wrong as i just told the hour hand to stay in the one position instead of moving say if it was half past
		// This 
		else {
			angle = 30*hour+30*hourPer - 6*min;
		}
		//Now check that it is smallest angle if not - 360 then turn it positive
		if (angle > 180) angle = angle - 360;
		if (angle < 0) angle = Math.abs(angle);
		return angle;
	}
}
