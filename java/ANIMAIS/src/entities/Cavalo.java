package entities;

public class Cavalo extends Animal {


	/*public Cavalo(String nome, int idade, String emitirSom) {
		super(nome, idade, emitirSom);
	}
*/
	
	@Override
	public void som() {
		System.out.println("pocotó");
	}
		
	public void correr() {
		System.out.println(" Deve correr");
	}
}
