import express from 'express';

const app = express();

// Recurso para converter de Fahrenheit para Celsius
app.get('/fahrenheit-to-celsius/:fahrenheit', (req, res) => {
    const fahrenheit = parseFloat(req.params.fahrenheit);
    const celsius = (fahrenheit - 32) * 5/9;
    res.json({ fahrenheit, celsius });
});

app.listen(8080 , () => {
    let data = new Date();
    console.log('Servidor node iniciado em: ' + data);
});