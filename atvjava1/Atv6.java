//Faça um programa para ler 3 valores 
//(considere que não serão informados valores iguais) 
//e escrever o maior deles. 

import java.util.Scanner;

    public class Atv6 {
    public static void main(String[] args) {

      
      Scanner in = new Scanner( System.in );
      
      System.out.println("Informe o primeiro valor: ");

      int valor1 = in.nextInt();

       System.out.println("Informe o segundo valor: ");

      int valor2 = in.nextInt();

       System.out.println("Informe o terceiro valor: ");

      int valor3 = in.nextInt();

     
   
        if(valor1 > valor2 && valor1 > valor3){
           System.out.println("O maior valor informado é:" + valor1);
       }
            else if(valor1 == valor2 && valor1 == valor3){
         System.out.println("Você digitou números iguais, Informe o primeiro valor novamente:");

         }

        if(valor2 > valor1 && valor2 > valor3){
           System.out.println("O maior valor informado é:" + valor2);
       }
           else if(valor2 == valor1 && valor2 == valor3){
            System.out.println("Você digitou números iguais, Informe o segundo valor novamente:");

        }
        if(valor3 > valor2 && valor3 > valor1){
           System.out.println("O maior valor informado é:" + valor3);
       }
        else if(valor3 == valor2 && valor3 == valor1){
            System.out.println("Você digitou números iguais, Informe o terceiro valor novamente:");

        }
           





      }

    }
