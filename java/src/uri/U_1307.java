package uri;

import java.io.IOException;
import java.util.Scanner;

public class U_1307 {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		input.nextLine();

		for (int i = 0; i < n; i++) {
			int s1 = Integer.parseInt(input.nextLine(), 2), s2 = Integer.parseInt(input.nextLine(), 2);

			System.out.println("Pair #" + (i + 1) + ": "
					+ (mdc(s1, s2) > 1 ? "All you need is love!" : "Love is not all you need!"));
		}

		input.close();
	}

	public static double mdc(int dividendo, int divisor) {
		if ((dividendo % divisor == 0)) {
			return divisor;
		} else {
			return mdc(divisor, (dividendo % divisor));
		}
	}

}
