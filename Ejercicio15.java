//Ejercicio15: Aplicacion utilizando switch -- case combiando ciclos repetitivos
//Evaluar dos escenarios donde el escenario 1: Presente los numeros de forma desendente hasta llegar
// A 0 a partir de un numero ingresado
//El segundo escenado 2: Presente los numeros de forma ascendente hasrta llegar a 20 a partir de 
// Un numero ingresado
package app;

import javax.swing.JOptionPane;

public class Ejercicio15 {

    public static void main(String[] args) {
        int numeroIngresado = 0;
        

        //Proceso
        numeroIngresado = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero"));
        int entrada = Integer.parseInt(JOptionPane.showInputDialog(null, "*****MENU DE CONVERSIONES*****" + "\n"
                + "1.PRESENTAR SECUENCIA ASCENDENTE" + "\n"
                + "2.PRESENTAR SECUENCIA DESCENDENTE" + "\n"
                + "3.SALIR"));
        //Evaluar los escenarios 
        switch (entrada) {
            case 1:
                //Generamos la secuencia ascendente
                numeroIngresado = numeroIngresado + 1;
                while (numeroIngresado < 10) {

                    JOptionPane.showMessageDialog(null, numeroIngresado);
                    numeroIngresado++;
                }

                break;
            case 2:  
                //numeroIngresado = numeroIngresado + 1;
        while (numeroIngresado >0) {
             numeroIngresado--;
            JOptionPane.showMessageDialog(null, numeroIngresado);
        }
        
          /*for(int i=numeroIngresado;i>0; i--){
          JOptionPane.showMessageDialog(null, i);
            
          }*/
        
            break;
        }

    }
}
