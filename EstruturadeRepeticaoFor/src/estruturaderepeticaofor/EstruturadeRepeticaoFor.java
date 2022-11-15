
package estruturaderepeticaofor;

public class EstruturadeRepeticaoFor {

    public static void main(String[] args) {
        // TODO code application logic here
        //Loping For
        double ale = Math.random();
        int nume =(int)(1 + ale *(10 - 1));
        System.out.println("Tabuada de "+ nume+".");
        System.out.println("------------------------");
        for(int i =0; i<= 10; i++){
            System.out.println(nume+" X "+i+" = "+i*nume);
                 
        }
    }
}
