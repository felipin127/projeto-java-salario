public class Caminhao extends Veiculo {
    private double capacidadeCarga;

    public Caminhao(String marca, String modelo, int ano, double capacidadeCarga) {
        super(marca, modelo, ano);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public void acelerar() {
        System.out.println("O caminhão está acelerando lentamente devido ao peso...");
    }

    public void carregar() {
        System.out.println("Caminhão carregando mercadorias...");
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Capacidade de carga: " + capacidadeCarga + " toneladas");
    }
}