function soma(n1, n2) {
    return n1 + n2;
}
console.log(soma(10, 5));

function setReplace(frase, nome, sobrenome) {
    return frase.replace(nome, sobrenome);
}
var frase = "Olá [nome] [sobrenome], como vai?"
console.log(frase);

var nome = prompt("Digite um nome");
frase = setReplace(frase, "[nome]", nome)
console.log(frase);

var sobrenome = prompt("Digite um sobrenome");
frase = setReplace(frase, "[sobrenome]", sobrenome);
console.log(frase);




