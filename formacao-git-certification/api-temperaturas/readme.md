# Projeto Conversor de Temperaturas

## Descrição

Neste projeto, estaremos empregando o Express, um framework Node.js cujo principal propósito é facilitar o desenvolvimento de APIs. 

### Objetivo 1

Rodar o projeto na porta `127.0.0.0:8080` com uma mensagem mostrando que o servidor está em execução. 

### Objetivo 2

Adicionar um recurso para converter a temperatura de Fahrenheit para Celsius.

### Objetivo 3

Adicionar um recurso para converter a temperatura de Celsius para Fahrenheit.

## Execução

As dependências do projeto são gerenciadas pelo arquivo `package.json` e `package-lock.json`. 

Esses arquivos registram todas as dependências do projeto, incluindo suas versões exatas. Portanto, para reconstruí-lo a partir desses arquivos use o comando `npm install` após ter clonado o projeto para sua máquina local.

```bash
> npm install

> node index.js
```

### Recurso fahrenheit to celsius:

```json
// http://localhost:8080/fahrenheit-to-celsius/82
{
  "fahrenheit": 82,
  "celsius": 27.77777777777778
}
```

### Recurso celsius to fahrenheit:

```json
// http://localhost:8080/celsius-to-fahrenheit/32
{
  "celsius": 32,
  "fahrenheit": 89.6
}
```

