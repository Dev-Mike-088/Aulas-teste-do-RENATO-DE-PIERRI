// ContaBancaria: crie uma classe com titular, número e saldo. Implemente depositar(valor), sacar(valor) e mostrarSaldo(). Nesta versão, o saldo poderá ficar negativo.
import java.util.Scanner;

public class Main{
    public static void main(){
        Scanner sc = new Scanner(System.in);

        Conta conta = new Conta();
        int opcao = 0;

        System.out.print("Digite o nome do titular: ");
        conta.titular = sc.nextLine();
        System.out.println("Digite o número da conta: ");
        conta.numeroConta = sc.nextInt();
        System.out.println("Digite o saldo inicial: ");
        conta.saldo = sc.nextDouble();

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