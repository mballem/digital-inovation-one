let totalDeDias = parseInt(400);

let anos = parseInt(totalDeDias / 365);
let meses = parseInt((totalDeDias % 365) / 30);
let dias = parseInt((totalDeDias % 365) % 30);

console.log(anos + " ano(s)");
console.log(meses + " mes(es)");
console.log(dias + " dia(s)");

console.log((totalDeDias % 365) /30)