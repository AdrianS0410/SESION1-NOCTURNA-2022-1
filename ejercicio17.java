
package app;

import javax.swing.JOptionPane;


public class ejercicio17 {
public static void main(String[] args) {
        //ENTRADA hacer un ejercicio de palabra palindroma 
        String palabra="";
        String palabranueva="";
        int longitud=0;
        //PROCESO
        palabra = JOptionPane.showInputDialog("Ingrese una palabra: ");
        longitud = palabra.length();
        for (int indice = longitud-1; indice>=0; indice--) {
            //ARMAMOS LA NUEVA PALABRA
            
        palabranueva = palabranueva+palabra.charAt(indice);
            
        }
        //Salida
        if (palabra.equals(palabranueva)) {
            JOptionPane.showMessageDialog(null, "Es palindroma");
            
        }else{
            JOptionPane.showMessageDialog(null, "No es polindroma");
        }
    }
    
}
    
