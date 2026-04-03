import java.util.Scanner;
public class FibonacciRecursivo {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    public static void main (String[]args) {
        int termoDesejado = 0;
        int resultado = 0;
        Scanner teclado = new Scanner(System.in);
        do { 
            System.out.print("Entre com o termo desejado (0 -> finaliza):");
            termoDesejado = teclado.nextInt();

            resultado=fibonacci(termoDesejado);
            System.out.println("O " + termoDesejado + " termo da sequencia Fibonacci e: " + resultado);
        } while (termoDesejado>0);
    }
}