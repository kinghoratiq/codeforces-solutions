import java.util.Scanner;
public class Taxi {
	final static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		int n = in.nextInt(), taxis = 0, ones = 0, twos = 0, threes = 0, fours = 0;
		int[] groups = new int[n];
		for (int i = 0; i < n; i++) {
			int s = in.nextInt();
			groups[i] = s;
		}
		for (int j = 0; j < n; j++) {
			if (groups[j] == 1)
				ones++;
			else if (groups[j] == 2)
				twos++;
			else if (groups[j] == 3)
				threes++;
			else if (groups[j] == 4)
				fours++;
		}
		taxis += fours;
		taxis += threes;
		taxis += twos/2;
		ones -= threes;
		if (twos % 2 == 1)
			taxis++;
		if (ones > 0 && twos % 2 == 1)
			ones -= 2;
		if (ones > 0)
			taxis += (ones + 3) / 4;
		System.out.print(taxis);
	}
}