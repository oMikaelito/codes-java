class Chefe extends Funcionario {
    private double adicionalFuncao;
    private double beneficioTerno;

    public Chefe(String nome, double salarioBase, double adicionalFuncao, double beneficioTerno) {
        super(nome, salarioBase);
        this.adicionalFuncao = adicionalFuncao;
        this.beneficioTerno = beneficioTerno;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (salarioBase * adicionalFuncao / 100) + beneficioTerno;
    }
}