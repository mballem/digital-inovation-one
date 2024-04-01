function somar(a = 0, b = 0) {
    return a + b;
}

function subtrair(a = 0, b = 0) {
    return a - b;
}

function dividir(a = 0, b = 0) {
    if (b === 0) return "Erro! Divisão por zero...";
    return a / b;
}

function multiplicar(a = 0, b = 0) {
    return a * b;
}

let soma = somar(10, 5);
console.log(`A + B = ${soma}`)

let diferenca = subtrair(10, 5);
console.log(`A - B = ${diferenca}`)

let quociente = dividir(10, 5);
console.log(`A / B = ${quociente}`)

let produto = multiplicar(10, 5);
console.log(`A * B = ${produto}`)