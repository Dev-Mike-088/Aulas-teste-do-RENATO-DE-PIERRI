//Leia uma palavra e apresente:
//	seu tamanho;
//	o primeiro caractere;
//	o último caractere.

import java.util.Scanner;
public class Main{
    public static void main(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra:");
        String palavra = sc.nextLine();

        System.out.println("Tamnaho da palavra: " + palavra.length());
        System.out.println("Primeiro caractere: " + palavra.charAt(0));
        System.out.println("Último caractere: " + palavra.charAt(palavra.length() - 1));
    }
}