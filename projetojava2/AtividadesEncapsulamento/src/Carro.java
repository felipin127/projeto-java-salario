// ==================================================
// CLASSE CARRO
// ==================================================
public class Carro {
    
    // ==================== ATRIBUTOS ====================
    private String modelo;
    private String marca;
    private String cor;

    // ==================== MÉTODOS SETTERS ====================
    
    /**
     * Define o modelo do carro
     * @param modelo Modelo do veículo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Define a marca do carro
     * @param marca Fabricante do veículo
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Define a cor do carro
     * @param cor Cor do veículo
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    // ==================== MÉTODOS GETTERS ====================
    
    /**
     * Retorna o modelo do carro
     * @return Modelo do veículo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Retorna a marca do carro
     * @return Fabricante do veículo
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Retorna a cor do carro
     * @return Cor do veículo
     */
    public String getCor() {
        return cor;
    }
}