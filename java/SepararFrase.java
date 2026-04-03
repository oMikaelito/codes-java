import java.util.Scanner;

public class SepararFrase {

    public static void separaPalavras(String frase, int pos) {
        if (pos >= frase.length()) {
            return;
        }

        int inicioPalavra = pos;
        while (pos < frase.length() && frase.charAt(pos) != ' ') {
            pos++;
        }
        String palavra = frase.substring(inicioPalavra, pos);
        System.out.println(palavra);

        while (pos < frase.length() && frase.charAt(pos) == ' ') {
            pos++;
        }

        separaPalavras(frase, pos);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String frase;

        do {
            System.out.print("Entre com uma frase (ou digite 'fim' para sair): ");
            frase = teclado.nextLine();

            if (!frase.equalsIgnoreCase("fim")) {
                System.out.println("Separando palavras da frase:");
                separaPalavras(frase, 0);
                System.out.println("========================================");
            }
        } while (!frase.equalsIgnoreCase("fim"));

    }
}
