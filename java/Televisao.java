public class Televisao {

	// atributos

	String marca;
	boolean ligada;
	int volume;
	int canal;

	// métodos

	void ligarDesligar() {
		if (ligada) {
			ligada = false;
			System.out.println("A TV " + marca + " está desligada.");
		} else {
			ligada = true;
			System.out.println("A TV " + marca + " está ligada.");
		}
	}
	void aumentarVolume() {
		if (ligada) {
			volume++;
			if(volume>50) {
				volume = 50;
			}
			System.out.println("O volume da TV " + marca + " está em " + volume);
		} else {
			System.out.println("A TV " + marca + " está desligada.");
		}
	}
	void diminuirVolume() {
		if (ligada) {
			volume--;
			if (volume<0) {
				volume = 0;
			}
			System.out.println("O volume da TV " + marca + " está em " + volume);
		} else {
			System.out.println("A TV " + marca + " está desligada.");
		}
	}
	void avancarCanal() {
		if (ligada) {
			canal++;
			if (canal>999) {
				canal = 1;
			}
			System.out.println("O canal da TV " + marca + " está em " + canal);
		} else {
			System.out.println("A TV " + marca + " está desligada.");
		}
	}
	void voltarCanal() {
		if (ligada) {
			canal--;
			if (canal<1) {
				canal = 999;
			}
			System.out.println("O canal da TV " + marca + " está em " + canal);
		} else {
			System.out.println("A TV " + marca + " está desligada.");
		}
	}
}