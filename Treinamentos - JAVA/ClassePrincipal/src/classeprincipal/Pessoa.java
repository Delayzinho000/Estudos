package classeprincipal;

public class Pessoa {
    
    private String nome;
    private int idade;
    private String sexo;
    
    
    //Métodos Especiais
    
   public Pessoa(String n,int id,String s){
        
        this.setNome(n);
        this.setIdade(id);
        this.setSexo(s);
    }
    
    //Metodo Getter / Metodo de Acesso a variavel
    public String getNome(){
        return this.nome;
    }
    
    //Método Setter / Método de Modificador da variavel
    public void setNome(String n){
        
        this.nome = n;
    }
    
    //Método Getter / Método de Acesso a varial
    public int getIdade(){
        
        return this.idade;
       
    }
    
    //Método Setter / Método de Modificador da variavel
    public void setIdade(int id){
        
        this.idade = id;
    }
    
    //Método Getter / Método de Acesso a varialve
    public String getSexo(){
        
        return this.sexo;
    }
    
    //Método Setter / Método Modificador da variavel
    public void setSexo(String s){
        
        this.sexo = s;
    }
    
    //Métodos Publicos
    public void fazerAniversario(){

    }
    
    
}
