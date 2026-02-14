package labyu;
import java.util.Scanner;
public class Iloveyouuuuuuu {

	public static void main(String[] args) {
		Scanner meow = new Scanner(System.in);
		
		System.out.print("Input a vowel: ");
		char vowel = meow.next().charAt(0);
		
		if (vowel == 'a') {
			System.out.print("Goodmorning Classmates. ");
		} else if (vowel == 'e') {
			System.out.print("Hello love.... ");
		} else if (vowel == 'i') {
			System.out.print("Kumain ka naba?, ");
		} else if (vowel == 'o') {
			System.out.print("How's school?, ");
		} else if (vowel == 'u') {
			System.out.print("Pagod kaba?, ");
		} else if (vowel == 'A') {
			System.out.print("Pahinga ka sa'kin, ");
		} else if (vowel == 'E') {
			System.out.print("-, ");
		} else if (vowel == 'I') {
			System.out.print("-, ");
		} else if (vowel == 'O') {
			System.out.print("-, ");
		} else if (vowel == 'U') {
			System.out.print("-, ");
		} else {
			System.out.print("That is not a vowel anymore");
		}
	}
}
