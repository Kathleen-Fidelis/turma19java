package ListaUdemy;

import java.util.Scanner;

public class EstruturaRepetitivaWhile3 {

	public static void main(String[] args) {
		
		int codigo = 0;
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		Scanner leia = new Scanner(System.in);
		
		while (codigo != 4) {
			System.out.println("Escolha o tipo de combust�vel que deseja: 1- �lcool, 2- Gasolina, 3- Diesel, 4- Fim ");
			codigo = leia.nextInt();
			if (codigo > 4) {
				System.out.println("Voc� digitou um c�digo inv�lido");
			}
			else if (codigo == 1) {
				alcool += 1;
			}
			else if (codigo == 2) {
				gasolina += 1;
			}
			else if (codigo == 3) {
				diesel += 1;
			}
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("�lcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
	}

}
