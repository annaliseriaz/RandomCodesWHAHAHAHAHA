package wala_lang;
import java.util.Scanner; 
public class Binaliktadbaliktad {

	public static void main(String[] args) {
		reversed();
	}
	
	public static void reversed() {
		Scanner lang = new Scanner(System.in);
		System.out.print("Enter number/words: ");
		String input = lang.nextLine();
		String reversed = new StringBuilder(input).reverse().toString();
		System.out.println("Reversed order: " + reversed);
	}
	
	public static void yokonasyaMakita() {
		Scanner ayaw = new Scanner(System.in);
		System.out.print("\nEnter name ng crush : ");
		String name = ayaw.nextLine();
		System.out.print("Crush mo pa rin ba sya? : "); 
		String name1 = ayaw.nextLine();
		
		if (name1.equalsIgnoreCase("Oo")) {
			System.out.println("\nMarupok ka beh tama na pagkadelulu mo pls lang");
		}
		
		if (name1.equalsIgnoreCase("Hindi")) {
			System.out.println("\nTama lang yan, kalimutan mo na sya. He's not interested in you");
		} 
	} 
} 
