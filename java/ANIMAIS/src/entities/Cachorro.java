package entities;

public class Cachorro extends Animal {

	public Cachorro(String nome, int idade, String emitirSom) {
		super(nome, idade, emitirSom);
		
	}

	//metodos Essa parte seria com polimorfismo
	public void Som() {
		System.out.println("auauau");
	}
	
	public void correr() {
		System.out.println(" Deve correr");
	}
}
