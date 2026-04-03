import java.util.Scanner;
public class MediaMuitasIdades {
	public static void main(String[] args){
		int _idadeDigitada, _idadeSomada = 0;
		int _contaIdade = 0;
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.print("Digite a " + _contaIdade + "a. idade (-1 finaliza): ");
			_idadeDigitada= teclado.nextInt();
			if (_idadeDigitada>=0){
				_idadeSomada += _idadeDigitada;
				_contaIdade++;
			}
		} while (_idadeDigitada>=0 && _contaIdade<50);
		System.out.print("Media " + _contaIdade + " idade(s)-->");
		System.out.println(_idadeSomada/_contaIdade);
	}
}