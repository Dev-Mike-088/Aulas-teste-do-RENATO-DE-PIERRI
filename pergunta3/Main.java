//Crie uma ficha contendo nome, curso e turma.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite o seu curso:");
        String curso = sc.nextLine();

        System.out.println("Digita a sua turma: ");
        String turma = sc.nextLine();

        System.out.println("=======Ficha do Aluno=======");
        System.out.println("Nome: " + nome);
        System.out.println("Curso: " + curso);
        System.out.println("Turma: " + turma);
    }
}
