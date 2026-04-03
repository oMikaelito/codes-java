public class insertion_sort{
	public static void main(String[] args){
		int[] vetor = new int[10];
		int auxiliar, j;
		System.out.println("Insertion Sort -- Vetor origem");
		for(int i=0; i<vetor.length; i++){
			vetor[i] = (int)(Math.random()*vetor.length);
			System.out.print(vetor[i]+"; ");
		}
		for(int i=1; i<vetor.length; i++){
			auxiliar=vetor[i];
			j=i-1;
			while (j>=0 && vetor[j]>auxiliar){
				vetor[j+1] = vetor[j];
				j--;
			}
			vetor [j+1] = auxiliar;
		}
		System.out.println("");
		System.out.println("Insertion Sort -- Vetor ordenado");
		for(int i=0;i<vetor.length;i++){
			System.out.print(vetor[i] + "; ");
		}
	}
}