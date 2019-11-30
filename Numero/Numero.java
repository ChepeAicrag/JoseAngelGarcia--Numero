
/**
 * Indica si un numero es positivo, negativo o cero.
 * @author Garcia Garcia Jose Angel 
 * @version 30/11/2019
 */
import java.util.Scanner;
public class Numero
{
    /**
     * Método principal que ejecuta el programa
     * @param args Omitir, no necesario
       */
    public static void main(String[]args){
        Scanner leer = new Scanner(System.in);
        boolean op = false;
        while(!op)
        try{
         StdOut.println("Introduce el numero");
         double n = leer.nextDouble();
         tal(n);
         op = true;
        }catch(Exception e){
            StdOut.println("Introduce un numero");
        }
    }
    /**
     * Método que imprime si el numero es cero, positivo o negativo
     * @param n Numero que se analiza 
       */
    public static void tal(double n){
        if(n == 0 )
            StdOut.println("El numero es 0");
        else if(n < 0 )   
            StdOut.println("El numero es negativo");
        else
            StdOut.println("El numero es positivo");
     }
}

