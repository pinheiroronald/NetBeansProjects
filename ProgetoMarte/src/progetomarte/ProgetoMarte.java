
package progetomarte;


public class ProgetoMarte {
    public static void main(String[] args) {
        // TODO code application logic here1'''''
            SensorCo2 co2 = new SensorCo2();
            SensorUmid umid = new SensorUmid();
            SensorTemp temp = new SensorTemp();
            Menu menu = new Menu();
            co2.Guardar_Co2();
            umid.Guardar_Umid();
            temp.Guardar_Temp();
            menu.MostrarMenu();
  
    }
    
}
