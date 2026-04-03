import java.util.Scanner;
public class RecursividadeExemplo {
    public static int fatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n*fatorial(n - 1);
        }
    }
    public static void main(String[] args) {
        int numero = 0;
        Scanner teclado = new Scanner(System.in);
        do { 
            System.out.print("Entre com um numero (0 -> finaliza):");
            numero = teclado.nextInt();

            int resultado = fatorial(numero);
            System.out.println("Fatorial de " + numero + " = " + resultado);
            System.out.println("========================================");
        } while (numero>0);
    }
}