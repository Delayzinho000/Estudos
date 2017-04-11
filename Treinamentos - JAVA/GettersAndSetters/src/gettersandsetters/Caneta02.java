package gettersandsetters;

public class Caneta02 {
    
    private String modelo;
    private String cor;
    private float ponta;
    private boolean tampada ;
    
    
    public Caneta02(String m, float p, String c){
        
       this.modelo = m;
       this.ponta = p;
       this.cor = c ;        
       this.tampada = true;    
    }
    
    public boolean getTampada(){
    
        return tampada;
    }
    
    public void setTampada(boolean t){
        
        this.tampada = t;
    }
    
    public String getModelo(){ // METODO DE ACESSO
        
         return modelo;        
    }
    public void setModelo(String m ){ // MEDOTO DE MODIFICADORES
    
        this.modelo = m;
    
    }
    
    public void status(){
        
        System.out.println("O modelo da caneta é " + this.getModelo());
        System.out.println("A caneta está " + this.getTampada());
        System.out.println("A ponta da caneta é " + this.ponta);
    }
    
    
}
