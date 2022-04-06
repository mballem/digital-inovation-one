var nome = "José Beltrano";
var idade = 30;

//alert("Bem vindo " + nome + ", você tem " + idade + " anos.");

console.log("Bem vindo " + nome + ", você tem " + idade + " anos.");

var sobrenome = "Fulano";
console.log(nome.replace("Beltrano", "Ciclano"));
console.log(nome.toUpperCase());
console.log(nome.toLowerCase());

var n1 = 10;
var n2 = 5;
console.log(n1 * n2);

var n3 = "10";
var n4 = "5";
console.log(n3 * n4);

var s1 = 10;
var s2 = 5;
console.log(s2 + s2);

var s3 = "10";
var s4 = "5";
console.log(s3 + s4);

var frutas = ["maça", "pera", "banana"];
console.log(frutas);
console.log("size:", frutas.length);
console.log(frutas[1]);

// adiciona um novo elemento na última posição
frutas.push("uva");
console.log(frutas);

// remove o último elemento
frutas.pop();
console.log(frutas);

// imprime ao contrário
console.log(frutas.reverse());

// imprime a lista como uma única string
console.log(frutas.toString());

// primeiro elemento da lista
console.log(frutas[0]);
// primeiro elemento da string
console.log(frutas.toString()[0])

// imprime uma string separando os itens por um traço
console.log(frutas.join(" - "));

var carro = {
    nome:"Ford", 
    cor: "Vermelha"
};
console.log(carro.nome);
console.log(carro.cor);

var carros = [
    {nome:"Ford", cor: "Vermelha"},
    {nome:"GM", cor: "Azul"},
    {nome:"Fiat", cor: "Preta"},
    {nome:"Honda", cor: "Branca"}
];
console.log(carros);
console.log(carros[0]);
console.log(carros[0].nome);
console.log(carros[0].cor);

// abre janela com campo de entrada de dados
var idade = prompt("Qual sua idade?");
if (idade >= 18) {
    console.log("maior de idade");
} else {
    console.log("menor de idade");
}

var count = 0;
while (count < 5) {
    console.log(count);
    count++;
}

for (i = 0; i < 5; i++) {
    console.log(i);
}

var d = new Date();
console.log(d);
console.log(d.getMonth() + 1); // mês Jan vale 0
console.log(d.getDay()); 
console.log(d.getFullYear()); 