
package progetomarte;

public class Hora {
   public int min,hor,aux;
   public int hora[] =new int[48];
   public int minut[] =new int[48];
   public void MostrarHora(){
      for(int i = 0; i< 48; i++){
          
          if( aux == 2){
             hor +=1;
             aux = 0;
          }
          if(aux == 1){
              min =30;
          }
          hora[i] = hor;
          minut[i] = min;
          aux++;
          min =0;
      } 
   }
   
}
