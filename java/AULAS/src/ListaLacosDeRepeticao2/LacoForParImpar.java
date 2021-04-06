package ListaLacosDeRepeticao2;

import java.util.Scanner;

public class LacoForParImpar {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero = 0, numerosPares = 0, numerosImpares = 0;
		
		for(int x = 1; x <= 10; x++) {
			System.out.print("Digite um numero: ");
			numero = leia.nextInt();
			
			if (numero % 2 == 0) {
				numerosPares += 1;
			}
			if (numero % 2 == 1) {
				numerosImpares += 1;
			}
		}
		
		System.out.printf("\nA quantidade de números pares é: %d ",  numerosPares);
		System.out.printf("\nA quantidade de números ímpares é: %d", numerosImpares);		
	}

}


