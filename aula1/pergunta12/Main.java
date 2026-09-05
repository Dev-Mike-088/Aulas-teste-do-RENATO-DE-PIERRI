//Converta uma temperatura de Celsius para Fahrenheit utilizando a fórmula F = C * 9 / 5 + 32.
import java.util.Scanner;
public class Main{
    public static void main(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius:");
        double celsius = sc.nextDouble();
        double fahrenheit = celsius * 9/5 + 32;
        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit + "°F");
    }
}