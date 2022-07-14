//Aplicacion que simule el rol de pago
package app;

public class ejercicio10 {
    public static void main(String[] args) {
        String empleado="Adrian";
        String cargo=" ";
        int n_horas=160;
        int p_horas=20;
        double sueldo=3.200;
        double ies=  0.0;
        double neto= 0.0;
        
       sueldo= n_horas*p_horas;
       ies=sueldo*0.09;
       neto=sueldo-ies;
       
       System.out.println("Empleado:"+empleado);
       System.out.println("Cargo:"+cargo);
       System.out.println("--------ROL MES 2022--------");
       System.out.println("Descuento IESS: "+ies);
       System.out.println("Valor neto a recibir: "+neto);
        
    
    }
    
}
