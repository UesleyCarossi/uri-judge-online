package uri;

import java.io.IOException;
import java.util.Scanner;

public class U_1630 {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		
		int x, y;
		
		while(input.hasNext()) {
			x = input.nextInt();
			y = input.nextInt();
			
			int mdc = mdc(x, y);
			
			System.out.println(((x/mdc)+(y/mdc))*2);
		}
		
		input.close();
	}

	public static int mdc(int x, int y) {
		if ((x % y == 0)) {
			return y;
		} else {
			return mdc(y, (x % y));
		}
	}

}