let lines = [0,0,7,8];
const a = Number(lines.shift());
const b = Number(lines.shift());
const c = Number(lines.shift());
const d = Number(lines.shift());

const prodAB = a * b;
const prodCD = c * d;

const dif = prodAB - prodCD;

const mensagem = 'DIFERENCA = ' + dif ;
//const mensagem = 'DIFERENCA' = ${   };
console.log(   mensagem      );