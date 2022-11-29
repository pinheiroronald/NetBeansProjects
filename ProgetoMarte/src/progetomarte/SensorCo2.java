
package progetomarte;

import java.util.Scanner;


public class SensorCo2{
Hora h = new Hora();   

static int dado_co2[]= new int [48];
    
    public void Guardar_Co2(){
        
        for(int i =0; i < 48; i++){
        double nume = Math.random();
         int n_ale = (int)(400 + nume *(600-200));
         dado_co2[i] = n_ale;
        }
    }
   public void RealatorioCo2(){
       h.MostrarHora();
       for(int i = 0; i < 48; i++){
           System.out.println("[1 de Abril] As ["+h.hora[i]+"H:"+h.minut[i]+
                   "m] os níveis de co2 eram["+dado_co2[i]+"ppm]");
       }
    System.out.println("-voltar ao menu pricipal--[1]");
    System.out.println("Desligar o Sistema----------[2]");
    Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
      
      switch(num){
          case 1:
              Menu menu = new Menu();
              menu.MostrarMenu();
              break;
        case 2:
            System.out.println("THE AND");
            break;
     
            
   }
     
           
}}