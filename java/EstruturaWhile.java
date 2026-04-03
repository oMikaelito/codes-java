public class EstruturaWhile {
	public static void main(String[] args) {
		float Salario = 1000F;
		while (Salario <5000) {
			System.out.println("Meu salario ainda é de = " + Salario);
			Salario *= 1.2F;
		}
		System.out.println("Meu salario agora é de = " + Salario);
	}
}