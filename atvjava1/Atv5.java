
//Faça um programa que leia um valor informado pelo
// usuário e diga se o valor informado é positivo,
// negativo ou zero.

import java.util.Scanner;

 public class Atv5{
         public static void main(String[] args){

            Scanner in = new Scanner (System.in);

           System.out.println("Informe um valor:");

           int valor = in.nextInt();
           
        if(valor < 0){
 System.out.println("O valor negativo:");

        }
            
        else if (valor > 0){
 System.out.println("O valor é positivo:");

        }
            
        else{
 System.out.println("O valor é igual a zero");

        }

        }

    }