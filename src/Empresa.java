import java.util.ArrayList;

public class Empresa implements Gerenciamento {
   private ArrayList<Pessoa> pessoas = new ArrayList<>();

   @Override
   public String addPessoa(Pessoa pessoa) {
       try{
           pessoas.add(pessoa);

           return "Sucesso";
       } catch (Exception ex){
           return "Erro:" + ex.getMessage();
       }
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
   public String updatePessoa(String nome, Pessoa pessoa) {
       try{
           var index = pessoas.indexOf(pessoa);
           pessoas.set(index, pessoa);

           return "Sucesso";
       } catch (Exception ex){
           return "Erro:" + ex.getMessage();
       }
   }

    @Override
    public String deletePessoa(String nome) {
       try{
           pessoas.removeIf(pessoa -> pessoa.getNome().equals(nome));

           return "Sucesso";
       } catch (Exception ex){
           return "Erro:" + ex.getMessage();
       }
    }
}
