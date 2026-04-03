import java.util.Scanner;

class Modalidade {
	private int codigo;
	private String modalidade;
	private int genero;

	public Modalidade(int codigo, String modalidade, int genero) {
		this.codigo = codigo;
		this.modalidade = modalidade;
		this.genero = genero;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getModalidade() {
		return modalidade;
	}
	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}
	public int getGenero() {
		return genero;
	}
	public void setGenero(int genero) {
		this.genero = genero;
	}
}
class Atleta {
	private String cpf;
	private String nome;
	private int genero;
	private int idade;

	public Atleta(String cpf, String nome, int genero, int idade) {
		this.cpf = cpf;
		this.nome = nome;
		this.genero = genero;
		this.idade = idade;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getGenero() {
		return genero;
	}
	public void setGenero(int genero) {
		this.genero = genero;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
} 