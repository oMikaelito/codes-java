public class selection_sort{
	public static void main(String[] args){
		int[] vetor = new int[10];
		int posicaomenor, auxiliar;
		System.out.println("Selection Sort -- Vetor origem");
		for(int i=0; i<vetor.length; i++){
			vetor[i] = (int)(Math.random()*vetor.length);
			System.out.print(vetor[i]+"; ");
		}
		for(int i=0; i<vetor.length; i++){
			posicaomenor = i;
			for(int j=1+1;j<vetor.length; j++){
				if(vetor[j]<vetor[posicaomenor]){
					posicaomenor=j;
				}
			}
			auxiliar = vetor[posicaomenor];
			vetor[posicaomenor] = vetor[i];
			vetor[i]=auxiliar;
		}
		System.out.println("");
		System.out.println("Selection Sort -- Vetor ordenado");
		for(int i=0;i<vetor.length;i++){
			System.out.print(vetor[i] + "; ");
		}
	}
}