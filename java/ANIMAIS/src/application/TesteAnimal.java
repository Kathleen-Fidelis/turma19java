package application;

import java.util.Locale;

import entities.Animal;
import entities.Cachorro;
import entities.Cavalo;
import entities.Preguica;

public class TesteAnimal {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Cachorro anim1 = new Cachorro("Cachorro, ", 8, "auau");
		Cavalo anim2 = new Cavalo("Cavalo", 7, "pocotó");
		Preguica anim3 = new Preguica("Preguiça", 7, "shhh");
		
		System.out.println(anim1.getNome() + " idade " + anim1.getIdade() + " anos, " + " som: " + anim1.getEmitirSom() );
		System.out.println(anim2.getNome() + " idade " + anim2.getIdade() + " anos, " + " som: " + anim2.getEmitirSom() );
		System.out.println(anim3.getNome() + " idade " + anim3.getIdade() + " anos, " + " som: " + anim3.getEmitirSom() );
		
	}

}
