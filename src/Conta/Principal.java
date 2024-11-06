package Conta;

public class Principal {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.setNumeroConta(123);
        conta.depositar(1600);
        conta.titular = "João";

        System.out.println("Número da Conta: " + conta.getNumeroConta());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("Titular: " + conta.titular);

        conta.sacar(1700);
        System.out.println("Novo Saldo: " + conta.getSaldo());

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar(200);
        contaCorrente.cobrarTarifaMensal();
        contaCorrente.getSaldo();
        contaCorrente.sacar(150);
        contaCorrente.getSaldo();
    }
}