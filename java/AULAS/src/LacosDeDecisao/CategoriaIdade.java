package LacosDeDecisao;

import java.util.Scanner;

public class CategoriaIdade {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Olá, digite sua idade: ");
		idade = leia.nextInt();
		
		if(idade < 10 || idade > 25) {
			System.out.println("Você não pertence a nenhuma categoria programada");
		}
		else if (idade >= 10 && idade < 15) {
			System.out.println("Você pertence a categoria Infantil");
		}
		else if (idade >= 15 && idade <18) {
			System.out.println("Você pertence a categoria Juvenil");
		}
		else if (idade >= 18 && idade <26) {
			System.out.println("Você pertence a categoria Adulto");
		}

	}

}
