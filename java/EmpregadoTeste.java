public class EmpregadoTeste {
	public static void main(String args[]) {
		Empregado [] lista = new Empregado [3];
		lista[0] = new Empregado ("Carol Cracker", 3500);
		lista[1] = new Empregado ("Dilson Digit", 1500);
		lista[2] = new Empregado ("Harold Hacker", 3800);
		for(Empregado em:lista)
			em.imprimir();
		System.out.println("============================================");
		for (Empregado em: lista) {
			em.aumentarSalario(10);
			em.imprimir();
		}
		System.out.println("============================================");
		Gerente gerente = new Gerente("Hugo Boss", 7000, "Branca Elisa");
		gerente.imprimir();
		gerente.aumentarSalario(10);
		gerente.imprimir();
	}
}