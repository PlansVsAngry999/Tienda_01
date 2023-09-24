package tienda_01;
/**
 * Programa que solicita la cantidad y el costo de los articulos a adquirir; 
 * y visualiza el total, total con IVA y el neto a pagar.
 * @author Ricardo Daniel Hernandez Sosa (PlansVsAngry999).
 */
import java.util.Scanner;
public class Tienda_01 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        float costo, total = 0;
        int art, n;
        System.out.print("¿Cuántos articulos desea adquirir? R = ");
        art = sn.nextInt();
        for(n=1;n<=art;n++){
            System.out.print("El articulo "+n+" tiene un precio de: ");
            costo = sn.nextFloat();
            total = total + costo;
        }
        System.out.println();
        System.out.println("El total a pagar es: "+total);
        System.out.println("El IVA es de: "+(total*0.16));
        System.out.println("El neto es de: "+(total+(total*0.16)));
    }
    
}
