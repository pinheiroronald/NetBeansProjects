
package monitoramentobioclimatico;
import java.util.Scanner;

public class MonitoramentoBioclimatico {

 
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ver Relatorio co2 Digite[1]");
        int num = teclado.nextInt();
        
        
        
        switch(num){
            case 1:
              RelatorioClimatico.Rel_Co2();
            break;
            case 2:
              break;
            case 3:
              break;
            case 4:
               break;
        }
        
    }
    
}
