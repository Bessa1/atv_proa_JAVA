import java.util.Scanner;

//Escreva um programa em Java em que o usuário informe 
//o seu nome e exiba a mensagem "Olá, [NomeDoUsuario]".

public class Atv2{
public static void main(String[] args){

Scanner in = new Scanner (System.in);
System.out.println("Digite o seu nome:");
String nome = in.next();
System.out.println("Olá, "+ nome);


}


}