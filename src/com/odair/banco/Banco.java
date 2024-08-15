package com.odair.banco;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Getter
public class Banco {
    private String nome;
    private List<Conta> contaList;

    public Banco(String nome) {
        this.nome = nome;
        this.contaList = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        this.contaList.add(conta);
    }

    public void imprimirListaClientes() {
        System.out.println("==== LISTA DE CLIENTES ====");
        for (Conta conta : contaList) {
            System.out.println(String.format("Titular: %s", conta.getCliente().getNome()));
            System.out.println(String.format("Tipo da conta: %s", conta.getClass().getSimpleName()));
            System.out.println(String.format("Agencia: %d", conta.getAgencia()));
            System.out.println(String.format("Conta numero: %d", conta.getNumero()));
            System.out.println("= = = = = = = = = = = = = = = = = =");
        }
    }


}
