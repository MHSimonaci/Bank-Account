package util;

public class Conta {
    private double saldo;
    private String titular;

    public  Conta(double saldoInicial, String titular) {
        this.saldo = saldoInicial;
        this.titular = titular;
    }
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado!");
        } else {
            System.out.println("Valor inválido!");
        }
    }
    public void sacar(double valor) {
        if (valor <= saldo && valor > 0) {
            saldo -= valor;
            System.out.println("Saque realizado!");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido!");
        }
    }
    public double getSaldo() {
        return saldo;
    }
    public String getTitular() {
        return titular;
    }
}
