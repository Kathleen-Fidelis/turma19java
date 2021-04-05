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
		
		System.out.print("Voc� recebeu o benef�cio anterior?: (s/n)");
		beneficio = leia.next().toLowerCase().charAt(0);
		System.out.println("Voc� se considera chefa de fam�lia?: (s/n)");
		chefaDeFamilia = leia.next().toLowerCase().charAt(0);
		System.out.println("Voc� recebe algum outro tipo de aux�lio?: (s/n)");
		outroAuxilio = leia.next().toLowerCase().charAt(0);
		System.out.println("Quantos filhos voc� tem?: ");
		filhos = leia.nextInt();
		
		if (beneficio == 's' && chefaDeFamilia == 's' && outroAuxilio == 'n') {
		numeroFilhos *=  filhos;
		soma = numeroFilhos + auxilio * 2;
				System.out.println("Voc� vai receber R$ " + soma);
		}
		else if (beneficio == 's' && outroAuxilio == 'n') {
		numeroFilhos *=  filhos;
		soma = numeroFilhos + auxilio;
			System.out.println("Voc� vai receber R$ " + soma);
		}
		else {
			System.out.println("Voc� n�o se encaixa nas categorias que podem receber o benef�cio");
		}

	}

}
