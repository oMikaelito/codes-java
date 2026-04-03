import java.util.Scanner;
public class Tabuada {
	public static void main(String[] args) {
		int _numero;
		Scanner tecl = new Scanner(System.in);
		System.out.println("Informe um numero inteiro: ");
		_numero = tecl.nextInt();
		for(int i=0; i<10; i++) {
			System.out.println(i + " * " + _numero+" = "+(i*_numero));
		}
	}
}