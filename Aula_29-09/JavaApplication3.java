
package javaapplication3;
import java.util.Scanner;

public class JavaApplication3 {

 
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        // Criando uma ints da classe 
        
        RoboSimples robo = new RoboSimples();
        robo.mover("S");
        
        Calculadora calc = new Calculadora();
        
        System.out.println(calc.operacaoSoma(5, 10));
        System.out.println(calc.operacaoDiv(10, 2));
        
        
        
        class ContaCorrente {
            private int numero;
            private double saldo;
            private String nome;
            
            
            public void get(int numero) {
                System.out.println(numero);
            }
            
            public void set(int numero) {
                System.out.println(numero);
                
            }   
            public void test(Scanner teclado, String nome) {
                System.out.println("Insira seu nome");
                nome = teclado.next();
                System.out.println("Olá " + nome);
           
        }     
    }
    
  
    }
    
}

