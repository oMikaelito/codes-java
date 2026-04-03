class Vendedor extends Empregado {
	private float percentualComissao;

	public Vendedor(String nome, double salario, float percentualComissao) {
		super(nome, salario);
		this.percentualComissao = percentualComissao;
	}
	public float getPercentualComissao() {
		return percentualComissao;
	}
	public void setPercentualComissao(float percentualComissao) {
		this.percentualComissao = percentualComissao;
	}
	public double calcularSalario() {
		return salario + (salario * percentualComissao / 100);
	}
	public String toString() {
		return "Nome: " + nome + ", Salário sem comissão: R$" + salario +
               ", Salário com comissão: R$" + calcularSalario() +
               ", Percentual de comissão: " + percentualComissao + "%"; 
	}
}