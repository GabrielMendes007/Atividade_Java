package Questao02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        String numeroConta = scanner.nextLine();

        System.out.print("Digite o nome do titular: ");
        String titular = scanner.nextLine();

        ContaBancaria conta = new ContaBancaria(numeroConta, titular);
        ContaBancaria contaDestino = new ContaBancaria("9999", "Conta Destino");

        int opcao;
        do {
            System.out.println("\n--- MENU BANCÁRIO ---");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Transferir");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    conta.consultarSaldo();
                    break;
                case 2:
                    System.out.print("Digite o valor para depósito: ");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                case 3:
                    System.out.print("Digite o valor para saque: ");
                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                case 4:
                    System.out.print("Digite o valor para transferência: ");
                    double valorTransferencia = scanner.nextDouble();
                    conta.transferir(contaDestino, valorTransferencia);
                    break;
                case 0:
                    System.out.println("Encerrando o sistema bancário. Obrigado!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}








