package ListaLacosDeRepeticao;

import java.util.Scanner;

public class LacoForMultiplo3 {

	public static void main(String[] args) {
		
		int soma = 0, x;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Os números múltiplos de 3 da contagem de 1 a 500: ");
		
		for (x=1; x<=500; x++) {
			if (x%3 == 0) {
				if (x%2!=0) {
					soma = soma + x;
					
					System.out.println(x);
				}
			}
		}
		
		System.out.println("Soma dos números múltiplos de 3 é: " + soma);

	}

}
