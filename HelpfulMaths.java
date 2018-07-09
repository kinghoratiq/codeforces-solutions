import java.util.*;
public class HelpfulMaths {
	final static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		String s = in.nextLine();
		String[] numbers = s.split("\\+");
		Arrays.sort(numbers);
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]);
			if (i < numbers.length - 1)
				System.out.print("+");
		}
	}
}