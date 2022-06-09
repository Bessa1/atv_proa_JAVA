//Faça um programa para ler 2 valores informados pelo usuário 
//e se o segundo valor informado for ZERO,
// deve ser lido um novo valor, ou seja,
// para o segundo valor não pode ser aceito o valor zero 
//nem negativo e imprimir o resultado da divisão do primeiro
// valor lido pelo segundo valor lido. 

import java.util.Scanner;

public class Atv8 {

    public static void main(String[] args) {

      Scanner in = new Scanner(System.in);

      int soma = 0;
      int divisao = 0;

      System.out.println("Informe o valor 1: ");
      int valor1 = in.nextInt();

      System.out.println("Informe o valor 2: ");
      int valor2 = in.nextInt();


      

        if(valor2 < 0){
            System.out.println("Informe um numero positivo:");
       }
       else if(valor2 == 0){
            System.out.println("Informe um valor maior que zero:");

       }
        else{
            divisao = valor1 / valor2;
             divisao = valor1 / valor2;
             System.out.println("A divisão dos valores informados é:" + divisao);
        }

        
        
        
        in.close();
      }

    }   