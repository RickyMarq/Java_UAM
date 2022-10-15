/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication10;
import java.util.Scanner;

/**
 *
 * @author profslpa
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nome;
        System.out.println("Insira um nome: ");
        nome = tcl.next();
        
        Personagem Rick = new Personagem(nome);
        Rick.nome = tcl.nextLine();
        System.out.println("Bem vindo: " + nome);
        
        
        Rick.Energia = 5;
        Rick.Fome = 3;
        Rick.Sono = 4;
        
//        Rick.Cacar();
//        System.out.println(Rick.Fome);
//        System.out.println(Rick.Energia);
//        System.out.println(Rick.Sono);
//               

        Rick.Comer();
        Rick.getStatus();
        
        
    }
    
}
