//Desafio - independência de objetos: crie duas contas bancárias, realize operações diferentes em cada uma e demonstre que cada objeto mantém seu próprio saldo.

import java.util.Scanner;

public class Main{
    public static void main(){
        Scanner sc = new Scanner(System.in);

        Conta conta1 = new Conta();
        Conta conta2 = new Conta();
        int option = 0;
        int cont = 0;

        System.out.print("Digite o nome do titular da conta 1: ");
        conta1.titular = sc.nextLine();
        System.out.print("Digite o número da conta 1: ");
        conta1.numeroConta = sc.nextInt();
        System.out.print("Digite o saldo inicial da conta 1: ");
        conta1.saldo = sc.nextDouble();
        sc.nextLine(); // Consumir a quebra de linha pendente
        System.out.print("Digite o nome do titular da conta 2: ");
        conta2.titular = sc.nextLine();
        System.out.print("Digite o número da conta 2: ");
        conta2.numeroConta = sc.nextInt();
        System.out.print("Digite o saldo inicial da conta 2: ");
        conta2.saldo = sc.nextDouble();

        do{
            System.out.println("O que deseja fazer?");
            System.out.println("1 - Operar na conta 1");
            System.out.println("2 - Operar na conta 2");
            System.out.println("0 - Sair");
            option = sc.nextInt();
            
            switch (option) {
                case 1:
                    cont = 1;
                    break;
                case 2:
                    cont = 2;
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    break;
            }
    
        } while(option != 0);

        if(cont == 1){
            Menu menu = new Menu();
            menu.exibirMenu(conta1);
        } else if(cont == 2){
            Menu menu = new Menu();
            menu.exibirMenu(conta2);
        }
    }
}