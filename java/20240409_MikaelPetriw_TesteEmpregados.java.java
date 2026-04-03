public class TesteEmpregados {
	public static void main(String[] args) {
		Empregado empregado = new Empregado("Claudio", 2500);
		System.out.println(empregado);

		Gerente gerente = new Gerente("Roberto", 6000, "Vendas");
		System.out.println(gerente);

		Vendedor vendedor = new Vendedor("Murilo", 1500, 10);
		System.out.println(vendedor);
	}
}