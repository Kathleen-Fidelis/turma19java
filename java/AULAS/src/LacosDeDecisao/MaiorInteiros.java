package LacosDeDecisao;

import java.util.Scanner;

public class MaiorInteiros {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero1, numero2, numero3;
		
		System.out.print("Digite o valor do primeiro n�mero: ");
		numero1  = leia.nextInt();
		System.out.print("Digite o valor do segundo n�mero: ");
		numero2  = leia.nextInt();
		System.out.print("Digite o valor do terceiro n�mero: ");
		numero3  = leia.nextInt();
		
		if (numero1 > numero2 && numero1 > numero3) {
			System.out.println("O maior n�mero � o:  " + numero1);
		}
		else if (numero2 > numero3) {
			System.out.println("O maior n�mero � o: " + numero2);
		}
		else {
			System.out.println("O maior n�mero � o: " + numero3);
		}
	}

}
