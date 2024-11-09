package Conta;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
//        ContaBancaria conta = new ContaBancaria();
//
//        conta.setNumeroConta(123);
//        conta.depositar(1600);
//        conta.titular = "João";
//
//        System.out.println("Número da Conta: " + conta.getNumeroConta());
//        System.out.println("Saldo: " + conta.getSaldo());
//        System.out.println("Titular: " + conta.titular);
//
//        conta.sacar(1700);
//        System.out.println("Novo Saldo: " + conta.getSaldo());
//
//        ContaCorrente contaCorrente = new ContaCorrente();
//        contaCorrente.depositar(200);
//        contaCorrente.cobrarTarifaMensal();
//        contaCorrente.getSaldo();
//        contaCorrente.sacar(150);
//        contaCorrente.getSaldo();

        ContaBancaria conta1 = new ContaBancaria(101, 1500.0);
        ContaBancaria conta2 = new ContaBancaria(102, 2500.0);
        ContaBancaria conta3 = new ContaBancaria(103, 1800.0);

        ArrayList<ContaBancaria> listaContas = new ArrayList<>();
        listaContas.add(conta1);
        listaContas.add(conta2);
        listaContas.add(conta3);

        ContaBancaria contaMaiorSaldo = listaContas.get(0);
        for (ContaBancaria conta : listaContas) {
            if (conta.getSaldo() > contaMaiorSaldo.getSaldo()) {
                contaMaiorSaldo = conta;
            }
        }

        System.out.println("Conta com o maior saldo - Número: " + contaMaiorSaldo.getNumeroConta() +
                ", Saldo: " + contaMaiorSaldo.getSaldo());
    }
}