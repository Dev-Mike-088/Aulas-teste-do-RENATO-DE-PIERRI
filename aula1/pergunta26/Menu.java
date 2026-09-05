//

import java.util.Scanner;

public class Menu{
    public void exibirMenu(Conta conta){
        int opcao = 0;
        Scanner sc = new Scanner(System.in);
        do{ 
            System.out.println("bem-vindo(a) " + conta.titular + "!");
            System.out.println("O que deseja fazer?");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Mostrar saldo");
            System.out.println("0 - Sair");
            opcao = sc.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor a ser depositado: ");
                    double deposito = sc.nextDouble();
                    conta.depositar(deposito);
                    System.out.println("Saldo atual: " + conta.mostrarSaldo());
                    break;
                case 2:
                    System.out.println("Digite o valor a ser sacado: ");
                    double saque = sc.nextDouble();
                    conta.sacar(saque);
                    System.out.println("Saldo atual: " + conta.mostrarSaldo());
                    break;
                case 3:
                    System.out.println("Saldo atual: " + conta.mostrarSaldo());
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