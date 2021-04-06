package Exemplo;

import java.util.Locale;
import java.util.Scanner;

public class ExemploVetor {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		String nomes[] = new String[3];
		
		nomes[0] = "Paulo";
		nomes[1] = "Madalena";
		nomes[2] = "Rita";
		
		for (int x = 0; x < nomes.length; x++) {
			System.out.println(nomes[x]);
		}
	}

}
