package javaapplication7;
import java.util.Scanner;




/**
 *
 * @author profslpa
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner tcl = new Scanner(System.in);
       
       canhao ca = new canhao();
       
      Lutador nome = new Lutador();
      
      
      nome.setName("Henrique");
      nome.apresentar();
       
      
       
       
    
    }
    
}

 class canhao {
  
     
     
     
     public void Disparar() {
        bala Bala = new bala();
             
     }
     
     public Double getAlcanceMaximo(Double posicaoFinal) {
         return posicaoFinal;
     }
     
     
     public void setBala() {
         System.out.println("Bala nova inserida");
     }
     
   
     
    
}

class bala {
    Double posicaoX;
    Double posicaoY;
   
    

    public Double getPosicaoX() {
        return posicaoX;
    }

    public void setPosicaoX(Double posicaoX) {
        this.posicaoX = posicaoX;
    }

    public Double getPosicaoY() {
        return posicaoY;
    }

    public void setPosicaoY(Double posicaoY) {
        this.posicaoY = posicaoY;
    }
    
    
   
}