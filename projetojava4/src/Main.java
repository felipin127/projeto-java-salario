public class Main {
    public static void main(String[] args) {
        Funcionario[] funcionarios = {
            new FuncionarioTempoIntegral("João Silva", 5000),
            new FuncionarioMeioPeriodo("Maria Souza", 30, 80),
            new FuncionarioContratado("Carlos Pereira", 36000, 12)
        };

        System.out.println("RELATÓRIO DE FOLHA DE PAGAMENTO");
        System.out.println("===============================");

        for (Funcionario func : funcionarios) {
            String tipoFuncionario = "";
            
            if (func instanceof FuncionarioTempoIntegral) {
                tipoFuncionario = "Tempo Integral";
            } else if (func instanceof FuncionarioMeioPeriodo) {
                tipoFuncionario = "Meio Período";
            } else if (func instanceof FuncionarioContratado) {
                tipoFuncionario = "Contratado";
            }
            
            System.out.printf("Nome: %s | Tipo: %s | Salário: R$ %.2f%n",
                func.getNome(),
                tipoFuncionario,
                func.calcularSalario());
        }
        
        System.out.println("===============================");
    }
}