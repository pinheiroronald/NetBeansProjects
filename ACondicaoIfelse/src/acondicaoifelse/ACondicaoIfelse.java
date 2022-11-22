
package acondicaoifelse;

public class ACondicaoIfelse {

    public static void main(String[] args) {
        // TODO code application logic here
        int n1 = 10;
        double n3 = 6.5e4d; 
        int n2 = (int) n3 +3;
        if(n1 >= n3){
            System.out.println("Número verdadeiro"+n1);
        }else if(n2 <= n3 + n1){
            System.out.println("fudeu aqui e maior"+n3);
            
        }else{
            System.out.println("Número falso"+n3);
        }
    }
    
}
