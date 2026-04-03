public class  Busca {
	int[] valores = {1, 2, 4, 5, 7, 6, 3, 9, 8, 0};

	public void Bolha() {
		int i, aux;
		int tam = valores.length;
		while (tam > 1) {
			for (i = 0; i < tam - 1; i++)
				if (valores[i] > valores [i + 1]) {
					aux = valores[i];
					valores[i] = valores[i + 1];
					valores[i + 1] = aux;
				} 
				tam = tam - 1;
		}
	}
	public static void main(String[] args) {
		Busca busca = new Busca();
		System.out.println("Vetor sem ordenação:");
		for(int i=0; i<busca.valores.length; i++) {
			System.out.print(busca.valores[i] + ", ");
		}
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Vetor ordenado:");
		busca.Bolha();
		for(int i=0; i<busca.valores.length; i++) {
			System.out.print(busca.valores[i] + ", ");
		}
	}
}