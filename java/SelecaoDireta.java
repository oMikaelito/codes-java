public class SelecaoDireta {
	int[] valores = {3,2,1,5,6,4};

	public void Selecao() {
		int i, j, menor, posmenor;
		for (i = 0; i < valores.length - 1; i++) {
			posmenor = i;
			menor = valores[i];
			for (j = i + 1; j < valores.length; j++){
				if (valores[j] < menor) {
					menor = valores[i];
					posmenor = j;
				}
			}
			valores[posmenor] = valores[i];
			valores[i] = menor;
		}
	}
	
	public static void main(String[] args) {
		SelecaoDireta vetor = new SelecaoDireta();

		System.out.println("Vetor sem ordenacão");
		for(int i=0;i<vetor.valores.length;i++){
			System.out.println(vetor.valores[i]+ ",");
		}
		System.out.println("");
		System.out.println("Vetor ordenado (Selecão direta)");
		vetor.Selecao();
		for(int i=0;i<vetor.valores.length;i++){
			System.out.print(vetor.valores[i] + ", ");
		}
	}
}
