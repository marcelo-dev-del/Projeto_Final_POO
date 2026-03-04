package samples.ada.contabancaria.tela;

import samples.ada.contabancaria.Banco;
import samples.ada.contabancaria.Conta;

import java.math.BigDecimal;
import java.util.Scanner;

public class TelaOperacaoDeposito implements TelaOperacao {

    @Override
    public void execute(Scanner scanner, Banco banco) {

        System.out.print("Numero da conta: ");
        String numeroConta = scanner.next();

        Conta conta = banco.agencias().getFirst().getConta(numeroConta);

        System.out.print("Valor do deposito: ");
        double valor = scanner.nextDouble();

        conta.depositar(valor);

        System.out.println("Deposito realizado com sucesso!");
    }
}