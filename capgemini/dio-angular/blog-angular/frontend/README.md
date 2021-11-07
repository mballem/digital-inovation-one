# API Back-End Json-Server

*Base de dados* do back-end com [Json-Server](https://github.com/typicode/json-server)

- Port: 3000
- Database: banco.json

Execução do json-server:
```s
$ npm start
```
# API Backend API Email

API desenvolvida com Nodemailer e [Ethereal EMAIL](https://ethereal.email/).  
Ethereal é um serviço SMTP falso, voltado principalmente para usuários Nodemailer.

Execução da API de EMAIL:
```s
$ node senderMail
```
- Port: 3006
- URL de teste: ```http://localhost:3006/```
- URL de envio via formulário Angular: ```http://localhost:3006/send```

## Front-End

Projeto front-end desenvolvido com [Angular CLI](https://github.com/angular/angular-cli) version 13.0.1.

Após inicializar as API's back-ends execute `ng serve -o` para rodar a aplicação front-end. Navegação será via url `http://localhost:4200/`.
