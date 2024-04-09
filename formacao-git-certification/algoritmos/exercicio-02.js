class Retangulo {
    constructor(){}

    getArea(comprimento, largura) {
        return comprimento * largura;
    }

    getDiagnonal(comprimento, largura) {
        let diagonal = (comprimento ** 2) + (largura ** 2);
        return Math.sqrt(diagonal);
    }
}

const comprimento = 6;
const largura = 4;

let area = new Retangulo().getArea(comprimento, largura);
console.log(`A área do retangulo (${comprimento} x ${largura}) = ${area}`)

let diagonal = new Retangulo().getDiagnonal(comprimento, largura);
console.log(`A diagonal do retangulo (${comprimento} x ${largura}) = ${diagonal.toFixed(2)}`)