// npm run start

console.log('TypeScript');

function soma(a: number, b: number) {
    return a + b;
}

console.log(soma(5, 2));

interface IAnimal {
    nome: string;
    tipo: 'terrestre' | 'aquatico';
    executarSom(alturaEmDecibeis: number);
}

interface IFelino extends IAnimal {
    visaoNoturna: boolean;
}

const animal: IAnimal = {
    nome: 'Elefante',
    tipo: 'terrestre',
    executarSom: (alturaEmDecibeis) => 3
}

console.log(animal);
console.log(animal.executarSom(2));

const felino: IFelino = {
    nome : 'Leão',
    tipo : 'terrestre',
    visaoNoturna : true,
    executarSom: (alturaEmDecibeis) => (5)
}

console.log(felino, 'som: ', felino.executarSom(4));



type Veiculo = {
    tipo: string,
    marca: string,
    modelo: string,
    ano: number
}

const veiculo: Veiculo = {
    tipo: 'Carro',
    marca: 'Fiat',
    modelo: 'Mille',
    ano: 2002
}
console.log(veiculo);

/////// 

const input = document.getElementById("input") as HTMLInputElement;

input.addEventListener('input', (event) => {
    const v = event.currentTarget as HTMLInputElement;
    console.log(v.value);
});

//////

function adicionaApendiceALista<Veiculo>(array: Veiculo, proprietario: string) {
    console.log('Veiculos do(a) ', proprietario, ':\n');
    for (const key in array) {
        if (Object.prototype.hasOwnProperty.call(array, key)) {
            const element = array[key];
            console.log(element);
        }
    }


}

let veiculos = [
    {tipo:'Carro', 'marca':'Chevrolet', 'modelo':'Monza', ano:1999},
    {tipo:'Carro', 'marca':'Fiat', 'modelo':'Siena', ano:2003},
    {tipo:'Moto', 'marca':'Honda', 'modelo':'CG 125', ano:2007}
];
adicionaApendiceALista(veiculos, "Beltrano");

//////

interface IUsuario {
    id: string;
    email: string;
}

interface IAdmin extends IUsuario {
    cargo: 'gerente' | 'coordenador' | 'supervisor';
}

function redirecione(usuario: IUsuario | IAdmin) {
    if ('cargo' in usuario) {
        console.log('redirecionar para área de administração');
        return;
    }
    console.log('redirecionar para a área de usuário');
}

const us1 : IAdmin = {
    id: '1598',
    email: 'beltrano@email.com',
    cargo: 'supervisor'
}
redirecione(us1);

const us2 : IUsuario = {
    id: '8508',
    email: 'fulano@email.com'
}
redirecione(us2);

////

interface IPiloto {
    id: string;
    email: string;
    titulo?: 'test driver' | 'piloto de corridas';
    // O ? torna a propriedade opcional
}

function titulacao(piloto: IPiloto) {
    if (piloto.titulo) {
        console.log('Sou um piloto profissional');
        return;
    }
    console.log('Sou apenas um motorista');
}

const p1 : IPiloto = {
    id: '23e45', email: 'juan@email.com', titulo: 'test driver';
}}
const p2 : IPiloto = {
    id: '23e45', email: 'juan@email.com';
}

titulacao(p1);
titulacao(p2);

//////

interface ICachorro {
    nome : string;
    idade : number;
    parqueFavorito?: string;
}

type CachorroSomenteLeitura = {
    readonly [K in keyof ICachorro]-? : ICachorro[K];
    // -? remove os valores opcionais
}

class MeuCachorro implements ICachorro {
    nome;
    idade;
    parqueFavorito;

    constructor(nome, idade) {
        this.nome = nome;
        this.idade = idade;
    }
}

const cao = new MeuCachorro('Digoo', 14);
console.log(cao);

//////

interface Pessoa {
    nome: string;
    idade: number;
    nacionalidade: 'Brasileiro' | 'Americano' | 'Japonês' | 'Russo' | 'Outrs';
}

interface Brasileiro extends Omit<Pessoa, 'nacionalidade'> {
  // Omit vai omitir o campo nacionalidade do obejto Brasileiro
}

const brasileira: Brasileiro = {
    idade : 18, nome : 'Brazuca'
}