package ListaUdemy;

import java.util.Scanner;

public class EstruturaRepetitivaWhile1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int senha = 0;
		
		while (senha != 2002) {
			System.out.println("Digite a senha: ");
			senha = leia.nextInt();
			System.out.println("Senha Invalida");
		}
		
		System.out.println("Acesso Permitido");
	}
}
