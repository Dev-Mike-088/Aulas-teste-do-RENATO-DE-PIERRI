//Desafio: calcule o consumo médio de um veículo a partir da distância percorrida e da quantidade de combustível consumida. Apresente o resultado em km/l.
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a distância percorrida em km:");
        double distancia = sc.nextDouble();

        System.out.println("Digite a quantidade de combustível consumida em litros:");
        double combustivel = sc.nextDouble();

        double consumoMedio = distancia / combustivel;
        System.out.println("O consumo médio do veículo é: " + consumoMedio + " km/l");
    }
}
