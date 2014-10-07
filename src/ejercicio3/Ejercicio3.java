/*
 * Convertor de euro a dolar
 */
package ejercicio3;
import java.util.Scanner;
/**
 *
 * @author bhernandezsouto
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        float cambio,cantidad;
        Scanner ab = new Scanner(System.in);
        System.out.println("Introduzca valor de cambio de euro a dolar");
        cambio = ab.nextFloat();
        System.out.println("Introduzca la cantidad de euros a convertir");
        cantidad = ab.nextFloat();
        System.out.println("La cantidad introducida en dolares es: " + (cambio*cantidad)); 
    }
    
}
