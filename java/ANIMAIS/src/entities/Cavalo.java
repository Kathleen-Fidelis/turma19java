package entities;

public class Cavalo extends Animal {


	public Cavalo(String nome, int idade, String emitirSom) {
		super(nome, idade, emitirSom);
	}

	
	//metodos  Essa parte sseeria com polimorfismo
		public void Som() {
			System.out.println("pocotó");
		}
		
		public void correr() {
			System.out.println(" Deve correr");
		}
}
