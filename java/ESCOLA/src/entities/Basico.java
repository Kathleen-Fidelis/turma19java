package entities;

public class Basico extends Estudante {

	private int diaAniversario;

	public Basico(int matricula, String cpf, int diaAniversario) {
		super(matricula, cpf);
		this.diaAniversario = diaAniversario;
	}

	public int getDiaAniversario() {
		return diaAniversario;
	}

	public void setDiaAniversario(int diaAniversario) {
		this.diaAniversario = diaAniversario;
	}
	
	//metodo
	public void bonusaniversario(int diaAtual) {
		if (diaAniversario == diaAtual) {
			super.incluirPonto(super.getPontos()*0.10);
		}
	}
}
