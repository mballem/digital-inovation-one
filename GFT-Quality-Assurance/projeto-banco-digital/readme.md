# Projeto Dio Bootcamp GFT QA
### Banco Digital em modo console
-- -
#### Melhorias:
1. Adicionada a classe Banco uma lista para armazenar as contas cadastradas
   
   1.1 Adicionado o método buscarConta que localiza na lista a conta por meio do numero da agência e numero da conta
   
   1.2 Adicionado método para retornar todas as contas da lista
2. Adicionado ao método sacar, da classe ContaImpl, um teste para verificar se há saldo suficiente para o saque.
3. Na classe de execução, CaixaEletronico, foram adicionados os métodos:
   
   3.1 `inicio() `apresenta ao usuário as opções de correntista e não correntista. Na primeira, é o cominho para criar novas contas. Na segunda, é cominho para realizar transações.

   3.2 `criarConta` método responsavel pela operação de abertura de conta corrente ou de poupança.

   3.3 `acessarConta` método pelo qual o usuário irá acessar a conta cadastrada. Caso a conta não exista, uma mensagem será exibida.

   3.4 `transacoes()` método responsavel pelas operações de saque, depósito, extrato e transferencia.

   3.5 `leitor()` método retorno o objeto Scanner para leitura de dados via teclado.

   3.6 `suspende()` método com uma pausa de 1seg para facilitar a leitura no console. Também tem uma operação para ir até a próxima operação apenas após clicar na tecla enter. 
