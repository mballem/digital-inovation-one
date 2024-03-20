// Definição da classe ItemMagico
class ItemMagico {
    //TODO: Crie adequadamente um construtor que receba todos os atributos referente ao item mágico:
      constructor(tipo, dano, resistencia) {
        this.tipo = tipo;        
        this.dano = dano;
        this.resistencia = resistencia;
      }
    
      calcularDano() {
        return this.tipo === 'arma' ? this.dano * 2 : this.dano;
      }
    }
    
    // Solicita ao usuário para digitar o tipo do item mágico, o dano no item e a resistência do item
    const tipoItem = 'Espada';
    const danoItem = parseInt('200');
    const resistenciaItem = parseInt('300');
    
    //TODO: Crie o de um objeto ItemMagico personalizado com base no tipo escolhido
    const itemPersonalizado = new ItemMagico(tipoItem, danoItem, resistenciaItem);

    // TODO: Imprima os atributos do item personalizado
    console.log("Tipo: " + itemPersonalizado.tipo);
    console.log("Dano: " + itemPersonalizado.dano);
    console.log("Resistencia: " + itemPersonalizado.resistencia);
    
    // Calcula e imprime o dano causado pelo item personalizado em um combate simulado
    const danoTotal = itemPersonalizado.calcularDano();
    console.log("Dano em combate: " + danoTotal);