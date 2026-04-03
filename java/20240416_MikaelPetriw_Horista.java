class Horista extends Funcionario {
    private double valorHora;
    private int numeroHoras;

    public Horista(String nome, double salarioBase, double valorHora, int numeroHoras) {
        super(nome, salarioBase);
        this.valorHora = valorHora;
        this.numeroHoras = numeroHoras;
    }

    @Override
    public double calcularSalario() {
        return valorHora * numeroHoras;
    }
}