package application;

import java.util.Locale;

import entities.Animal;
import entities.Cachorro;
import entities.Cavalo;
import entities.Preguica;

public class TesteAnimal {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Cachorro anim1 = new Cachorro();
		Cavalo anim2 = new Cavalo();
		Preguica anim3 = new Preguica();
		
		anim1.setNome("Lili");
		anim1.setIdade(4);
		anim1.som();
		anim2.setNome("Pé de pano");
		anim2.setIdade(10);
		anim2.som();
		anim3.setNome("Sid");
		anim3.setIdade(6);
		anim3.som();
		
		
		
		System.out.println(anim1.getNome() + " idade " + anim1.getIdade() + " anos ");
		System.out.println(anim2.getNome() + " idade " + anim2.getIdade() + " anos ");
		System.out.println(anim3.getNome() + " idade " + anim3.getIdade() + " anos ");
		
	}

}
