import express from 'express';

const app = express();

// Recurso para converter de Fahrenheit para Celsius
app.get('/fahrenheit-to-celsius/:fahrenheit', (req, res) => {
    const fahrenheit = parseFloat(req.params.fahrenheit);
    const celsius = (fahrenheit - 32) * 5/9;
    res.json({ fahrenheit, celsius });
});

// Recurso para converter de Celsius para Fahrenheit
app.get('/celsius-to-fahrenheit/:celsius', (req, res) => {
    const celsius = parseFloat(req.params.celsius);
    const fahrenheit = (celsius * 9/5) + 32;
    res.json({ celsius, fahrenheit });
});

app.listen(8080 , () => {
    let data = new Date();
    console.log('Servidor node iniciado em: ' + data);
});