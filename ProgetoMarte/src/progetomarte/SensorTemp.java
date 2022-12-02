
package progetomarte;

import java.util.Scanner;
public class SensorTemp {
     
     Hora h = new Hora();
    static int dado_temp[]= new int [48];
    
    public void Guardar_Temp(){
       
        for(int i =0; i < 48; i++){
        double nume = Math.random();
         int n_ale = (int)(25 + nume *(25 -21));
         dado_temp[i] = n_ale;
        }
    }
   public void RealatorioTemp(){
       System.out.println("--------------------------------------------------");
       System.out.println("");
       System.out.println("--------------Relatório Umidade-------------------");
        h.MostrarHora();
       for(int i = 0; i< 48; i++){
           System.out.println("[1 de Abril] As ["+h.hora[i]+"H:"+h.minut[i]+
                   "m] A temperatura ambiente era de ["+dado_temp[i]+"°C]");
       }
       System.out.println("---------------------<>---------------------------");
        System.out.println("-voltar ao menu pricipal--[1]");
    System.out.println("Desligar Sistema----------[2]");
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
   }
}
