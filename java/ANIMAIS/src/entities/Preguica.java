package entities;

public class Preguica extends Animal {

	public Preguica(String nome, int idade, String emitirSom) {
		super(nome, idade, emitirSom);
		
	}
	
	//metodos  Essa paarte seria com poliformismo
	public void Som() {
		System.out.println("shhh");
	}
	
	public void subirArvores() {
		System.out.println(" Deve subir em árvores");
	}
}

