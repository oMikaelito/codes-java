public class AppFuncionario {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.mostrarFuncionario();
		/*
		f1.nome = "Lisan al-Gaib";
		f1.email =  "Lisan.al-Gaib@empresa.com.br";
		f1.salario = 2000f; */

		f1.setNome("Lisan al-Gaib");
		f1.setEmail("Lisan.al-Gaib@empresa.com.br");
		f1.setSalario(2000f); *

		f1.mostrarFuncionario();
		f1.aumentarSalario(15);
		f1.mostrarFuncionario();
	}
}