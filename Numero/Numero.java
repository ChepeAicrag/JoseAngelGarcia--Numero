
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
    public static void main(String[]args){ // Inicio del main
        Scanner leer = new Scanner(System.in); // Declaración de la variable para leer de teclado
        boolean op = false; // Declaracion de variable que indica si la lectura es correcta
        while(!op) // Inicio del while
        try{ // Inicio del try
         StdOut.println("Introduce el numero"); // Solicitar el numero a evaluar 
         double n = leer.nextDouble(); // Declaracion de la variable que guarda el numero introducido
         tal(n); // Ejeccución del método tal
         op = true; // Se indica que la lectura es correcta
        }catch(Exception e){ // Se atrapa la excepcioón si es que llega a ocurrir
            StdOut.println("Introduce un numero"); // Se vuelva a solicitar un dato correcto
        } // Cierre del catch y fin del bloque try - catch
    } // Cierre del main
    /**
     * Método que imprime si el numero es cero, positivo o negativo
     * @param n Numero que se analiza 
       */
    public static void tal(double n){ // Inicio del método
        if(n == 0 ) // Se evalua si el número intorducido es 0 
            StdOut.println("El numero es 0"); // Se imprime si es 0
        else if(n < 0 )   // Se evalua si el número intorducido es negativo  
            StdOut.println("El numero es negativo"); // Se imprime si es negativo 
        else 
            StdOut.println("El numero es positivo"); // Se imprime si es positivo 
     } // Cierra del método
} // Cierre de la clase

