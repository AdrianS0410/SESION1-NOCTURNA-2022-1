//Aplicacion que permita validar el lugar de votacion, la edad, la mesa de un proceso de elecciones
package app;

public class ejercicio9 {

    public static void main(String[] args) {
        String nombre = "Adrian";
        boolean lugar = true;
        boolean edad = false;
        boolean mesa = true;
        if (lugar == true) {
            if (edad == true) {
                if (mesa == true) {
                    System.out.println(nombre + " Esta acto para realizar el proceso de votación");
                } else {
                    System.out.println(nombre + " No se encuentra en la mesa correcta, pero esta en el lugar correcto correcta ");
                }
            } else {
                System.out.println(nombre + " No tiene la edad para realizar el proceso de votación");
                System.out.println("Edad minima para realizar este proceso es de 16 años");
            }
        } else {
            System.out.println(nombre + " No se encuentra en el estblecimiento correcto");
        }
    }
}
