package ListaDesvioCondicional;

import java.util.Scanner;

public class IdadeNatacao {

	public static void main(String[] args) {
		
		int idade;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Ol�, qual a sua idade? ");
		idade = leia.nextInt();
		
		if (idade <5) {
			System.out.println("Desculpe, mas com essa idade n�o � permitido fazer as aulas de nata��o ");
		}
		
		else if (idade >=5 && idade <8) {
			System.out.println("Voc� pertence a categoria Infantil A ");
		}
		
		else if (idade >=8 && idade <12) {
			System.out.println("Voc� pertence a categoria Infantil B ");
		}
		
		else if (idade >=12 && idade <14) {
			System.out.println("Voc� pertence a categoria Juvenil A ");
		}
		
		else if (idade >=14 && idade <18) {
			System.out.println("Voc� pertene a categoria Juvenil B ");
		}
		
		else if (idade >=18) {
			System.out.println("Voc� pertence a categoria Adultos ");
		}
	}

}
