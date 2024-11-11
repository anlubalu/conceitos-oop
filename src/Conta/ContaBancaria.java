package Conta;

import java.util.Comparator;

public class ContaBancaria implements Comparable<ContaBancaria> {
    private int numeroConta;
    protected double saldo = 0;
//    protected double saldo;
    public String titular;

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double quantia){
        if (quantia > 0) {
            saldo += quantia;
            System.out.println("Depósito realizado com sucesso. Saldo atual: " +saldo);
        } else {
            System.out.println("Valor deve ser maior do que zero!");
        }
    }

    public void sacar(double quantia){
        if (quantia <= 0) {
            System.out.println("Valor deve ser maior do que zero!");
        } else if (saldo >= quantia) {
            saldo -= quantia;
            System.out.println("Saque realizado com sucesso. Saldo atual: " +saldo);
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public ContaBancaria() {
    }

    public ContaBancaria(int numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    @Override
    public int compareTo(ContaBancaria outra) {
        if (this.getSaldo() < outra.getSaldo()) {
            return 1;
        } else if (this.getSaldo() > outra.getSaldo()) {
            return -1;
        } else {
            return 0;
        }
    }
}
