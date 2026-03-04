package samples.ada.contabancaria.tela;

import samples.ada.contabancaria.Banco;
import samples.ada.contabancaria.Conta;

import java.util.Scanner;

public class TelaOperacaoFazerTransferencia implements TelaOperacao {

    @Override
    public void execute(Scanner scanner, Banco banco) {

        System.out.print("Conta origem: ");
        String origem = scanner.next();

        System.out.print("Conta destino: ");
        String destino = scanner.next();

        System.out.print("Valor da transferencia: ");
        double valor = scanner.nextDouble();

        try {
            Conta contaOrigem = banco.agencias().getFirst().getConta(origem);
            Conta contaDestino = banco.agencias().getFirst().getConta(destino);

            contaOrigem.transferir(valor, contaDestino);

            System.out.println("Transferencia realizada com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro na transferencia: " + e.getMessage());
        }
    }
}
