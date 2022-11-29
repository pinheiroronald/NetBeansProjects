
package tarefarepetida;



import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TarefaRepetida {
        public int i;
        public int nume = 10;
        public int guard[] = new int [4];
        public static void main(String[] args) {
        
        Timer timer = new Timer();
        final long Segundos = (1000 * 5);
        final long sec = (1000 * (60*1));
        Date min = new Date();
        String minuto = new SimpleDateFormat("HH:mm").format(min);;
     
        TimerTask tarefa = new TimerTask() {
            @Override
            public void run(){
                
               
                
              
              
               
            }
         
        };
       timer.schedule(tarefa, 0, Segundos);
       
    }
    
}
