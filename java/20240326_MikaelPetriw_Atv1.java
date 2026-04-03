import java.util.Scanner;
public class Frase {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		String[] _nomes = new String[5];
		String[] _telefone = new String[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite o nome " + (i + 1) + ":");
			_nomes[i] = teclado.nextLine();
			System.out.println("Digite o número de telefone para " + _nomes[i] + ":");
			_telefone[i] = teclado.nextLine();
		}
		System.out.println("Nomes e números:");
		for (int i = 0; i < 5; i++ ) {
			System.out.println(_nomes[i] + " - " + _telefone[i]);
		}
	}
}