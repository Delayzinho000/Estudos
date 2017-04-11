package projetopessoa;

public class Pessoa {

    private String nome;
    private int idade;
    private String sexo;

    //Métodos Publicos
    public void fazerAniversario() {
        this.idade++;
    }

    //Métodos Especiais
    
    /*public Pessoa(String n , int id , String s){//Método contrutor 
        
        this.setNome(n);
        this.setIdade(id);
        this.setSexo(s);
        
    }*/
    
    
    public String getNome() {//Método de Acesso a variavel Getter

        return nome;
    }

    public void setNome(String n) {//Método de Modificador da variavel Setter

        this.nome = n;
    }

    public int getIdade() {//Método de Acesso a variavel Getter

        return this.idade;
    }
    
    public void setIdade(int id){//Método de Modificador da variavel Setter
        
        this.idade = id;
    }
    
    public String getSexo(){//Método de Acesso a variavel Getter
               
        return this.sexo;
    }
    
    public void setSexo(String s){//Método de Modificador da variavel Setter
    
        this.sexo = s;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + '}';
    }
    
    
}
