/*
Desafio
O gerente de uma loja resolveu aplicar descontos em todos os seus produtos! 
A tarefa é calcular a Porcentagem de Desconto aplicada a esses produtos. 

Entrada
A entrada deverá ser feita por dois valores M e D, 
onde a primeira linha deverá receber o valor marcado do produto, 
e na segunda linha o valor do produto com o desconto já aplicado.

Saída
A saída deverá retornar o percentual de desconto que foi aplicado no produto, 
conforme exemplo abaixo.

Exemplo 1       Entrada	Saída
40
30	            O desconto foi de 25%
 

Exemplo 2       Entrada	Saída
500
195	            O desconto foi de 61%
 
Exemplo 3

Entrada	        Saída   
100
50	            O desconto foi de 50%
*/

const percentual = calcularPercentualDesconto(40, 30);
console.log(`O desconto foi de ${percentual}%`);

function calcularPercentualDesconto(valorSemDesc, valorComDesc) {
    const valorDoDesc = valorSemDesc - valorComDesc;
    return (valorDoDesc * 100) / valorSemDesc;
}