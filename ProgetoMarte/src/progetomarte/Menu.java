package progetomarte;

import java.util.Scanner;

public class Menu {

    public void MostrarMenu() {
        System.out.println("Instituiçao: UNAMA");
        System.out.println("");
        System.out.println("-------------------------------------------------");
        System.out.println("----------------Progeto Marte--------------------");
        System.out.println("-------------------------------------------------");
        System.out.println("--------Relátorio CO2---------[1]----------------");
        System.out.println("--------Relátorio Temperatur--[2]----------------");
        System.out.println("--------Relátório Umidade-----[3]----------------");
        System.out.print("----------Digite Uma das opções a sima:");
        
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();

        switch (num) {
            case 1:
                SensorCo2 co2 = new SensorCo2();
                co2.RealatorioCo2();
                break;
            case 2:
                SensorTemp temp = new SensorTemp();
                temp.RealatorioTemp();
                break;
            case 3:
                SensorUmid umid = new SensorUmid();
                umid.RealatorioUmid();
                break;

        }

    }
}
