public class TestePrecoIngresso {
	public static void main(String[] args) {
		Ingresso ingresso = new Ingresso(30.0);
		System.out.println(ingresso);
		
		IngressoVIP ingressoVIP = new IngressoVIP(60.0, 30.0);
		System.out.println(ingressoVIP);
	}
}