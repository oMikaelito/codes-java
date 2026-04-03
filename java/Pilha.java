public class Pilha {
	private No base;
	private No topo;
	private String nomeDaPilha;

	public Pilha(String nome) {
		nomeDaPilha = nome;
		base = topo = null;
	}
	public Pilha() {
		nomeDaPilha = "Pilha teste";
		base = topo = null;
	}
	public void Empilha(String item) {
		if (Vazia())
			base = topo = new No (item);
		else {
			topo.setProx(new No (item));
			topo = topo.getProx();
		}
	}
	public String Desempilha() {
		if (Vazia()) {
			return null;
		}
		String item = topo.getDado();
		if (base == topo)
			base = topo = null;
		else {
			No atual = base;
			while (atual.getProx() != topo)
				atual = atual.getProx();
			topo = atual;
			atual.setProx(null);
		}
		return item;
	}
	public boolean Vazia() {
		return base == null;
	}
	public static void main(String[] args) {
		Pilha p1 = new Pilha();
		p1.Empilha("elemento 1");
		p1.Empilha("elemento 2");
		p1.Empilha("elemento 3");
		p1.Empilha("elemento 4");
		System.out.println(p1.Desempilha());
		System.out.println(p1.Desempilha());
		System.out.println(p1.Desempilha());
	}
}