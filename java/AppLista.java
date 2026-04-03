public class AppLista {
	public static void main(String[] args) {
		Lista l1 = new Lista(5);
		l1.Insere(1, 0);
		l1.Insere(2, 1);
		l1.Insere(3, 2);
		l1.Insere(40, 3);
		l1.Insere(5, 4);

		for(int i=0; i<l1.valores.length; i++) {
			if (l1.valores[i]==40) {
				System.out.println("O valor 40 está no indice:" + i);
			}
		}
	}
}