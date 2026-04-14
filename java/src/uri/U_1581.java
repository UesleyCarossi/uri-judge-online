package uri;

import java.io.IOException;
import java.util.Scanner;

public class U_1581 {
 
    public static void main(String[] args) throws IOException {
    	Scanner input = new Scanner(System.in);
    	
    	final int qtdGroup = input.nextInt();
    	for (int i = 0; i < qtdGroup; i++) {
    		
    		int qtdPeople = input.nextInt();
    		String firstLanguage = null;
    		String language = null;
    		
    		for (int j = 0; j < qtdPeople; j++) {
    			
    			String inputLanguage = input.next();
				if (j == 0) {
					firstLanguage = inputLanguage;
					language = firstLanguage;
				} else if (!firstLanguage.equals(inputLanguage)) {
					language = "ingles";
				}
    			
			}
    		
    		System.out.println(language);
		}
 
    	input.close();
    }
 
}