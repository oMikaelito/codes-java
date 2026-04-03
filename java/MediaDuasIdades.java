import java.util.Scanner;
public class MediaDuasIdades {
	public static void main(String[] args){
		int _idade1 = -1;
		int _idade2 = -1;
		Scanner teclado = new Scanner(System.in);
		while (_idade1<0 && _idade1<150){
			System.out.println("Digite sua primeira idade: ");
			_idade1 = teclado.nextInt();
		}
		if (_idade1>0 && _idade1<150){
			while (_idade2<0 && _idade2<150){
				System.out.println("Digite a segunda idade: ");
				_idade2 = teclado.nextInt();
			}

		}
		if ((idade1>0 && _idade1<150) && (idade1>0 && _idade1<150)) {
			System.out.println("Media das idades --> " +((_idade1 + _idade2)/2));
		}
	}
}
