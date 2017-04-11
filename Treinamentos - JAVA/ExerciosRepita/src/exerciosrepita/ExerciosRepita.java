/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciosrepita;

import javax.swing.JOptionPane;

/**
 *
 * @author Vinicius
 */
public class ExerciosRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        int n, s = 0, total = -1, impar = 0, par = -1, cem = 0;

        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html> Informe um numero <br> <em>(valor 0 interrompe o loop)</em></html>"));
            s += n;
            total++;

            if (n % 2 == 1) {

                impar++;
            } else {

                par++;
            }
            if (n >= 100) {

                cem++;

            }

        } while (n != 0);

        int m = s / total;

        JOptionPane.showMessageDialog(null, "<html>Resultado<hr> "
                + " <br>Total de numeros digitados: " + total
                + "<br>Numeros Impares: " + impar
                + "<br>Numeros Pares: " + par
                + "<br>Numeros maiores que 100: " + cem
                + "<br>A media dos valores são: " + m + " </html>");

    }

}
