package controle;

public class ControleRemoto implements Controlador {

    //ATRIBUTOS
    private int volume;
    private boolean ligado;
    private boolean tocando;

    //METODOS ESPECIAIS
    
    //METODO CONSTRUTOR
    public ControleRemoto() {

        volume = 50;
        ligado = false;
        tocando = false;
    }

    //METODO DE ACESSO GETTER 
    private int getVolume() {

        return this.volume;
    }

    //METODO DE MODIFICADOR SETTER
    private void setVolume(int v) {

        this.volume = v;
    }

    //METODO DE ACESSO GETTER
    private boolean getLigado() {

        return this.ligado;
    }

    //METODO DE MODIFICADOR SETTER
    public void setLigado(boolean l) {

        this.ligado = l;
    }

    //METODO DE ACESSO GETTER
    private boolean getTocando() {

        return this.tocando;

    }
    
    //METODO DE MODIFICADOR SETTER
    private void setTocando(boolean t){
        
        this.tocando = t;
    }

    @Override
    public void ligar() {
        
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abriMenu() {
        
        System.out.println("Esta ligado? " + this.getLigado());
        System.out.println("Ta tocando? " + this.getTocando());
        System.out.print("Volume:" + this.getVolume());
        for(int i = 0; i<= this.getVolume(); i +=10){
            
            System.out.print("|");
        }
        
    }

    @Override
    public void fecharMenu() {
        
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        
        if(this.getLigado() == true){
            this.setVolume(getVolume() + 1);
        }
    }

    @Override
    public void menosVolume() {
        
        if(this.getLigado() == true){
            
            this.setVolume(getVolume() - 1);            
        }
    }

    @Override
    public void ligarMudo() {
        
        if(this.getLigado() == true && this.getVolume() > 0){
            
            this.setVolume(0);
        }
    }
    
   @Override
    public void desligarMudo() {
        
        if(this.getLigado() == true && this.getVolume() == 0 ){
            
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        
        if(this.getLigado() == true && !(this.getTocando())){
            
            this.setTocando(true);
        }
        
    }

    @Override
    public void pause() {
        
        if(this.getLigado() == true && this.getTocando()){
            
            this.setTocando(false);
        }
    }

    
}
