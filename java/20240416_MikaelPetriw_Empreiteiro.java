class Empreiteiro extends Funcionario {
    private double valorEmpreitada;

    public Empreiteiro(String nome, double valorEmpreitada) {
        super(nome, 0); // Empreiteiros não têm salário base
        this.valorEmpreitada = valorEmpreitada;
    }

    @Override
    public double calcularSalario() {
        return valorEmpreitada;
    }
}