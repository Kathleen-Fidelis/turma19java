package entities;

public class Doce extends Produto {

	private String fabricantes;

	public Doce(String descricao, String codigo, double valorUnitario, String fabricantes) {
		super(descricao, codigo, valorUnitario);
		this.fabricantes = fabricantes;
	}

	public String getFabricantes() {
		return fabricantes;
	}

	public void setFabricantes(String fabricantes) {
		this.fabricantes = fabricantes;
	}
	
	
}
