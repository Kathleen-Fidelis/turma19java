package ListaLacosDeRepeticao;

import java.util.Scanner;

public class LacoWhile {

	public static void main(String[] args) {
		
		int numeroDigitado, resultado;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Ol�, digite um n�mero: ");
		numeroDigitado = leia.nextInt();
		
		int numero = numeroDigitado;
		System.out.println(numeroDigitado);
		
		while(numero < 100){
			numero = numero * 3;
			System.out.println(numero);
		}
	}

}
