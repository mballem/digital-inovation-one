package me.dio.gft.banco;

import me.dio.gft.banco.conta.Conta;
import me.dio.gft.banco.conta.ContaCorrente;
import me.dio.gft.banco.conta.ContaImpl;
import me.dio.gft.banco.conta.ContaPoupanca;

import java.util.Scanner;

public class CaixaEletronico {

    public static void main(String[] args) {
        new CaixaEletronico().inicio();
    }

    private void inicio() {
        Banco banco = new Banco("Banco Digital Dio");
        while (true) {
            System.out.printf("\t=========== %s ===========\t\n", banco.getNome());
            System.out.println("\tNao Correntista...1");
            System.out.println("\tCorrentista.......2");
            System.out.print("\tSelecione a opção desejada:___ ");
            int opcao = leitor().nextInt();
            switch (opcao) {
                case 1:
                    criarConta(banco);
                    break;
                case 2:
                    acessarConta(banco);
                    break;
                default:
                    System.out.println("\n\tSistema encerrado!");
                    System.exit(1);
            }
        }
    }

    private void criarConta(Banco banco) {
        System.out.println(" ");
        System.out.println("\t=========== Abertura de Conta ===========");
        System.out.println("\tAbrir conta corrente...1");
        System.out.println("\tAbrir conta poupanca...2");
        System.out.println("\tVoltar.................0");
        System.out.print("\tDigite a operação desejada:___ ");
        int opcao = leitor().nextInt();

        ContaImpl conta;
        if (opcao == 1) {
            conta = new ContaCorrente();
        } else if (opcao == 2) {
            conta = new ContaPoupanca();
        } else {
            return;
        }
        banco.getContas().add(conta);

        System.out.println(" ");
        System.out.println("\tConta criada com sucesso");
        System.out.printf("\tAgencia: %d%n", conta.getAgencia());
        System.out.printf("\tConta: %d%n", conta.getNumero());

        suspende();
    }

    private void acessarConta(Banco banco) {
        System.out.println(" ");
        System.out.println("\t=========== Acessar Conta ===========");

        System.out.print("\tDigite o numero da agencia:___ ");
        int agencia = leitor().nextInt();

        System.out.print("\tDigite o numero da conta..:___ ");
        int numero = leitor().nextInt();

        System.out.println("");
        System.out.println("\tAguarde...");

        Conta conta = banco.buscarConta(agencia, numero);

        if (conta == null) System.out.println("\n\t> Conta inexistente, tente novamente! <\n");
        else transacoes(banco, conta);
    }

    private void transacoes(Banco banco, Conta conta) {
        System.out.println(" ");
        System.out.println("\t========= Bem vindo a sua conta =========");

        int opcao;
        do {
            System.out.println(" ");
            System.out.println("\tDeposito........1");
            System.out.println("\tSaque...........2");
            System.out.println("\tTransferencia...3");
            System.out.println("\tExtrato.........4");
            System.out.println("\tSair............0");

            System.out.print("\tSelecione a operação desejada:___ ");
            opcao = leitor().nextInt();

            System.out.println(" ");
            if (opcao == 1) {
                System.out.print("\tDigite o valor da operacao R$: ");
                double valor = leitor().nextDouble();
                conta.deposito(valor);
            } else if (opcao == 2) {
                System.out.print("\tDigite o valor da operacao R$: ");
                double valor = leitor().nextDouble();
                conta.sacar(valor);
            } else if (opcao == 3) {
                System.out.print("\tDigite a agencia da conta destino: ");
                int agDest = leitor().nextInt();

                System.out.print("\tDigite o numero da conta destino: ");
                int numDest = leitor().nextInt();

                System.out.print("\tDigite o valor da transferencia: ");
                double valor = leitor().nextDouble();

                Conta contaDestino = banco.buscarConta(agDest, numDest);

                if (contaDestino == null) System.out.println("\n\t> Conta inexistente, tente novamente! <\n");
                else conta.transferencia(valor, contaDestino);
            } else if (opcao == 4) {
                conta.extrato();
            }

            suspende();

        } while (opcao != 0);
    }

    private Scanner leitor() {
        return new Scanner(System.in);
    }

    private void suspende() {
        try {
            Thread.sleep(1000);
            System.out.println("\n\tTecle <enter>");
            leitor().nextLine();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
