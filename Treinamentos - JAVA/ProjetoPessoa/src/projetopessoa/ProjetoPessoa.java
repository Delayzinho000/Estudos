package projetopessoa;

public class ProjetoPessoa {

    public static void main(String[] args) {
     
      Pessoa p1 = new Pessoa();
      Aluno p2 = new Aluno();
      Professor p3 = new Professor();
      Funcionario p4 = new Funcionario();
      
      
      p1.setNome("Vinícius");
      p2.setNome("Fabio");
      p3.setNome("Paula");
      p4.setNome("Juliana");
      
      
        System.out.println(p1.toString());
      
     
    }
    
}
