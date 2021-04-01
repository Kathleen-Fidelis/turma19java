package ListaDesvioCondicional;

import java.util.Scanner;

public class HorasTrabalhadas {

	public static void main(String[] args) {
		
		double N = 0.00; //(número de horas trabalhadas)
		double excessoHoras = 0.0, salario = 0.00;
		int codigo = 123;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Olá, digite seu código de acesso: ");
		codigo = leia.nextInt();
		
		if (codigo == 123) {
				System.out.println("Quantas horas você trabalhou hoje?: ");
				N = leia.nextDouble();
		}
		
		if (N <= 50) {
			salario = (N * 10.00);
			System.out.println("Você está dentro do limite de horas, seu salário será de R$: " + salario);
		}
		
		else if (N > 50) {
			salario = (N * 10.00);
			excessoHoras = ((N - 50) * 20.00);
			System.out.println("Você ultrapassou o limite de horas, o salário excedente sera de: " + excessoHoras);
			
			System.out.println("O salário total é de R$: " + salario + " e o salário excedente é de R$: " + excessoHoras);
		}
	}
}
