// Justin Yeh
import java.util.Scanner;
public class TimeEnglish {

	public static void main(String[] args) {
		Scanner kb = new Scanner (System.in);
		System.out.println("What time is it? Separate the hour and minutes by a space without a colon (ex: enter 8 14 for 8:14)");
		int hours = kb.nextInt();
		int minutes = kb.nextInt();
		System.out.println(getTimeName (hours, minutes));

	}

	public static String getTimeName (int hours, int minutes) {
		String timeName;
		String hourEnglish;

		if (minutes == 45) {
			hours = hours + 1;
		}

		if (hours == 1) {
			hourEnglish = "one"; 
		} else if (hours == 2) {
			hourEnglish = "two"; 
		} else if (hours == 3) {
			hourEnglish = "three"; 
		} else if (hours == 4) {
			hourEnglish = "four"; 
		} else if (hours == 5) {
			hourEnglish = "five"; 
		} else if (hours == 6) {
			hourEnglish = "six"; 
		} else if (hours == 7) {
			hourEnglish = "seven"; 
		} else if (hours == 8) {
			hourEnglish = "eight"; 
		} else if (hours == 9) {
			hourEnglish = "nine"; 
		} else if (hours == 10) {
			hourEnglish = "ten"; 
		} else if (hours == 11) {
			hourEnglish = "eleven"; 
		} else if (hours == 12) {
			hourEnglish = "twelve"; 
		} else if (hours == 13) {
			hourEnglish = "one";
		} else {
			hourEnglish = "";
			System.out.println("That hour is not on the clock from 1 to 12");
		}

		if (hours >= 1 && hours <= 13) {
			if (minutes >= 0 && minutes < 60) {
				if (minutes == 0) {
					timeName = hourEnglish + " o'clock";
				} else if (minutes == 15) {
					timeName = "quarter after " + hourEnglish;
				} else if (minutes == 30) {
					timeName = "half past " + hourEnglish;
				} else if (minutes == 45) {
					timeName = "quarter till " + hourEnglish;
				} else {
					timeName = minutes + " minutes past " + hourEnglish;
				}
			} else {
				System.out.println("That minute is not between 0 and 60");
				timeName = "";
			}
		} else {
			timeName = "";
		}
		return timeName;
	}

}
