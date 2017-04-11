package projetopessoa;

public class Professor extends Pessoa {
    
    //Atributos
    private String especialidade;
    private float salario;
    
    //Métodos Publicos
    public void receberAumento(float aum){
        
        this.salario += aum;
    }
    
    //Métodos Especiais

    public String getEspecialidade() {//Método de Acesso a variavel Getter
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {//Método de Modificador da variavel Setter
        this.especialidade = especialidade;
    }

    public float getSalario() {//Método de Acesso a variavel Getter
        return salario;
    }

    public void setSalario(float salario) {//Método de Modificador da variavel Setter
        this.salario = salario;
    }

  
    
    
}
