import java.util.Scanner;

public class SeparaPalavra {

    public static void separaPalavras(String frase, int inicio) {
        if (inicio >= frase.length()) {
            return;
        }

        int i = inicio;
        while (i < frase.length() && frase.charAt(i) != ' ') {
            System.out.print(frase.charAt(i));
            i++;
        }
        System.out.println();

        separaPalavras(frase, i + 1);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        while (true) {
            System.out.print("Entre com a frase (Fim -> finaliza): ");
            String input = teclado.nextLine();

            if (input.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.println("Palavras separadas:");
            separaPalavras(input, 0);
        }
        teclado.close();
    }
}