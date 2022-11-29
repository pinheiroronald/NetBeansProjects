
package analizeclima;


public class SensoresMd {
    
     public int rgs = 0; 
     
     double umi = Math.random();
     double temp=  Math.random(); 
     double co2 = Math.random();
     
     public int n1_umi =(int)(60 - umi*(60 -40));
     public int n2_temp = (int)(20 - temp*(19 - 24));
     public int n3_co2 = (int)( 600- co2 *(600 - 450));
     
    
     public int r_umid[] = new int [48];
     public int r_temp[]= new int [48];
     public int r_co2[] = new int [48];
     public String r_hora[]= new String[48]; 
      
  }
