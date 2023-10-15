import java.util.ArrayList;

public class Empresa implements Gerenciamento {
   private ArrayList<Pessoa> pessoas = new ArrayList<>();

   @Override
   public void addPessoa(Pessoa pessoa) {
       pessoas.add(pessoa);
   }

   @Override
   public Pessoa getPessoa(String nome){
       for (Pessoa pessoa: pessoas) {
           if(pessoa.getNome().equals(nome))
               return pessoa;
       }

       return null;
   }
   @Override
   public void updatePessoa(String nome, Pessoa pessoa) {
       var index = pessoas.indexOf(pessoa);
       pessoas.set(index, pessoa);
   }

    @Override
    public void deletePessoa(String nome) {
        pessoas.removeIf(pessoa -> pessoa.getNome().equals(nome));
    }
}
