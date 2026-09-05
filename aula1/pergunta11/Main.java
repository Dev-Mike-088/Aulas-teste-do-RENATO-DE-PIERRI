//Calcule a área de um retângulo a partir da base e da altura.
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a base do retãngulo:");
        double base = sc.nextDouble();
        System.out.println("Digite a altura do retângulo:");
        double altura = sc.nextDouble();
        double area = base * altura;
        System.out.println("A área do retângulo é: " + area + "²");
    }
}    