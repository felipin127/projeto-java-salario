import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Salário Bruto: ");
            double salarioBruto = scanner.nextDouble();

            System.out.print("Imposto: ");
            double imposto = scanner.nextDouble();

            Funcionario funcionario = new Funcionario(nome, salarioBruto, imposto);

            System.out.println("\nFuncionário: " + funcionario.getNome());
            System.out.printf("Salário Líquido: %.2f\n", funcionario.calcularSalarioLiquido());

            System.out.print("\nDigite a porcentagem para aumentar o salário: ");
            double porcentagem = scanner.nextDouble();
            funcionario.aumentarSalario(porcentagem);

            System.out.println("\nDados atualizados:");
            System.out.println("Funcionário: " + funcionario.getNome());
            System.out.printf("Salário Líquido: %.2f\n", funcionario.calcularSalarioLiquido());

            scanner.close();
        }
    }

    @Override
    public String toString() {
        return "Main []";
    }
}