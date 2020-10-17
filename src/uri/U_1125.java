package uri;

import java.io.IOException;
import java.util.Scanner;

public class U_1125 {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);

		int g = input.nextInt(), p = input.nextInt();
		
		while (g != 0 && p != 0) {
			
			int[][] corridas = new int[g][p];
			for (int  i = 0; i < g; i++) {
				for (int j  = 0; j < p; j++) {
					corridas[i][input.nextInt() -1] = j+1;
				}
			}
			
			int s = input.nextInt();
			int[][] sistemaPontacao = new int[s][];
			for (int i = 0; i < s; i++) {
				int k = input.nextInt();
				sistemaPontacao[i] = new int [k];
				for (int j = 0; j < k; j++) {
					sistemaPontacao[i][j] = input.nextInt();
				}
			}
			
			for (int i = 0; i < sistemaPontacao.length; i++) {
				int[] tabelaPontos = new int[p];
				for (int j = 0; j < corridas.length; j++) {
					for (int x = 0; x < Math.min(corridas[j].length, sistemaPontacao[i].length); x++) {
						tabelaPontos[corridas[j][x]-1] += sistemaPontacao[i][x];
					}
				}
				
				int pontuacaoGanhador = tabelaPontos[0];
				String ganhadoresOutput = "1";
				for (int j = 1; j < tabelaPontos.length; j++) {
					if (tabelaPontos[j] == pontuacaoGanhador) {
						ganhadoresOutput += " " + (j + 1);
					} else if (tabelaPontos[j] > pontuacaoGanhador) {
						pontuacaoGanhador = tabelaPontos[j];
						ganhadoresOutput = Integer.toString(j + 1);
					}
				}
				System.out.println(ganhadoresOutput);
			}
			
			g = input.nextInt();
			p = input.nextInt();
		}
		
		input.close();
	}
	
}
