package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;
import entities.Terceiro;

public class TesteEmpresa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		//TESTE PROGRAMADOR
		/*Funcionario func1 = new Funcionario("1234", "Maria", 40, 14.25);
		Terceiro func2 = new Terceiro("12345", "João", 40, 14.25, 5);
		
		System.out.println("Matícula: " + func1.getMatricula() + " Funcionário: " + func1.getNome() + " Salário R$ " + func1.salario());
		System.out.println("Matícula: " + func2.getMatricula() + " Funcionário: " + func2.getNome() + " Salário R$ " + func2.salario());
		*/
	
		//TESTE USUARIO
		
		List<Funcionario> lista = new ArrayList<>();
		
		System.out.println("CADASTRO FUNCIONÁRIOS - PAGAMENTOS");
		System.out.println("Quantos funcionários serão cadastrados?: ");
		int qtde = leia.nextInt();
		
		for (int x = 1; x <= qtde; x++) {
			System.out.printf("Funcionário %d\n", x);
			System.out.print("Digite 1- Funcionário ou 2- Terceiro: ");
			char tipo = leia.next().charAt(0);
			System.out.print("Digite a matrícula: ");
			String matricula = leia.next();
			System.out.printf("Digite o nome: ");
			String nome = leia.next();
			System.out.print("Digite as horas trabalhadas: ");
			int horasTrabalhadas = leia.nextInt();
			System.out.print("Digite o valor da hora R$: ");
			double valorHora = leia.nextDouble();
			
			if (tipo == '2') {
				System.out.println("Digite o valor do adicional R$: ");
				double adicional = leia.nextDouble();
				//Terceiro colaborador = new Terceiro(matricula, nome, horasTrabalhadas, valorHora, adicional);
				lista.add(new Terceiro(matricula, nome, horasTrabalhadas, valorHora, adicional));
				
			}
			else {
				//Funcionario colaborador = new Funcionario(matricula, nome, horasTrabalhadas, valorHora);
				lista.add(new Funcionario(matricula, nome, horasTrabalhadas, valorHora));
			}
			
		}
		
		System.out.println();
		System.out.println("FOLHA DE PAGAMENTOS");
		
		//FOR EACH
		for (Funcionario func: lista) {
			System.out.println(func.getNome() + " salário R$ " + func.salario());
		}
	
		System.out.println("FIM DE PROGRAMA");
	
	}

}
