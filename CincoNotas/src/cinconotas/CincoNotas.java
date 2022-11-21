/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cinconotas;

import java.util.Scanner;

/**
 *
 * @author pinhe
 */
public class CincoNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno:");
        String nome = teclado.nextLine();
        float res = 0;
        for(int i = 1; i<=5; i++){
            System.out.println("Digite a "+i+"º nota do aluno "+nome);
            float nota = teclado.nextFloat();
            res+= nota;
        }
       float notf = res/5;
        System.out.println("A media do aluno "+nome+" e:"+notf);
    }
    
}
