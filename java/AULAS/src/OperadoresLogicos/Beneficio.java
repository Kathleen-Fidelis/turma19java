package OperadoresLogicos;

import java.util.Locale;
import java.util.Scanner;

public class Beneficio {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);

		char chefaDeFamilia, beneficio, outroAuxilio;
		double numeroFilhos = 50.0, auxilio = 300.00, soma = 0.0;
		int filhos = 0;
		
		System.out.print("Você recebeu o benefício anterior?: (s/n)");
		beneficio = leia.next().toLowerCase().charAt(0);
		System.out.println("Você se considera chefa de família?: (s/n)");
		chefaDeFamilia = leia.next().toLowerCase().charAt(0);
		System.out.println("Você recebe algum outro tipo de auxílio?: (s/n)");
		outroAuxilio = leia.next().toLowerCase().charAt(0);
		System.out.println("Quantos filhos você tem?: ");
		filhos = leia.nextInt();
		
		if (beneficio == 's' && chefaDeFamilia == 's' && outroAuxilio == 'n') {
		numeroFilhos *=  filhos;
		soma = numeroFilhos + auxilio * 2;
				System.out.println("Você vai receber R$ " + soma);
		}
		else if (beneficio == 's' && outroAuxilio == 'n') {
		numeroFilhos *=  filhos;
		soma = numeroFilhos + auxilio;
			System.out.println("Você vai receber R$ " + soma);
		}
		else {
			System.out.println("Você não se encaixa nas categorias que podem receber o benefício");
		}

	}

}
