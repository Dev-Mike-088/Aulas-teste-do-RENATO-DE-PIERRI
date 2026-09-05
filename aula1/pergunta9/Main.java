//Leia ou atribua dois números e apresente:
//	soma;
//	subtração;
//	multiplicação;
//	divisão;
//	resto da divisão.
import java.util.Scanner;
public class Main{
    public static void main(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double num1 = sc.nextDouble();

        System.out.println("Digite o segundo número:");
        double num2 = sc.nextDouble();

        double soma = num1 + num2;
        double subtracao = num1 - num2;
        double multiplicacao = num1 * num2;
        double divisao = num1 / num2;
        double restoDivisao = num1 % num2;

        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        if(num2 != 0){
            System.out.println("Divisão: " + divisao);
            System.out.println("Resto da divisão: " + restoDivisao);
        } else {
            System.out.println("Divisão por zero não é permitida.");
        }
    }
}
