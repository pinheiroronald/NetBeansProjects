
package monitoramentobioclimatico;



public class Monitoramento {
    
    public void Resgistrar(){
        for(int i =0; i< 48; i++){
        SensoresClimaticos res = new SensoresClimaticos();
        res.umid[i] = res.n2_umid;
        res.co2[i] = res.n1_co2;
        res.temp[i]= res.n3_temp;
        //res.hora[i] = res.hora;
        }
    }
  public void M_relatorio(String undm, int aur[]){
       SensoresClimaticos res = new SensoresClimaticos();
     
        if(aur==res.co2){
         for(int i = aur.length; i > 48; i--){
         System.out.println(i+"Monoxi de carbono:"+aur[i]+""+undm);
           }
        }else if(aur == res.umid ){
          for(int i = 0; i< 48; i++){
          System.out.println("A Umidade relativa do ar "+aur[i]+""+undm);
           
           }
        }else if(aur == res.temp ){
        for(int i = 0; i< 48; i++){
        System.out.println("Temperatura ambiente:"+aur[i]+""+undm);
        }
        }
  }
  
}

    
