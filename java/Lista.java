public class Lista {
	int[] valores;
	int tamanho;

	public Lista(int tam) {
		if (tam>0) {
			tamanho = tam;
			valores = new int [tamanho];
		}
	}
	public int Insere(int valor, int pos) {
		if (pos >= 0 && pos < valores.length) {
			valores[pos] = valor;
			return valor;
		}
		else return -1;
	}
	public int Remove(int pos) {
		int valor;
		if (pos > 0 && pos < valores.length) {
			valor = valores[pos];
			valores[pos] = 0;
			return valor;
		}
		else return -1;
	}
}