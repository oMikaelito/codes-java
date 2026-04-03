public class AppTelevisao {
	public static void main(String[] args) {
		Televisao tv1 = new Televisao();
		Televisao tv2 = new Televisao();

		tv1.marca = "LG";
		tv1.ligada = false;
		tv1.volume = 10;
		tv1.canal = 500;

		tv2.marca = "SAMSUNG";
		tv2.ligada = false;
		tv2.volume = 10;
		tv2.canal = 500;

		tv1.ligarDesligar();
		tv1.aumentarVolume();
		tv1.avancarCanal();

		tv2.ligarDesligar();
		tv2.aumentarVolume();
		tv2.avancarCanal();
	}
}