public class ListaEncadeadaDinamica {
	private No primeiro;
	private No ultimo;
	private No nomeDaLista;

	public ListaEncadeadaDinamica(String nome) {
		nomeDaLista = nome;
		primeiro = ultimo = null;
	}
	public ListaEncadeadaDinamica() {
		nomeDaLista = "Lista Teste";
		primeiro = ultimo = null;
	}
	public boolean Vazia() {
		return primeiro == null;
	}
	public void Enfileira(String item) {
		if (Vazia())
			primeiro = ultimo = new No(item);
		else {
			ultimo.setProx(new No(item));
			ultimo = ultimo.getProx();
		}
	}
	public String Desenfileira() {
		if (Vazia()){
			return null;
		}
		String item = primeiro.getDado();
		if (primeiro == ultimo)
			primeiro = ultimo = null;
		else
			primeiro = primeiro.getProx();
		return item;
	}
}