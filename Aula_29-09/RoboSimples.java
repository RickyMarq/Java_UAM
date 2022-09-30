package javaapplication3;
import java.util.Scanner;
import java.lang.String;


/**
 *
 * @author 12522135201
 */
public class RoboSimples {
    private char direcao;
    private String test = "N";
    
    
    
   public void mover(String test) {
    this.test = test;
    
    if (test.equals("N")) {
          System.out.println("Moveu para o norte");
   } else if (test == "O") {
       System.out.println("Moveu para o Oeste");
   } else if (test.equals("L")) {
       System.out.println("Moveu para o Leste");
   } else if (test.equals("S")) {
       System.out.println("Moveu para o sul");
   } else {
       System.out.println("Inválido");
   }
    
   }
}
