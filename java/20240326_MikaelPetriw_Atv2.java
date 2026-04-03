import java.util.Scanner;
public class Frase {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		System.out.println ("Escreva 5 palavras para criar uma frase: ");
		String _palavra1 = teclado.next(); 
		String _palavra2 = teclado.next();
		String _palavra3 = teclado.next();
		String _palavra4 = teclado.next(); 
		String _palavra5 = teclado.next();
		String _frase = _palavra1 + " " + _palavra2 + " " + _palavra3 + " " + _palavra4 + " " + _palavra5;
		System.out.println("Frase: " + _frase);

	}
}