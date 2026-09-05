//Leia nome e sobrenome e apresente as duas iniciais.
import java.util.Scanner;
public class Main{
    public static void main(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = sc.nextLine();

        System.out.println("Digite seu sobrenome:");
        String sobrenome = sc.nextLine();

        System.out.println("iniciais: " + nome.charAt(0) + " " + sobrenome.charAt(0));
    }
}