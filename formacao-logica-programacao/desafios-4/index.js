// Entrada de dados. Lembre-se: O parseInt(()) é importante para a conversão dos valores de entrada(String) para um valor numérico(int).
const totalSalas = parseInt("3");
//Aqui temos uma demonstração de array com valores já predefinidos:
const salasComTesouro = [2, 4, 7];
const salasComMonstro = [3, 6, 8];

//Aqui temos uma forma de loop para percorrer cada sala da masmorra:
for (let sala = 1; sala <= totalSalas; sala++) {
    //Utilizamos o .includes() para verificar se um número está presente nos arrays:
    const temTesouro = salasComTesouro.includes(sala);
    const temMonstro = salasComMonstro.includes(sala);

    //TODO: Agora implemente uma condição necessária para verificar e exibir se há tesouro na sala e se há montro na sala:
    if ( temTesouro ) {
        console.log("Tesouro na sala " + sala + "!");
    } else if ( temMonstro ) {
        console.log("Monstro na sala " + sala + "!");
    }
}