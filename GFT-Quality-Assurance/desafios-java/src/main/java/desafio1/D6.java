package desafio1;

import java.util.Scanner;

public class D6 {
    public static void main(String[] args){

        //complete os espaços em branco com sua solução para o problema
        // 16 2 - 10 horas
        // 0 0 - 24 horas
        // 2 16 - 14 horas
        Scanner scan = new Scanner(System.in);
        int inicio, fim, horas;
        inicio = scan.nextInt();
        fim = scan.nextInt();
        horas = fim - inicio;

        if(horas == 0){
            System.out.print("O JOGO DUROU 24 HORA(S)\n");
        }else if(horas < 0){
            System.out.print("O JOGO DUROU " + ((24 - inicio) + fim) + " HORA(S)\n");
        }else if(horas > 24){
            System.out.print("O JOGO DUROU " + (inicio - fim) + " HORA(S)\n");
        }else{
            System.out.print("O JOGO DUROU " + horas + " HORA(S)\n");
        }
    }
}
