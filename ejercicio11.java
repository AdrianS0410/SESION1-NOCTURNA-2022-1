package app;

import java.util.Scanner;

public class ejercicio11 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String producto = "";
        int cantidad = 0;
        double precio = 0.0;
        double subtotal = 0.0;
        double iva = 0.0;
        double total = 0.0;
        // proceso
        System.out.print("Ingrese el producto: ");
        producto = entrada.next();
        System.out.print("Cantidad: ");
        cantidad = entrada.nextInt();
        System.out.print("precio: ");
        precio = entrada.nextDouble();
        subtotal = cantidad * precio;
        iva = cantidad * 0.12;
        total = subtotal + iva;
        // Salida
        System.out.println("producto: " + producto);
        System.out.println("subtotal: " + subtotal);
        System.out.println("iva: " + iva);
        System.out.println("total: " + total);

    }

}
