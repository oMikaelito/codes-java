public class Teste {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[] {
            new Chefe("Pedro", 5000, 20, 1000),
            new Comissionado("Joaquina", 3000, 15),
            new Horista("Luiza", 0, 50, 40),
            new Empreiteiro("Lucas", 10000)
        };

        for (Funcionario funcionario : funcionarios) {
            System.out.println("Recibo de Pagamento para " + funcionario.nome + ":");
            System.out.println("Salário: R$" + funcionario.calcularSalario());
            System.out.println();
        }
    }
}