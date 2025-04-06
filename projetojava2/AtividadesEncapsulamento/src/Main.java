// ==================================================
// CLASSE MAIN CORRIGIDA 
// ==================================================
public class Main {
    public static void main(String[] args) {
        // ========== TESTE ESTOQUE PRODUTO ==========
        EstoqueProduto produto = new EstoqueProduto();
        produto.setDescricao("Notebook");
        produto.setQuantidade(10);
        produto.setValorUnitario(3500.00);
        produto.exibirDetalhes();  // Método correto

        // ========== TESTE ESTUDANTE ==========
        Estudante estudante = new Estudante();
        estudante.cadastrar("João Silva", "123.456.789-00", "Engenharia", 22);
        estudante.exibirCadastro();  // Método correto

        // ========== TESTE CARRO ==========
        Carro carro = new Carro();
        carro.setMarca("Ford");
        carro.setModelo("Fiesta");
        carro.setCor("Vermelho");
        System.out.println("Carro: " + carro.getMarca() + " " + 
                         carro.getModelo() + " - " + carro.getCor());
    }
}