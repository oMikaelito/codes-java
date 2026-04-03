public class No {
	private String dado;
	private No prox;
	public No getProx()	{return this.prox;}
	public void setProx(No prox) {this.prox = prox;}
	public String getDado();
	public No(String dadonovo) {
		dado = dadonovo;
		prox = null;
	}
	public No(String dadonovo, No ligacao) {
		dado = dadonovo;
		prox = ligacao;
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
	public static void main(String[] args) {
		Fila f1 = new Fila();
		f1.Enfileira("elemento 01");
		f1.Enfileira("elemento 02");
		System.out.print(f1.Desenfileira());
	}
}