package entities;

public class Produto {

	//atributos
	private String descricao;
	private String codigo;
	private double  valorUnitario;
	private int qtdeEstoque;
	
	//construtores
	public Produto(String descricao, String codigo, double valorUnitario) {
		super();
		this.descricao = descricao;
		this.codigo = codigo;
		this.valorUnitario = valorUnitario;
	}

	//encapsulammento - getter (mostra) and setters (altera)
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCodigo() {
		return codigo;
	}
	/*
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	*/

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public int getQtdeEstoque() {
		return qtdeEstoque;
	}

	/*
	public void setQtdeEstoque(int qtdeEstoque) {
		this.qtdeEstoque = qtdeEstoque;
	}
	*/
	
	//metodos
	public void  incluirEstoque(int valorSerincluido) {
		this.qtdeEstoque += valorSerincluido;
	}
	
	public  void tirarEstoque(int valorSerExcluido) {
		if (qtdeEstoque >= valorSerExcluido) {
			this.qtdeEstoque -= valorSerExcluido;
		}
		else{
			System.out.println("Estoque indisponível");
		}
		
	}
}
