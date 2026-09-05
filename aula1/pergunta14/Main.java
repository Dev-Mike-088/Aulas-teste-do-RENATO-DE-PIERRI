// Dados o preço de um produto e o valor pago, calcule o troco.
import java.util.Scanner;

public class Main{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        double precoProduto = 129.00;
        
        System.out.println("O preço do produto é: " + precoProduto);
        System.out.println("Digite o valor que deseja pagar:");
        double valorPago = sc.nextDouble();
        
        double troco = valorPago - precoProduto;
        System.out.println("O troco é: " + troco);
    }
}