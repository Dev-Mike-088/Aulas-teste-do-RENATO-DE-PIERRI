//Lâmpada: crie uma classe com cor e estado ligada/desligada. Implemente ligar(), desligar() e mostrarEstado().

import java.util.Scanner;

public class Main{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        Lampada lampada = new Lampada();
        int opcao = 0;

        do{
            System.out.println("O que deseja fazer?");
            System.out.println("1 - Ligar a lâmpada");
            System.out.println("2 - Desligar a lâmpada");
            System.out.println("3 - Mostrar estado da lâmpada");
            System.out.println("0 - Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    lampada.ligar();
                    break;
                case 2:
                    lampada.desligar();
                    break;
                case 3:
                    lampada.mostrarEstado();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }while(opcao != 0);    

    }
}