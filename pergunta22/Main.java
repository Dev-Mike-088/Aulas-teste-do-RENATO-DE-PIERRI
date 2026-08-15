//Aluno: crie uma classe com nome, primeira nota e segunda nota. Implemente calcularMedia() e mostrarDados(). Ainda não é necessário utilizar if.
import java.util.Scanner;
public class Main{
    public static void main(){
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();
        System.out.print("Digite o nome do aluno: ");
        aluno.nome = sc.nextLine();
        System.out.print("Digite a primeira nota: ");
        aluno.nota1 = sc.nextInt();
        System.out.print("Digite a segunda nota: ");
        aluno.nota2 = sc.nextInt();

        aluno.mostrarDados();
    }

}