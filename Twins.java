import java.util.*;
public class Twins {
	final static Scanner in = new Scanner(System.in);
	static int meSum = 0, twinSum = 0, total = 0, meCount = 0;
	static int[] coins;

	public static void takeCoin(int index) {
		meSum += coins[index];
		meCount++;
		total -= coins[index];
	}
	public static void main(String[] args) {
		int n = in.nextInt(); 
		coins = new int[n];
		for (int i = 0; i < n; i++) {
			int a = in.nextInt();
			coins[i] = a;
			total += a;
		}
		Arrays.sort(coins);
		takeCoin(coins.length - 1);
		if (coins.length == 1)
			System.out.print(1);
		for (int j = coins.length - 2; j >= 0; j++) {
			if (meSum > total) {
				System.out.print(meCount);
				break;
			}
			else
				takeCoin(j);
		}
	}
}