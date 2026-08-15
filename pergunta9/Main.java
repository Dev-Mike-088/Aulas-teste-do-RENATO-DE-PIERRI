//Leia ou atribua dois números e apresente:
//	soma;
//	subtração;
//	multiplicação;
//	divisão;
//	resto da divisão.
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Escolha o que deseja fazer com os números:\n1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n5 - Resto da divisão\nDigite o número da opção desejada: ");
        int opcao = sc.nextInt();
        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt(); 

        switch(opcao){
            case 1:
                System.out.println("O resultado da soma é: " + (num1 + num2));
                break;
            case 2:
                System.out.println("O resultado da subtração é: " + (num1 - num2));
                break;
            case 3:
                System.out.println("O resultado da multiplicação é: " + (num1 * num2));
                break;
            case 4:
                if(num2 != 0){
                    System.out.println("O resultado da divisão é: " + (num1 / num2));
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;
            case 5:
                if(num2 != 0){
                    System.out.println("O resultado do resto dessa divisão é: " + (num1 / num2));
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }    
                break;
            default:
                System.out.println("Opção inválida.");            
        }
    }
}
