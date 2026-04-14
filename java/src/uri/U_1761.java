package uri;

import java.io.IOException;
import java.util.Scanner;

public class U_1761 {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		
		double a, b, c;
		
		while(input.hasNext()) {
			a = input.nextDouble();
			b = input.nextDouble();
			c = input.nextDouble();
			
			System.out.printf("%.2f\n", (b*Math.tan(a*(3.141592654/180))+c)*5);
		}
		
		input.close();
	}
	
}
