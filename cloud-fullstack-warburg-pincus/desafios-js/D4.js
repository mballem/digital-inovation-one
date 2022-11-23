/*
Desafio
Geronimo acredita que perde muito tempo lembrando qual número do mês representa cada um deles. Ele precisa de um programa que mude os meses do ano do calendário do celular dele para facilitar e agilizar a leitura. Ajude-o e faça um programa que, com uma determinada entrada de uma data, retorne essa data com o mês escrito por extenso.

Entrada
As entradas serão datas em formato numeral. O dia ou mês que possuirem somente um digito, terão um 0 (zero) na frente.

Saida
As saídas serão as mesmas datas da entrada porém, 
com o mês escrito por extenso. O mês deve ter a primeira letra em maiúsculo.

  EXEMPLO DE ENTRADA   EXEMPLO DE SAÍDA 

  19/10/1997          19 de Outubro de 1997 

  25/12/2019          25 de Dezembro de 2019 

  02/02/2020          02 de Fevereiro de 2020 
*/
let data = '02/02/2020'
let dataSplit = data.split('/');

console.log(`${dataSplit[0]} de ${trocarMesPorEstenso(dataSplit[1])} de ${dataSplit[2]}`)

function trocarMesPorEstenso(mes) {
    if (mes === '01') return 'Janeiro'
    else if (mes === '02') return 'Fevereiro'
    else if (mes === '03') return 'Março'
    else if (mes === '04') return 'Abril'
    else if (mes === '05') return 'Maio'
    else if (mes === '06') return 'Junho'
    else if (mes === '07') return 'Julho'
    else if (mes === '08') return 'Agosto'
    else if (mes === '09') return 'Setembro'
    else if (mes === '10') return 'Outubro'
    else if (mes === '11') return 'Novembro'
    else return 'Dezembro'
}