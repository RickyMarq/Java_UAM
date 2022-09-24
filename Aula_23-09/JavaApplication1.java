
package javaapplication1;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author 12522135201
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random alt = new Random();
        
//        int dado1 = alt.nextInt(6);
//        int dado2 = alt.nextInt(6);
        int resultado = 0;
        int dado1 = 0;
        int dado2 = 0;
        
        jogarDados(dado1, dado2, resultado, alt);
        
        
        
        
        
        
        

    }
    
    public static void jogarDados(int dado1, int dado2, int resultado, Random alt) {
       dado1 = alt.nextInt(6);
       dado2 = alt.nextInt(6);
       resultado = dado1 + dado2;
       if (resultado == 7) {
           System.out.println("Você ganhou");
           System.out.println("Dado 1: " +dado1 + " Dado 2: " + dado2);
           
       } else if (resultado == 2) {
           System.out.println("Você ganhou");
           System.out.println("Dado 1: " +dado1 + " Dado 2: " + dado2);
       } else if (resultado == 10) {
           System.out.println("Você perdeu");
           System.out.println("Dado 1: " +dado1 + " Dado 2: " + dado2);
       } else if (resultado == 6) {
           System.out.println("Empatamos");
           System.out.println("Dado 1: " +dado1 + " Dado 2: " + dado2);
       } else {
           System.out.println("Jogue novamente");
           System.out.println("Dado 1: " +dado1 + " Dado 2: " + dado2);
       }
    }
}
