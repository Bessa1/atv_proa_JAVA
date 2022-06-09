//Escreva um programa em Java em que o usuário informe o seu
// nome e em seguida o programa perguntará a idade do usuário.
// Agora o programa deve exibir a mensagem "Olá, 
//[NomeDoUsuario], sua idade é [idade]".

import java.util.Scanner;

public class Atv3{
    public static void main(String[]args){

        Scanner in = new Scanner (System.in);

        System.out.println("Digite o seu nome:");

        String nome = in.next();

        System.out.println("Digite a sua idade:");

        int idade = in.nextInt();

        System.out.println("Ola, " + nome + " voce possui: " + idade + " anos");


    }
}