package Questao02;

public class ContaBancaria {
    private String numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria(String numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void consultarSaldo() {
        System.out.printf("Saldo atual da conta %s (%s): R$ %.2f\n", numeroConta, titular, saldo);
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.printf("Depósito de R$ %.2f realizado com sucesso!\n", valor);
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado com sucesso!\n", valor);
        } else {
            System.out.println("Saque não realizado. Verifique o valor e o saldo disponível.");
        }
    }

    public void transferir(ContaBancaria destino, double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            destino.depositar(valor);
            System.out.printf("Transferência de R$ %.2f para %s realizada com sucesso!\n", valor, destino.titular);
        } else {
            System.out.println("Transferência não realizada. Verifique o valor e o saldo disponível.");
        }
    }
}

