import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Modalidade[] modalidades = new Modalidade[2];
		for (int i =0; i < 2; i++) {
			System.out.println("Digite o código da modalidade:");
			int codigo = teclado.nextInt();
			teclado.nextLine();
			System.out.println("Digite o nome da modalidade:");
			String nomeModalidade = teclado.nextLine();
			System.out.println("Digite o gênero da modalidade (0 = unissex, 1 = masculino, 2 = feminino):");
			int genero = teclado.nextInt();
			teclado.nextLine();

			modalidades[i] = new Modalidade(codigo, nomeModalidade, genero);
		}

		Atleta[] atletas = new Atleta[6];
		for (int i = 0; i < 6; i++) {
			System.out.println("Digite o CPF do atleta:");
			String cpf = teclado.nextLine();
			System.out.println("Digite o nome do atleta:");
			String nomeAtleta = teclado.nextLine();
			System.out.println("Digite o gênero do atleta (1 = masculino, 2 = feminino):");
			int generoAtleta = teclado.nextInt();
			System.out.println("Digite a idade do atleta:");
			int idade = teclado.nextInt();
			teclado.nextLine();
			if (idade < 7 || idade > 21) {
				System.out.println("Idade inválida, o atleta deve ter entre 7 e 21 anos.");
				i--;
				continue;
			}
			atletas[i] = new Atleta(cpf, nomeAtleta, generoAtleta, idade);
		}
		System.out.println("Modalidades inseridas: ");
		for (Modalidade modalidade : modalidades) {
			System.out.println("Codigo: " + modalidade.getCodigo() + ", Nome: " + modalidade.getModalidade() + ", Gênero: " + modalidade.getGenero());
		}
		System.out.println("Atletas inseridos:");
		for (Atleta atleta : atletas) {
			System.out.println("CPF: " + atleta.getCpf() + ", Nome: " + atleta.getNome() + ", Gênero: " + atleta.getGenero() + ", Idade: " + atleta.getIdade());
		}

		teclado.close();
	}
}