//Leia nome e sobrenome e apresente:
//	o nome completo;
//	o nome completo em letras maiúsculas;
//	a quantidade de caracteres.

import java.util.Scanner;
public class Main{
    public static void main(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = sc.nextLine();

        System.out.println("Digite seu sobrenome:");
        String sobrenome = sc.nextLine();
        
        System.out.println("Nome completo: " + nome + " " + sobrenome);
        System.out.println("Nome completo em letras maiúsculas:" + (nome +" " + sobrenome).toUpperCase());
        System.out.println("Quantidade de caracteres: " + (nome + sobrenome).length());
    }

}
