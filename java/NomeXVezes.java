import java.util.Scanner;
public class NomeXVezes {
	public static void main(String[] args){
		Scanner tecl = new Scanner(System.in);
		String _nome;
		int _vezes;
		int _contador = 0;

		System.out.println("Escreva o seu nome: ");
		_nome = tecl.next();

		if (_nome!= "")

		System.out.println("Escreva a quantidade de vezes para repetir: ");
		_vezes = tecl.nextInt();
		if (_vezes>0);
		do {
			System.out.println(_nome);
			_contador++;
		} while (_contador < _vezes);

	}
}