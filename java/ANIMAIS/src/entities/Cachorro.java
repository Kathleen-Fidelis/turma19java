package entities;

public class Cachorro extends Animal {

	/*public Cachorro(String nome, int idade, String emitirSom) {
		super(nome, idade, emitirSom);
		
	}
*/
	@Override
	public void som() {
		System.out.println("auauau");
	}
	
	public void correr() {
		System.out.println(" Deve correr");
	}
}
