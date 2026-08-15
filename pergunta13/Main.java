//Converta uma quantidade total de segundos em horas, minutos e segundos restantes.
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o total de segundos:");
        int totalSegundos = sc.nextInt();

        int horas = totalSegundos / 3600;
        int minutos = (totalSegundos % 3600) / 60;
        int segundos = totalSegundos % 60;
        System.out.println("Horas: " + horas + ", Minutos: " + minutos + ", Segundos: " + segundos);
    }
}