


package main;

   abstract class Animal{
        public abstract void SomAnimal();
        public void sleep(){
            System.out.println("zzzzz");
        }
        
    }
    class Pig extends Animal{
        public void SomAnimal(){
            System.out.println("O porco faz assi: we we we");
        }
    }

public class Main {
 

 public static void main(String[] args){
    
    Pig meuPig = new Pig();
    meuPig.SomAnimal();
    meuPig.sleep();
    
      
     
     
     }
    
}
