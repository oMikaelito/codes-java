public class EstruturaDoWhile1 {
	public static void main(String[]args){
		float salario = 1000F;
		do {
			System.out.println("Meu salario ainda eh de =" + salario);
			salario *= 1.2F;


		} while (salario < 5000); 
		System.out.println("Meu salario agora eh de =" + salario);
	}
}