package lutas;

import java.util.Random;

public class Luta {

    //ATRIBUTOS 
    private Lutador desafiante;
    private Lutador desafiado;
    private int roud;
    private boolean aprovado;

    //MÉTODOS PUBLICOS
    public void marcarLuta(Lutador l1, Lutador l2) {

        if (l1.getCategoria().equals(l2.getCategoria())) {

            this.aprovado = true;            
            
            this.desafiado = l1;
            
            this.desafiante = l2;
            
            Random ale = new Random();
            int vencedor = ale.nextInt(3); // se for 0 é empate se for 1 o desafiado ganha se for 2 o desafiante ganha
            
            switch(vencedor){
                
                case 0:
                    System.out.println("O " + this.getDesafiado().getNome() + " EMPATOU com " + this.getDesafiante().getNome() );
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println("O vencedor é " + this.getDesafiado().getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println("O vencedor é " + this.getDesafiante().getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }
            

        }else{
            
            System.out.println("A luta não pode acontecer !");
        }
    }

    public void lutar() {

        if(this.aprovado){
            System.out.println("### DESAFIANTE ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIADO ###");
            this.desafiante.apresentar();
            
        }
        
    }

    //METODOS ESPECIAIS
    public Lutador getDesafiante() {

        return desafiante;
    }

    public void setDesafiante(Lutador l1) {

        this.desafiante = l1;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public int getRoud() {
        return roud;
    }

    public void setRoud(int roud) {
        this.roud = roud;
    }

    public boolean getAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
}
