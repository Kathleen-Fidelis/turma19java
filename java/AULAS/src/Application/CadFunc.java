package Application;

import java.util.Scanner;

import Entities.Pessoa;

public class CadFunc {

	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);
		
		Pessoa func1 = new Pessoa();
		Pessoa func2 = new Pessoa();
		int idade1, idade2;
		
		System.out.println("Digite o nome do funcionário 1: ");
		func1.nome = leia.next();
		System.out.println("Digite o nome do funcionário 2: ");
		func2.nome = leia.next();
		System.out.println("Digite o ano de nascimento do funcionário 1: ");
		func1.anoNascimento = leia.nextInt();
		System.out.println("Digite o ano de nascimento do funcionário 2: ");
		func2.anoNascimento = leia.nextInt();
		System.out.println("Funcionario 1 vc é 1- Feminino / 2- Masculino / 3- Outre: ");
		func1.genero = leia.next().charAt(0);
		System.out.println("Funcionario 2 vc é 1- Feminino / 2- Masculino / 3- Outre: ");
		func2.genero = leia.next().charAt(0);
		
		
		System.out.printf("Idae pessoa 1 - %d anos\n", func1.calculaIdade());
		System.out.printf("Idade pessoa 2 - %d anos\n", func2.calculaIdade());
		
		if (func1.calculaIdade() < func2.calculaIdade()) {
			System.out.printf("%s %s %s é a pessoa mais velha", func2.trasArtigo(), func2.tratamento(), func2.nome );
		}
		else {
			System.out.printf("%s %s %s é a pessoa mais velha",func1.trasArtigo(), func1.tratamento(), func1.nome);
		}
		
	}

}
