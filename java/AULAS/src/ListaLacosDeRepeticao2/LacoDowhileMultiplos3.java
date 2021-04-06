package ListaLacosDeRepeticao2;

import java.util.Locale;
import java.util.Scanner;

public class LacoDowhileMultiplos3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int numero = 0, soma = 0, x = 0;
		double media = 0;
		
		do {
			System.out.print("Digite um número: ");
			numero = leia.nextInt();
			
			if (numero % 3 == 0) {
				soma += numero;
				x++;
			}
		}
		while (numero != 0);
			media = soma / (x - 1);
			System.out.printf("A média dos múltiplos de 3 é: %.2f", media);

	}

}
