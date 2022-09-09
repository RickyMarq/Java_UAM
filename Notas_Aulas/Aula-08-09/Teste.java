package teste;

// Importando libraries.
import java.util.Scanner;
import java.util.Random;

public class Teste {
    public static void main(String[] args) {
        // Criação de um teclado.
        Scanner tcl = new Scanner(System.in);
        Random aleatorio = new Random();
        
        String[] nomes = {"Henrique", "Felipe", "Amanda"};
        System.out.println("Index 0 da array nomes: " + nomes[0]);
        
      
//        for (int i = 0; i <5; i++) {
//            System.out.println(i);
//        }
//        
        // Operações com números aleatórios.
        int nu1 = aleatorio.nextInt(10);
        int nu2 = aleatorio.nextInt(10);
        
        System.out.println(nu1 + nu2);
        
    
//        int arrayDeNumeros[] = new int[10];
//        for (int i = 0; i<arrayDeNumeros.length; i++) {
//            System.out.println("Digite um número: ");
//            arrayDeNumeros[1] = tcl.nextInt();
//            
//        }
//        
//        
     
        int array[] = {1, 3, 5, 6};
        
        // Acessando um index específico.
        System.out.println(array[2]);
            
        // Percorrendo a array 
        
//        for (int i = 0; i<array.length; i++) {
//            System.out.println(i);
//        }
//       

        // Clone de arrays. 

        int arrayA[] = new int[8];
        int arrayB[] = new int[8];
        
        
//        for (int a = 0; a<3; a++) {
//            System.out.println("Digite um número: ");
//            arrayA[a] = tcl.nextInt(); 
//            arrayB[a] = arrayA[a]*3;
//        }
//        
//        for (int b = 0; b<3; b++) {
//            System.out.println(arrayB[b]);
//        }
        
        // Criar uma nova array somando duas anteriores. 
        
        int arrayAA[] = new int [4];
        int arrayBB[] = new int [7];
        
       
        int arrayF[] = new int [11];
        
        for (int i = 0; i<arrayAA.length; i++) {
            System.out.println("Adicione os elementos da array A:");
            arrayAA[i] = tcl.nextInt();
            arrayF[i] = arrayAA[i];
           
        }
        
        for (int i = 0; i<arrayBB.length; i++) {
            System.out.println("Adicione os elementos da array B: ");
            arrayBB[i] = tcl.nextInt();
          
          
            
        
            
            
            
        }
        
        
        System.out.println(arrayF[1]);
    }
}
