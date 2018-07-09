import java.util.*;
public class TheatreSquare {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextInt();
		long m = in.nextInt();
		long a = in.nextInt();
		System.out.print(((n + a - 1) / a) * ((m + a - 1) / a));
	}
}