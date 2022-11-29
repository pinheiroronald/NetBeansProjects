
package monitoramentobioclimatico;


 public class SensoresClimaticos {
    double s_umid = Math.random();
    int n2_umid =(int) (26 + s_umid*(58 - 26));

    double s_temp = Math.random();
    int n3_temp =(int)(25 + s_temp*(25 - 21));

    double s_co2 = Math.random();
    int n1_co2 = (int)(400 + s_co2 *(500-400));

    public int co2 [] = new int [48];
    public int umid [] = new int [48];
    public int temp []= new int [48];
    public String R_hora[] = new String[48];
 }
 
