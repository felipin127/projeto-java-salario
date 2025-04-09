public class FuncionarioTempoIntegral extends Funcionario {
    private double salarioMensal;
    
    public FuncionarioTempoIntegral(String nome, double salarioMensal) {
        super(nome);
        this.salarioMensal = salarioMensal;
    }
    
    @Override
    public double calcularSalario() {
        return salarioMensal;
    }
}
