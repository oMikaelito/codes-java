public class Desvioif {	
	public static void main(String[] args) {
		/* && -> e 		|| -> ou 	! -> não */
		if (10==10 || 10<20) {
			System.out.println("Bloco 1 acionado");
		}
		else {
			System.out.println("else do Bloco 1 acionado");
		}

		if (10!=10 || 10<20) {
			System.out.println("Bloco 2 acionado");
		}
		else {
			System.out.println("else do Bloco 2 acionado");
		}
	}
}