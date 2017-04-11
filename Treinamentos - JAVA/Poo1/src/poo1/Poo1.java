
package poo1;

public class Poo1 {

    public static void main(String[] args) {
        
        /*Caneta c1 = new Caneta();
        c1.carga = 1;
        c1.modelo = "Vinicius";
        c1.destampar();
        c1.ponta = 0.5f;
        c1.cor = " Azul";
        
        c1.status();
        c1.rabiscar();*/
        
        Carro carro1 = new Carro();
      //  carro1.carroligado = false;
        carro1.cor = "PRETA";
      //  carro1.farol = false;
        //carro1.gasolina = false;
        carro1.qtdPortas = 4;
       // carro1.portas = true;
        carro1.modelo = "FORD";
        
        carro1.carroLigado();
        carro1.faroisLigado();
        carro1.portasAbertas();
        carro1.semGasolina();
        carro1.status();
    }
    
}
