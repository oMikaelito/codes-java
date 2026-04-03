public class EstruturaDoWhile2 {
	public static void main(String[]args){
		float salario = 6000F;
		do {
			System.out.println("Meu salario ainda eh de =" + salario);
			salario *= 1.2F;


		} while (salario < 5000); 
		System.out.println("Meu salario agora eh de =" + salario);
	}
}