package contadebanco;

public class Conta {
    
    // ATRIBUTOS DA CLASSE CONTA  (O QUE ELA SABE SOBRE SI)
    public int numConta;
    protected String tipoConta;
    private String   donoDaConta;
    private double   saldo;
    private boolean   status;  
    
    
    
    //METODO CONSTRUTOR QUE SERA CRIADO APARTIR DA INSTANCIA DA CLASSE -  CRIAÇÃO DO OBJETO
    
    public Conta(){
        
        this.setSaldo(0.0);
        this.setStatus(true);
    }
    
    //METODO DE ACESSO GETTER DO ATRIBUTO NUMERO DA CONTA
    public int getNumConta(){
        
        return this.numConta;
    }
    
    //METODO DE MODIFICADOR SETTER DO ATRIBUTO NUMERO DA CONTA
    public void setNumConta( int numeroConta){
        
        this.numConta = numeroConta;
    }
    
    //METODO DE ACESSO GETTER DO ATRIBUTO TIPO CONTA
    public String getTipoConta(){
        
        return this.tipoConta;
    }
    
    //METODO DE MODIFICADOR SETTER DO ATRIBUTO TIPO CONTA
    public void setTipoConta(String tipoConta){
        
        this.tipoConta = tipoConta;
    }
    
    //METODO DE ACESSO GETTER DO ATRIBUTO DONO DA CONTA
    public String getDonodaConta(){
        
        return donoDaConta;
    }
    
    // METODO DE MODIFICADOR SETTER DO ATRIBUTO DONO DA CONTA
    public void setDonodaConta(String nomeDonoConta){
        
        this.donoDaConta = nomeDonoConta;
        
    }
    
    //METODO DE ACESSO GETTER DO ATRIBUTO SALDO
    public double getSaldo(){
        
        return this.saldo;
    }
    
    //METODO DE MODIFICADOR SETTER DO ATRIBUTO SALDO
    public void setSaldo(double saldoConta){
        
        this.saldo = saldoConta;
    }
    
    //METODO DE ACESSO GETTER DO ATRIBUTO STATUS
    public boolean getStatus(){
        
        return this.status;
    }
    
    //METODO DE MODIFICADOR SETTER DO ATRIBUTO STATUS
    public void setStatus(boolean statusConta){
        
        this.status = statusConta;
    }
    
    // METODOS DA CLASSE CONTA ( O QUE ELA FAZ)
    public void abrirConta(String t){
        
        this.setTipoConta(t);
        this.setStatus(true);
        
        if(this.getTipoConta() == "CC"){
            this.setSaldo(50);            
        }else if(this.getTipoConta() == "CP"){
            
            this.setSaldo(150);
        }
        
        System.out.println("Conta aberta em nome de " + this.getDonodaConta());
    }
    
    public void fecharConta(){   
        
        
    }
    
    public void depositar(){
        
        
    }
    
    public void sacar(){
        
        
    }
    
    public void pagarMensal(){
        
    }
    
    public void estadoAtual(){
        
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Dono: " + this.getDonodaConta());
    }
}
