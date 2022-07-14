//Aplicacion que me permita presentar la cantidad de vocales y consonantes
// de una palabra 
package app;

import javax.swing.JOptionPane;

public class ejercicio14 {

    public static void main(String[] args) {
        //Entrada
        String palabra = "";
        int longitud = 0;
        int cantidadVocales = 0;
        int cantidadConsonantes = 0;
        //Proceso
        palabra = JOptionPane.showInputDialog(null, "Ingrese la palabra: ");
        //Proceso:obtenemos la longitud de la palabra
        longitud = palabra.length();
        //Proceso: Recorrer y contar las vocales y consonantes
        for (int indice = 0; indice < longitud; indice++) {
            //Validacion de vocales 
            if (palabra.charAt(indice) == 'a' || palabra.charAt(indice) == 'e'
                    || palabra.charAt(indice) == 'i' || palabra.charAt(indice) == 'o'
                    || palabra.charAt(indice) == 'u') {
                cantidadVocales++;
            } else {
                cantidadConsonantes++;
            }

        }
        //Salida
        JOptionPane.showMessageDialog(null, "La cantidad de vocales es: " + cantidadVocales);
        JOptionPane.showMessageDialog(null, "La cantidad de consonantes es: " + cantidadConsonantes);
    }

}
