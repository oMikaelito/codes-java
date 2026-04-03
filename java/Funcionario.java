public class Funcionario {
	private String nome;
	private String email;
	private float salario;

	//Criação de métodos de acesso (get) e de modificação (set)
	public void setNome(String nome) { this.nome = nome; }
	public String getNome() { return this.nome; }
	public void setEmail(String email) { this.email = email; }
	public String getEmail() { return this.email; }
	public void setSalario(float salario) {this.salario = salario; }
	public float getSalario() { return this.salario; }
	void aumentarSalario(float reajuste) {
		salario = salario + salario*reajuste/100;
	}

	void mostrarFuncionario() {
		System.out.println("Nome funcionario: " + nome + "(" + email + ")");
		System.out.println("Salario (R$)...: " + salario);
	}
}