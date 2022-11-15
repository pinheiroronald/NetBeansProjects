/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minhaaplicaçao;

public class MinhaAplicaçao {

  
    public static void main(String[] args) {
        // TODO code application logic here
        double ale = Math.random();
         int n1 = (int)(1 + ale *(10-1));
         int res = n1 %2;
      if( res != 1){
          System.out.println(n1+" E um numero par");
      }else{
          System.out.println(n1+" E um numero impa");
      }
    }
    
}
