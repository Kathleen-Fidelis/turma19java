package Exemplo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteTryCatch {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int nota;

		String nomes[] = new String[3];
		int aux = 0;
		String situacao;
		
	try {
		
			System.out.println("Digite a posi��o da pessoa no vetor [0-2]: ");
			aux = leia.nextInt();
			System.out.print("Digite o nome da pessoa: ");
			nomes[aux] = leia.next();
			System.out.print("Digite a nota: ");
			nota = leia.nextInt();
			if (nota <= 5) {
				situacao = "Ainda n�o";
			}
			else {
				situacao = "Pr�ximo n�vel";
			}
			System.out.printf("Oi, %s, sua situa��o � %s ", nomes[aux], situacao);
		}
		catch (InputMismatchException erro) {
			System.out.println("Voc� n�o digitou um n�mero");
		}
		
		
	}

}
