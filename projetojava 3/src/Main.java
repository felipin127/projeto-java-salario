public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Fiat", "Siena", 2012, 4);
        Bicicleta bicicleta = new Bicicleta("Caloi", "Elite", 2012, 18);
        Caminhao caminhao = new Caminhao("Volvo", "FH", 2019, 15.5);

        System.out.println("----- CARRO -----");
        carro.exibirInformacoes();
        carro.acelerar();
        carro.frear();
        carro.abrirPortaMalas();

        System.out.println("\n----- BICICLETA -----");
        bicicleta.exibirInformacoes();
        bicicleta.acelerar();
        bicicleta.frear();
        bicicleta.pedalar();

        System.out.println("\n----- CAMINHÃO -----");
        caminhao.exibirInformacoes();
        caminhao.acelerar();
        caminhao.frear();
        caminhao.carregar();
    }
}