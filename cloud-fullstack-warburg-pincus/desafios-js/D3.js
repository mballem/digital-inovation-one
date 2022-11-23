/*
Desafio
Jorginho é professor do primário de uma determinada escola. 
Ele tem 100000 alunos e precisa criar um programa que verifica 
quantos espaços em branco e quantas vogais existem em uma determinada 
string de entrada que os alunos entregaram na avaliação final. 
Ajude-o a realizar essa tarefa antes que o tempo para entrega-la no fim do semestre acabe!

Entrada
A entrada será uma frase no formato de string. 

Saída
A saída deverá retornar quantos espaços em branco e quantas vogais existem na 
determinada string, conforme exemplo abaixo:

EXEMPLO DE ENTRADA              EXEMPLO DE SAÍDA    
 “Amo a DIO”                    Espacos em branco: 2 Vogais: 5 

 “Esse desafio foi facil”       Espacos em branco: 3 Vogais: 10 

 “Navegar nas aguas do teu mar” Espacos em branco: 5 Vogais: 11 
 */

let str = 'Esse desafio foi facil'; 
let strSplit = str.split('');

console.log(`Espacos em branco: ${contarEspacosEmBranco(str)} Vogais: ${contarVogais(str)}`);

function contarEspacosEmBranco(str) {
    let count = 0;
    for (s of str) {
        if (s === ' ') count++
    }
    return count;
}

function contarVogais(str) {
    let count = 0;
    str = str.toUpperCase();
    for (s of str) {
        if (s === 'A' || s === 'E' || s === 'I' || s === 'O' || s === 'U') 
            count++
    }
    return count;
}