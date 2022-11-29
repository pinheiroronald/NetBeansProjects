
package monitoramentobioclimatico;

import java.util.Scanner;
class MonitoramentoBioclimatico {
    
    
     
   public void Menu(int n){
      Monitoramento cha = new  Monitoramento();
      SensoresClimaticos vet = new SensoresClimaticos();
         do{
        switch(n){
            case 1:
               cha.M_relatorio("%", vet.umid);
            break;
            case 2:
               cha.M_relatorio("ppm", vet.co2);
              break;
            case 3:
              cha.M_relatorio("°C", vet.temp);
              break;
            case 4:
              break;
        }
        }
        while(n == 5);
     }
     
    public static void Main(String[] args) {
        MonitoramentoBioclimatico  main = new MonitoramentoBioclimatico();
        Monitoramento res = new Monitoramento();
        res.Resgistrar();
         
        System.out.println("Relátorio de Umidade Digite----[1]");
        System.out.println("Relátorio de CO2 Digite -------[2]");
        System.out.println("Relátório Temperatura Digite---[3]");
        
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();
        main.Menu(num);
        
           
         
        
          
           
           
               

       
        
     
   }
}
    
