package com.odair.banco;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Super Banco");
        Cliente odair = new Cliente("Odair","45678913");
        Conta cc = new ContaCorrente(odair);
        Conta cp = new ContaPoupanca(odair);

        banco.adicionarConta(cc);
        banco.adicionarConta(cp);
        banco.imprimirListaClientes();

        cc.depositar(1000000);
        cc.imprimirExtrato();
        cc.transferir(500000, cp);
        cc.imprimirExtrato();

        cp.imprimirExtrato();

    }
}