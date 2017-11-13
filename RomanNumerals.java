// Justin Yeh
import java.util.Scanner;
public class RomanNumerals {

	public static void main(String[] args) {
		Scanner kb = new Scanner (System.in);
		System.out.print("Enter a number: ");
		int n = kb.nextInt();;
		String romanOnes = romanDigit (n%10, "I", "V", "X");
		n = n/10;
		String romanTens = romanDigit (n%10, "X", "L", "C");
		System.out.println(romanTens + romanOnes);
	}

	public static String romanDigit (int n, String one, String five, String ten) {
		if (n == 1) { 
			return one; 
		} 
		if (n == 2) { 
			return one + one; 
		} 
		if (n == 3) { 
			return one + one + one; 
		} 
		if (n == 4) { 
			return one + five; 
		} 
		if (n == 5) { 
			return five; 
		} 
		if (n == 6) { 
			return five + one; 
		} 
		if (n == 7) { 
			return five + one + one; 
		} 
		if (n == 8) { 
			return five + one + one + one; 
		} 
		if (n == 9) { 
			return one + ten;
		}
		return "";
	} 
}