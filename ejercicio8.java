// Aplicacion que valide el medio de pago en efectivo y documentos en la venta
//De un vehiculo 
package app;

public class ejercicio8 {

    public static void main(String[] args) {
        //Entrada 
        String vehiculo = "FORD-F";
        boolean licencia = true;
        boolean efectivo = true;

        if (licencia == true) {
            if (efectivo == true) {
                System.out.println("Se ejecuta la venta del vehiculo");

            } else {
                System.out.println("No se ejcuta la venta del vehiculo");
            }
        } else {
            System.out.println("No se ejcuta la venta del vehiculo");
        }

    }

}
