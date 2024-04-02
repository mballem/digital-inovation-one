import express from 'express';

const app = express();

app.listen(8080 , () => {
    let data = new Date();
    console.log('Servidor node iniciado em: ' + data);
});