public class FuncionarioContratado extends Funcionario {
    private double valorContrato;
    private int duracaoMeses;
    
    public FuncionarioContratado(String nome, double valorContrato, int duracaoMeses) {
        super(nome);
        this.valorContrato = valorContrato;
        this.duracaoMeses = duracaoMeses;
    }
    
    @Override
    public double calcularSalario() {
        return valorContrato / duracaoMeses;
    }
}