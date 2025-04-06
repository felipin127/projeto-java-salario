// ==================================================
// CLASSE ESTUDANTE
// ==================================================
public class Estudante {
    
    // ==================== ATRIBUTOS ====================
    private String nome;
    private String cpf;
    private String curso;
    private int idade;

    // ==================== MÉTODOS PRINCIPAIS ====================
    
    /**
     * Cadastra os dados completos do estudante
     * @param nome Nome completo do estudante
     * @param cpf CPF do estudante
     * @param curso Curso matriculado
     * @param idade Idade do estudante
     */
    public void cadastrar(String nome, String cpf, String curso, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.curso = curso;
        this.idade = idade;
    }

    /**
     * Exibe todos os dados do cadastro do estudante formatados
     */
    public void exibirCadastro() {
        System.out.println("\n--- DADOS DO ESTUDANTE ---");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Curso: " + curso);
        System.out.println("Idade: " + idade + " anos");
    }

    // ==================== GETTERS & SETTERS ====================
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}