package uri;

import java.io.IOException;
import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Stream;

public class U_1332 {

	public enum NumbersEnum {
		ONE("one", 1), TWO("two", 2), THREE("three", 3);

		public String string;
		public int number;

		NumbersEnum(String s, int n) {
			string = s;
			number = n;
		}
	}

	public static void main(String[] args) throws IOException {

		Scanner input = new Scanner(System.in);
		int qtd = input.nextInt();

		for (int i = 0; i < qtd; i++) {

			String word = input.next();

			Optional<NumbersEnum> list = Stream.of(NumbersEnum.values()).min((o1, o2) -> {
				return new Integer(calculateLevenshteinDistance(o1.string, word))
						.compareTo(new Integer(calculateLevenshteinDistance(o2.string, word)));
			});

			System.out.println(list.get().number);

		}

		input.close();

	}

	static int calculateLevenshteinDistance(String x, String y) {
		if (x.isEmpty()) {
			return y.length();
		}

		if (y.isEmpty()) {
			return x.length();
		}

		int substitution = calculateLevenshteinDistance(x.substring(1), y.substring(1))
				+ costOfSubstitution(x.charAt(0), y.charAt(0));
		int insertion = calculateLevenshteinDistance(x, y.substring(1)) + 1;
		int deletion = calculateLevenshteinDistance(x.substring(1), y) + 1;

		return min(substitution, insertion, deletion);
	}

	public static int costOfSubstitution(char a, char b) {
		return a == b ? 0 : 1;
	}

	public static int min(int... numbers) {
		return Arrays.stream(numbers).min().orElse(Integer.MAX_VALUE);
	}

}