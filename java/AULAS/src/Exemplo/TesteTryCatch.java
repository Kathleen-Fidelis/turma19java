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
		
			System.out.println("Digite a posição da pessoa no vetor [0-2]: ");
			aux = leia.nextInt();
			System.out.print("Digite o nome da pessoa: ");
			nomes[aux] = leia.next();
			System.out.print("Digite a nota: ");
			nota = leia.nextInt();
			if (nota <= 5) {
				situacao = "Ainda não";
			}
			else {
				situacao = "Próximo nível";
			}
			System.out.printf("Oi, %s, sua situação é %s ", nomes[aux], situacao);
		}
		catch (InputMismatchException erro) {
			System.out.println("Você não digitou um número");
		}
		
		
	}

}
