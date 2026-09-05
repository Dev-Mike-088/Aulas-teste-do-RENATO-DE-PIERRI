//Armazene três notas e calcule a média aritmética.
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        int nota1 = sc.nextInt();
        
        System.out.println("Digite a segunda nota:");
        int nota2 = sc.nextInt();
        
        System.out.println("Digite a terceira nota:");
        int nota3 = sc.nextInt();

        double media = (nota1 + nota2 + nota3) / 3.0;
        System.out.println("A média aritmética das notas é: " + media);
    }
}    