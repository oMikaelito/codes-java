class Comissionado extends Funcionario {
    private double comissao;

    public Comissionado(String nome, double salarioBase, double comissao) {
        super(nome, salarioBase);
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (salarioBase * comissao / 100);
    }
}