import java.text.*;
public class Gerente extends Empregado {
	private String nomeSecretaria;
	public Gerente (String n, double s, String nSec) {
		super (n, s);
		this.setNomeSecretaria(nSec);
	}
	public String getNomeSecretaria() {
		return nomeSecretaria;
	}
	public void setNomeSecretaria(String nome) {
		nomeSecretaria = nome;
	}
	//--
	public void aumentarSalario(double percentual) {
		//adiciona bonus de 10% ao salario
		double bonus = 10;
		super.aumentarSalario(percentual+bonus);
	}
	public void imprimir() {
		System.out.println(getNome() + " " + getSalario() + this.formatarMoeda());
	}
}