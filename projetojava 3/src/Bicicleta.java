public class Bicicleta extends Veiculo {
    private int numeroMarchas;

    public Bicicleta(String marca, String modelo, int ano, int numeroMarchas) {
        super(marca, modelo, ano);
        this.numeroMarchas = numeroMarchas;
    }

    @Override
    public void acelerar() {
        System.out.println("A bicicleta está ganhando velocidade!");
    }

    public void pedalar() {
        System.out.println("Pedalando a bicicleta...");
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Número de marchas: " + numeroMarchas);
    }
}
