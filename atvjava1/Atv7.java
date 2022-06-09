//Faça um programa que leia  3 valores 
//(considere que não serão informados valores iguais)
// e escrever a soma dos 2 maiores. 

import java.util.Scanner;

    public class Atv7 {
    public static void main(String[] args) {

     int soma = 0; 
      Scanner in = new Scanner( System.in );
      
      System.out.println("Informe o valor 1: ");
      int valor1 = in.nextInt();

      System.out.println("Informe o valor 2: ");
      int valor2 = in.nextInt();

      System.out.println("Informe o valor 3: ");
      int valor3 = in.nextInt();

       
        if(valor1 < valor2 && valor1 < valor3){
             soma = valor2 + valor3;
           System.out.println("A soma dos maiores valores é:" + soma);
          
       }
        if(valor2 < valor1 && valor2 > valor3){
             soma = valor1 + valor3;
           System.out.println("A soma dos maiores valores é:" + soma);
          
       }

        if(valor3 < valor2 && valor3 > valor1){
             soma = valor1 + valor2;
           System.out.println("A soma dos maiores valores é: " + soma);
          
       }

        if(valor1 == valor2 && valor1 == valor3){
           System.out.println("Você digitou números iguais,Informe o primeiro valor novamente:");
       }
        if(valor2 == valor1 && valor2 == valor3){
           System.out.println("Você digitou números iguais, Informe o segundo valor novamente:");
       }

        if(valor3 == valor2 && valor3 == valor1){
           System.out.println("Você digitou números iguais, Informe o terceiro valor novamente:");
       }

        
      }

    }