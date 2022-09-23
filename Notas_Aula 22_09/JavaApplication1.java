package javaapplication1;
import java.util.Scanner;



public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tlc = new Scanner(System.in);
        
        class Smartphone {
            String marca;
            int ano;
            
            public static void Ligar() {
                System.out.println("O celular ligou");
            }
        }
        
        Smartphone iPhone = new Smartphone();
        Smartphone S21 = new Smartphone();
        
        iPhone.ano = 2019;
        iPhone.marca = "Apple";
        iPhone.Ligar();
        
        S21.ano = 2021;
        S21.marca = "Samsung";
    
        class Aluno {
            String nome;
            int RA;
            int NT1;
            int NT2;
            int media;
            
            
            public void mostrarDadosDoAluno() {
                System.out.println("Nome do aluno é " + nome);
                System.out.println("O RA do aluno é " + RA);
            }
            
            public void calcularMédia() {
              media = (NT1 + NT2) / 2;
              System.out.println(media);
            }
           
            
        }
        
        
        Aluno aluno = new Aluno();
        System.out.println("Insira sua nota 1: ");
        aluno.NT1 = tlc.nextInt();
        System.out.println("Insira sua nota 2: ");
        aluno.NT2 = tlc.nextInt();
        aluno.calcularMédia();
        
        
        
        
    }
    
}
