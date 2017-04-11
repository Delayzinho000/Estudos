package poo1;

public class Carro {

    public String modelo;
    public String cor;
    public String marca;
    private boolean farol;
    private boolean carroligado;
    private boolean portas;
    private boolean gasolina;
    int qtdPortas;

    void carroLigado() {

        if (this.carroligado == true) {

            System.out.println("Estou pronto para andar !!!");
        } else {
            System.out.println("ERRO !! Ligue o carro para andar !!");
        }

    }

    void faroisLigado() {

        if (this.farol == true) {

            System.out.println("Atenção os farois estão ligado !!");
        } else {

            System.out.println("Atenção os farois estão desligados !!");
        }

    }

    void portasAbertas() {

        if (this.portas = true) {

            System.out.println("As portas estão abertas !!");

        } else {

            System.out.println("Portas fechadas, podemos proseguir !!");

        }
    }

    void semGasolina() {

       if(this.gasolina = true){
       
           System.out.println("O carro não tem gasolina ! ");
       }else{
           System.out.println("Carro com tanque cheio !");
       }
    }

    void status() {
        System.out.println(" ");
        System.out.println("O modelo do carro é " + this.modelo);
        System.out.println("A cor do carro é " + this.cor);
        System.out.println("O carro tem gasolina? " + this.gasolina);
        System.out.println("Quantas portas tem o carro? " + this.qtdPortas);

    }
}
