package progetomarte;

import java.util.Scanner;

public class Menu {

    public void MostrarMenu() {
        System.out.println("Instituição: UNAMA");
        System.out.println("Curso:Sup. de Tec. em Análise e Des. de Sitemas");
        System.out.println("Disciplina:Programação Orintada a Objetos e ");
        System.out.println("Estrutrura de Dados");
        System.out.println("Professor:Mauricio da Mota Braga");
        System.out.println("Aluno:Ronald Pinheiro");
        System.out.println("Matricula04114895");
        System.out.println("-------------------------------------------------");
        System.out.println("----------------Projeto Marte--------------------");
        System.out.println("-------------------------------------------------");
        System.out.println("--------Relátorio CO2---------[1]----------------");
        System.out.println("--------Relátorio Temperatura--[2]----------------");
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
