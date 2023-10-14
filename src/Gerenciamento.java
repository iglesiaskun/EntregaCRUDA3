public interface Gerenciamento {
    String addPessoa(Pessoa pessoa);
    Pessoa getPessoa(String nome);
    String updatePessoa(String nome, Pessoa pessoa);
    String deletePessoa(String nome);
}
