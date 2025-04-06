public class Carro extends Veiculo {
    private int numeroPortas;

    public Carro(String marca, String modelo, int ano, int numeroPortas) {
        super(marca, modelo, ano);
        this.numeroPortas = numeroPortas;
    }

    @Override
    public void acelerar() {
        System.out.println("O carro está acelerando rapidamente!");
    }

    public void abrirPortaMalas() {
        System.out.println("Porta-malas aberto!");
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Número de portas: " + numeroPortas);
    }
}