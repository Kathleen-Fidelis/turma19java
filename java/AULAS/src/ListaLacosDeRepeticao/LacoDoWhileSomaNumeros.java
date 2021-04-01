package ListaLacosDeRepeticao;

import java.util.Scanner;

public class LacoDoWhileSomaNumeros {

	public static void main(String[] args) {
		
		int x, soma = 0, i = 0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		x = leia.nextInt();
		
		do {
			soma = soma + i;
			i++;
			System.out.println(soma + " ");
		}
		while(i <= x);
			System.out.println("Total: " + soma);
	}

}
