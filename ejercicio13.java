package app;

import javax.swing.JOptionPane;

public class ejercicio13 {

    public static void main(String[] args) {
        String numeroEnteroString = "5";
        String numeroDecimalString = "2.5";
        char caracterSexo ='M';
        int numeroEnteroConvertido = 0;
        double numeroDecimalConvertido = 0.0;
        String caracterSexoString = "";

        //Proceso
        int entrada = Integer.parseInt(JOptionPane.showInputDialog(null, "*****MENU DE CONVERSIONES*****" + "\n"
                + "1.CONVERTIR DE STRING - ENTERO" + "\n"
                + "2. CONVERTIR DE STRING - DOUBLE" + "\n"
                + "3.CONVERTIR DE CHAR - STRING"));

        if (entrada == 1) {
            numeroEnteroConvertido = Integer.parseInt(numeroEnteroString);
            JOptionPane.showMessageDialog(null, "La conversion String - Entero es: " + numeroEnteroConvertido);
        } else if (entrada == 2) {
            numeroDecimalConvertido = Integer.parseInt(numeroDecimalString);
            JOptionPane.showMessageDialog(null, "La conversion String - Double es: " + numeroDecimalConvertido);
        } else if (entrada == 3) {
            caracterSexoString = String.valueOf(caracterSexo);
            JOptionPane.showMessageDialog(null, "La conversion Char - String es: " + caracterSexoString);
        } else {
            JOptionPane.showMessageDialog(null, "!Gracias por utilizar el sistema¡");
            System.exit(0);
        }

    }

}
