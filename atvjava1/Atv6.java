import java.util.Scanner;

//Faça um programa para ler 3 valores (considere que não 
//serão informados valores iguais) e escrever o maior deles. 


public class Atv6{
public static void main(String[] args){

 Scanner in = new Scanner (System.in);
 System.out.println("Digite o primeiro valor");
 int valor1 = in.nextInt();
  System.out.println("Digite o segundo valor");
 int valor2 = in.nextInt();
  System.out.println("Digite o terceiro valor");
 int valor3 = in.nextInt();
 

 if(valor1 == valor2 && valor1 == valor3){
       System.out.println("Digite valores que não sejam iguais");

  } else if (valor2 > valor1 && valor2 > valor3){
        System.out.println("O maior o valor é:  " + valor2);

  } else if (valor3 > valor1 && valor3 > valor2){
        System.out.println("O maior o valor é:  " + valor3);

  } else{
        System.out.println("O maior o valor é:  " + valor1);
    }




 }

 }
