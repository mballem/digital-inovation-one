class Heroi {
  constructor(nome, idade) {
    this.nome = nome;
    this.idade = idade;
  }

  atacar() {
    console.log(`${this.nome}, não entrou em batalha.`);
  }
}

class Ninja extends Heroi {
  constructor(nome, idade) {
    super(nome, idade);
    this.tipo = "Ninja";
  }

  atacar() {
    console.log(`${this.nome}, o ${this.tipo}, atacou usando shuriken.`);
  }
}

class Monge extends Heroi {
  constructor(nome, idade) {
    super(nome, idade);
    this.tipo = "Monge";
  }

  atacar() {
    console.log(`${this.nome}, o ${this.tipo}, atacou usando artes marciais.`);
  }
}

class Guerreiro extends Heroi {
  constructor(nome, idade) {
    super(nome, idade);
    this.tipo = "Guerreiro";
  }

  atacar() {
    console.log(`${this.nome}, o ${this.tipo}, atacou usando espada.`);
  }
}

class Mago extends Heroi {
  constructor(nome, idade) {
    super(nome, idade);
    this.tipo = "Mago";
  }

  atacar() {
    console.log(`${this.nome}, o ${this.tipo}, atacou usando magia.`);
  }
}

const herois = [
  new Ninja("Maku Sotumiku", 35),
  new Monge("Chung Karma", 65),
  new Guerreiro("Sir Jeffrey", 27),
  new Mago("Eldric Brown", 85),
  new Heroi("Takusimi Miato", 105),
];

for (let heroi of herois) {
  heroi.atacar();
}
