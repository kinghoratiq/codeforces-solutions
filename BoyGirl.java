import java.util.Scanner;
public class BoyGirl {
	final static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		String username = in.next();
		int distinct = 0;
		String[] letters = username.split("");
		for (int i = 0; i < letters.length; i++) {
			
		}
		if (distinct % 2 == 0)
			System.out.print("CHAT WITH HER!");
		else
			System.out.print("IGNORE HIM!");
	}
}