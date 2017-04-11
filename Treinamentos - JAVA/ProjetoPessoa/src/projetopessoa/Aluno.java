package projetopessoa;

public class Aluno extends Pessoa {
    
    //Atributos
    private int matricula;
    private String curso;
    
    //Métodos Publicos
    public void cancelarMatricula(){
        
    }
    
    //Métodos Especiais
      
    public int getMatricula(){//Método de Acesso a variavel Getter
        
        return this.matricula;
    }
    
    public void setMatricula(int m){//Método de Modificador da variavel Setter
        
        this.matricula = m;
    }
    
    public String getCurso(){//Método de Acesso a variavel Getter
        
        return this.curso;
    }
    
    public void setCurso(String c){//Método de Modificador da variavel Setter
        
        this.curso = c;
    }

}
