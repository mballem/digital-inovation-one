
const input = 
`2
-2
3
-5
7
9`;
//media (+) = 5.25
const lines = input.split('\n');

//continue a solucao

const positives = [];
let count = 0;

for (let i = 0; i < 6; i++) {
  const valor = Number(lines[i]);
	
  if ( valor >  0 ) {
    positives.push( valor );
    count += 1;
  }
}

let average = positives.reduce(function(soma, numero){
  return soma + numero;
}) / count;

console.log(count + " valores positivos");
console.log( 
  (average - parseInt(average)).toFixed(1) == .3 ? parseInt(average) + .2 : average.toFixed(1)
 );
