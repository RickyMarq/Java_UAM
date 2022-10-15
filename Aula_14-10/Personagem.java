package javaapplication10;
/**
 *
 * @author profslpa
 */
public class Personagem {
    String nome ;
    int Energia;
    int Fome;
    int Sono;
    
    Personagem(String nome) {
        this.nome = nome;     
    }
    
    public void cacar() {
        System.out.println("Caçando");
    }
    
    public void comer() {
        System.out.println("Comendo");
    }
    
    public void dormir() {
        System.out.println("Dormindo");
    }
    
    public void getStatus() {
        System.out.println("Energia: " + Energia );
        System.out.println("Fome: " + Fome );
        System.out.println("Sono: " + Sono );

    }
    
    public void Cacar() {
        if (Energia < 2) {
            System.out.println("Não estou com fome");
        } else {
            System.out.println("Caçando");
            Energia -= 2;
            Fome += 1;
            Sono += 1;
        }
    }
    
    public void Comer() {
        if (Fome > 1) {
            System.out.println("Comendo");
            Fome = 0;
            Energia -= 1;
            Sono += 2;
        } else {
            System.out.println("Não estou com fome");
        }
    }
    
    public void Dormir() {
        if (Sono <= 3) {
            System.out.println("Dormindo...");
            Sono = 0;
            Energia += 2;
        } else {
            System.out.println("Não estou com fome");
        }
    }
    
}
