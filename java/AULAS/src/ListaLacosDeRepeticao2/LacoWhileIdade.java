package ListaLacosDeRepeticao2;

import java.util.Scanner;

public class LacoWhileIdade {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade = 0, totalPessoasMenos21 = 0, totalPessoasMais50 = 0;
		
		while (idade != -99) {
			System.out.print("Digite sua idade: ");
			idade = leia.nextInt();
			
			if (idade >0 && idade < 21) {
				totalPessoasMenos21 += 1;
			}
			if (idade > 50) {
				totalPessoasMais50 += 1;
			}
		}
		
		System.out.printf("\nO total de pessoas com menos de 21 anos foram: %d" , totalPessoasMenos21 );
		System.out.printf("\nO total de pessoas com mais de 50 anos foram: %d" , totalPessoasMais50);
	}

}
