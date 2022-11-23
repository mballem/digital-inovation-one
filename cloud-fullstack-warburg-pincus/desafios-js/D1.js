/**
 * Desafio
Faça um Programa que leia cinco números inteiros e armazene-os em um vetor chamado VETOR. 
Armazene os números pares no vetor PAR e os números ímpares no vetor IMPAR. 

Entrada 
Peça ao usuário que insira o valor de cinco números inteiros. 

Saída
Imprima os valores dos três vetores um em cada linha mostrando na primeira linha, 
os valores no Vetor, na segunda linha os valores Par(es) e na terceira linha os 
valores ímpares Impar(es). Conforme o exemplo a baixo.  

ENTRADA 

3
4
6
9
10

SAÍDA 

Vetor: 3,4,6,9,10
Par(es): 4,6,10
Impar(es): 3,9
 */
const gets = [3,4,6,9,10]

let vetor = [];
let pares = [];
let impares = [];

for (let i = 0; i < 5; i++) {
    const valor = gets[i];
    vetor[i] = valor;
    if (valor % 2 === 0) pares[i] = valor;
    else impares[i] = valor;
}

console.log('Vetor: ' + vetor)
console.log('Par(es): ' + pares.filter(e => e != null))
console.log('Impar(es): ' + impares.filter(e => e != null))


