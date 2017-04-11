package classeprincipal;

public class ClassePrincipal {

    public static void main(String[] args) {
        
      Pessoa [] p = new Pessoa[2];
      Livro [] l = new Livro[3];
      
      p[0] = new Pessoa("Vinicius",17,"M");
      p[1] = new Pessoa ("Pedro",23,"M");
      
     l[0] = new Livro("Programar em Java","José",300,p[0]);
     l[0] = new Livro("Java POO","Oliveira",300,p[1]);
     l[0] = new Livro("Poo C#","Matheus",300,p[1]);
     
     l[0].abrir();
     l[0].folhear(2);
    System.out.println(l[0].detalhes());
    
    }
    
}
