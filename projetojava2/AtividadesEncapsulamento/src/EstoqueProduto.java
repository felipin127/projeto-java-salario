// ==================================================
// CLASSE ESTOQUE PRODUTO
// ==================================================
public class EstoqueProduto {
    
    // ==================== ATRIBUTOS ====================
    private String descricao;
    private int quantidade;
    private double valorUnitario;

    // ==================== MÉTODOS SETTERS ====================
    
    /**
     * Define a descrição do produto
     * @param descricao Descrição do produto
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Define a quantidade em estoque
     * @param quantidade Quantidade disponível
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * Define o valor unitário do produto
     * @param valorUnitario Valor individual do item
     */
    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    // ==================== MÉTODOS GETTERS ====================
    
    /**
     * Retorna a descrição do produto
     * @return Descrição do item
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Retorna a quantidade em estoque
     * @return Quantidade disponível
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * Retorna o valor unitário
     * @return Valor individual do produto
     */
    public double getValorUnitario() {
        return valorUnitario;
    }

    // ==================== MÉTODOS DE CÁLCULO ====================
    
    /**
     * Calcula o valor total em estoque
     * @return Valor total (quantidade × valor unitário)
     */
    public double calcularValorTotal() {
        return quantidade * valorUnitario;
    }

    // ==================== MÉTODOS DE EXIBIÇÃO ====================
    
    /**
     * Exibe os detalhes completos do produto
     */
    public void exibirDetalhes() {
        System.out.println("Descrição: " + descricao);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor unitário: R$" + valorUnitario);
        System.out.println("Valor total: R$" + calcularValorTotal());
    }
}