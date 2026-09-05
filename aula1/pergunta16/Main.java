//Leia nome, idade e curso pelo teclado e apresente os dados em uma ficha organizada.
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = sc.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite seu curso:");
        String curso = sc.nextLine();

        System.out.println("======Ficha do Aluno======");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Curso: " + curso);
    }
}