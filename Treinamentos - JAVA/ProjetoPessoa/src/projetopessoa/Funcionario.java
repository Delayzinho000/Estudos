package projetopessoa;

public class Funcionario extends Pessoa {
    
    private String setor;
    private boolean trabalhando;
    
    //Métodos Publicos
    public void mudaTrabalho(){
        
       this.trabalhando = !this.trabalhando; 
    }
    
    //Métodos Especiais

    public String getSetor() {//Método de Acesso a variavel Getter
        return setor;
    }

    public void setSetor(String setor) {//Método de Modificador da variavel Setter
        this.setor = setor;
    }

    public boolean getTrabalhando() {//Método de Acesso a variavel Getter
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {//Método de Modificador da variavel Setter
        this.trabalhando = trabalhando;
    }
    
    
}
