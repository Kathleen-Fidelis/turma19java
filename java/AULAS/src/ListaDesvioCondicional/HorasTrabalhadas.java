package ListaDesvioCondicional;

import java.util.Scanner;

public class HorasTrabalhadas {

	public static void main(String[] args) {
		
		double N = 0.00; //(n�mero de horas trabalhadas)
		double excessoHoras = 0.0, salario = 0.00;
		int codigo = 123;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Ol�, digite seu c�digo de acesso: ");
		codigo = leia.nextInt();
		
		if (codigo == 123) {
				System.out.println("Quantas horas voc� trabalhou hoje?: ");
				N = leia.nextDouble();
		}
		
		if (N <= 50) {
			salario = (N * 10.00);
			System.out.println("Voc� est� dentro do limite de horas, seu sal�rio ser� de R$: " + salario);
		}
		
		else if (N > 50) {
			salario = (N * 10.00);
			excessoHoras = ((N - 50) * 20.00);
			System.out.println("Voc� ultrapassou o limite de horas, o sal�rio excedente sera de: " + excessoHoras);
			
			System.out.println("O sal�rio total � de R$: " + salario + " e o sal�rio excedente � de R$: " + excessoHoras);
		}
	}
}
