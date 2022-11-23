/**
 * Desafio
Faça um Programa que peça ao usuário que insira o valor, 
em seguida deverá ser mostrado se o número é classificado como INTEIRO ou DECIMAL. 

Entrada 
A entrada consiste em um valor númerico, inteiro ou decimal.

Saída
A saída verá mostrar se o valor é inteiro ou decimal, conforme exemplo abaixo:

Exemplo 1

Entrada	|   Saída
0,5	    |   Decimal

Exemplo 2

Entrada	| Saída
1       | Inteiro
 */
const valor = '15,85'

const temp = valor.indexOf(',');

if (temp === -1) {
    console.log('Inteiro')
} else {
    console.log('Decimal')
}

