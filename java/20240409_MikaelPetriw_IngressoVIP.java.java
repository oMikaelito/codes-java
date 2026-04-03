class IngressoVIP extends Ingresso {
	private double valorAdicional;

	public IngressoVIP(double valor, double valorAdicional) {
		super(valor);
		this.valorAdicional = valorAdicional;
	}
	public double getValorAdicional() {
		return valorAdicional;
	}
	public void setValorAdicional(double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}
	public String toString() {
		return "Ingresso VIP com valor total: R$" + (valor + valorAdicional);
	}
} 