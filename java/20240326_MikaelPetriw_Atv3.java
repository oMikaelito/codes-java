import java.util.Scanner;
public class NumeroExtenso {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		String[] _numerosPorExtenso = {"Zero", "Um", "Dois", "Três", "Quatro", "Cinco", "Seis", "Sete", "Oito", "Nove", "Dez"};

		System.out.println("Digite um número entre 0 e 10: ");
		int _numero = teclado.nextInt();

		if (_numero >= 0 && _numero <= 10) {
			System.out.println (_numerosPorExtenso[_numero]);

		} else 	{
			System.out.println ("Numero inválido");
		}
		
	}
}