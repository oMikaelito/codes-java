public class GerenteTeste {
	public static void main (String agrs[]) {
		Gerente gerente = new Gerente ("Hugo Boss", 7000, "Bianca Elisa");

		Empregado [] lista = new Empregado [3];
		lista[0] = gerente;
		lista[1] = new Empregado ("Dilson Digit", 1500);
		lista[2] = new Empregado ("Harold Hacker", 3800);

		for (Empregado em: lista) {
			em.aumentarSalario(10);
			em.imprimir();
		}
		System.out.println("O nome da secretaria do dpto e: " + gerente.getNomeSecretaria());
	}
}