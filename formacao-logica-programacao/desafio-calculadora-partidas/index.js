const herois = [
  { nome: "Rocket Man", vitorias: 10, derrotas: 3 },
  { nome: "Lady Pink", vitorias: 40, derrotas: 23 },
  { nome: "Kick Master", vitorias: 181, derrotas: 23 },
  { nome: "Bullet Grey", vitorias: 109, derrotas: 18 },
  { nome: "Atomic Candy", vitorias: 10, derrotas: 3 },
];

function calcular(vitorias, derrotas) {
  return vitorias - derrotas;
};

function getNivel(saldoVitorias) {
  let nivel;
  if (saldoVitorias <= 10) nivel = "Ferro";
  else if (saldoVitorias >= 11 && saldoVitorias <= 20) nivel = "Bronze";
  else if (saldoVitorias >= 21 && saldoVitorias <= 50) nivel = "Prata";
  else if (saldoVitorias >= 51 && saldoVitorias <= 80) nivel = "Ouro";
  else if (saldoVitorias >= 81 && saldoVitorias <= 90) nivel = "Diamante";
  else if (saldoVitorias >= 91 && saldoVitorias <= 100) nivel = "Lendário";
  else nivel = "Imortal";

  return nivel;
};

function main() {
    for (let h of herois) {
        const v = h.vitorias;
        const d = h.derrotas;
        const nome = h.nome;

        let saldoVitorias = calcular(v, d);
        let nivel = getNivel(saldoVitorias);         
        console.log(
            `${nome} tem de saldo de ${saldoVitorias} está no nível de ${nivel}`
        ); 
    }     
}

main();
