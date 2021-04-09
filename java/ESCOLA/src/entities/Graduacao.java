package entities;

public class Graduacao extends Estudante {

	private double bonus = 2.0;

	public Graduacao(int matricula, String cpf) {
		super(matricula, cpf);
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	//metodo
	public void usarBonus(double pontos) {
		if (pontos < 5) {
			pontos = pontos - bonus;
		}
	}
	
	
}
