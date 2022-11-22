/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testemetodoswitce;

public class TesteMetodoswitce {

   public static void mostrar(int n1,int n2, int opt){
       int res;
       switch(opt){
           
        case 1:
        res = n1 + n2;
        System.out.println("Oresultado de"+n1+" + "+n2+" = "+res);
           break;
        case 2:
        res = n1 * n2;
        System.out.println("Oresultado de"+n1+" x "+n2+" = "+res);
           break;
        case 3:
         res = n1 / n2;
          System.out.println(" Oresultado de"+n1+" / "+n2+" = "+res);
           break;
        case 4:
            res = n1 - n2;
             System.out.println("oresultado de"+n1+"+"+n2+" = "+res);
           break; 
          
                
       }
   }
    public static void main(String[] args) {
        // TODO code application logic here
        mostrar( 67, 23, 3);
    }
    
}
