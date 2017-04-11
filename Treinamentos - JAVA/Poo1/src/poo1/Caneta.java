
package poo1;

public class Caneta {
    
    String cor;
    String modelo;
    float ponta;
    int   carga;
    boolean tampado;
    
    
    void tampar(){  
        
        this.tampado = true;
       
    }
    
    void destampar(){        
        this.tampado = false;        
    }
    
    void rabiscar(){

    if(this.tampado == true){
        
        System.out.println("ERRO! Imporssivel rabiscar com a caneta tampada");
    }else{
        System.out.println("Estou rabiscando");
    }
        
    }
    
    void status(){
        
        System.out.println("A cor da caneta é " + this.cor);
        System.out.println("A ponta da caneta é do tamanho " + this.ponta);
        System.out.println("O modelo da caneta é " + this.modelo);
        System.out.println("A carga da caneta é " + this.carga);
    }
}
