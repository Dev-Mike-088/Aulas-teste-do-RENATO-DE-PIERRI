// Círculo: crie uma classe com o atributo raio. Implemente calcularArea() e calcularCircunferencia() utilizando Math.PI.

import java.util.Scanner;
public class Main{
    public static void main(){
        Scanner sc = new Scanner(System.in);

        circulo c = new circulo();
        System.out.print("Digite o raio do círculo: ");
        c.raio = sc.nextDouble();

        System.out.println("Área do círculo: " + c.calcularArea());
        System.out.println("Circunferência do círculo: " + c.calcularCircunferencia());
    }
}