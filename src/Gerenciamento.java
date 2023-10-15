public interface Gerenciamento {
    void addPessoa(Pessoa pessoa);
    Pessoa getPessoa(String nome);
    void updatePessoa(String nome, Pessoa pessoa);
    void deletePessoa(String nome);
}
