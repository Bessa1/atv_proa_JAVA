import java.util.Scanner;

//Faça um programa que leia  3 valores (considere que não 
//serão informados valores iguais) e escrever a soma dos 2 maiores. 

public class Atv7{
public static void main(String[] args){

int soma = 0;

Scanner in = new Scanner(System.in);

System.out.println("Digite o primeiro valor: ");
int valor1 = in.nextInt();
System.out.println("Digiste o segundo valor: ");
int valor2 = in.nextInt();
System.out.println("Digite o terceiro valor: ");
int valor3 = in.nextInt();



if(valor1 < valor2 && valor1 < valor3){
    soma = valor2 + valor3;
    System.out.println("A soma dos maiores valores são: " + soma);

    
}
else if(valor2 < valor1 && valor2 < valor3){
    soma = valor1 + valor3;
     System.out.println("A soma dos maiores valores são: " + soma);
}
else{
    soma = valor1 + valor2;
     System.out.println("A soma dos maiores valores são: " + soma);
}

}


}
