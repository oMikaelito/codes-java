import java.text.*;
public class Empregado {
	private String nome;
	private double salario;

	public Empregado(String n, double s) {
		this.setNome(n);
		this.setSalario(s);
	}
	public void setNome(String n) {
		nome = n;
	}
	public void setSalario(double s) {
		salario = s;
	}
	public String getNome() {
		return nome;
	}
	public double getSalario() {
		return salario;
	}
	public void aumentarSalario(double percentual) {
		salario *= 1 + percentual / 100;
	}
	public String formatarMoeda() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatoMoeda = nf.format(salario);
		return formatoMoeda;
	}
	public void imprimir() {
		System.out.println(nome + " " + salario + this.formatarMoeda());
	}
}