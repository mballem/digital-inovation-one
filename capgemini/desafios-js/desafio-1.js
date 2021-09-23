// saida esperada na soma: -29
// saida esperada na media: -1

const isSum = gets() === "S";

const xL = 12, yL = 12;

let sum = 0.0, av = 0.0;

let linha = gets();

if (linha.length >= 12 ) {
  for (let x = 0; x < xL; x++) {
    
    let numeros = linha != null ? linha.replace(/\s+/g, ' ').trim().split(' ') : gets().replace(/\s+/g, ' ').trim().split(' ');
    linha = null;

    for (let y = 0; y < yL; y++) {
      
      if (x > y && x > (12 - y - 1)) {
        const valor = Number(numeros[y]);
        sum += valor;
        ++av;
      }
    }
  }
} else {
  for (let x = 0; x < xL; x++) {
    for (let y = 0; y < yL; y++) {
      
      const valor = linha != null ? Number(linha) : Number(gets());
      linha = null;
      
      if (x > y && x > (12 - y - 1)) {
        sum += valor;
        ++av;
      }
    }
  }
}

console.log((sum / (isSum ? 1 : av)).toFixed(1));
