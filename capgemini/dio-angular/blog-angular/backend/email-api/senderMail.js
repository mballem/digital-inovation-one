const express = require('express');
const nodemailer = require('nodemailer');
const cors = require('cors');
const app = express();
const port = 3006;

app.use(express.json());
app.use((req, res, next) => {
	//Qual site tem permissão de realizar a conexão, no exemplo abaixo está o "*" indicando que qualquer site pode fazer a conexão
    res.header("Access-Control-Allow-Origin", "*");
	//Quais são os métodos que a conexão pode realizar na API
    res.header("Access-Control-Allow-Methods", 'GET, POST');
    app.use(cors());
    next();
});


app.get('/', (req, resp) => { 
    resp.send(`Email API is running...<br>Use 'POST' to <b>/send</b> to send a mail`)
});
/**
 * Send mail to https://ethereal.email/
 */
app.post('/send', (req, resp) => {

    console.log(req);

    // Generate SMTP service account from ethereal.email
    nodemailer.createTestAccount((err, account) => {
        if (err) {
            console.error('Failed to create a testing account. ' + err.message);
            return process.exit(1);
        }

        console.log('Credentials obtained, sending message...');

        // Create a SMTP transporter object
        let transporter = nodemailer.createTransport({
            host: account.smtp.host,
            port: account.smtp.port,
            secure: account.smtp.secure,
            auth: {
                user: account.user,
                pass: account.pass
            }
        });

        // Message object
        let message = {
            from: 'Sender Name <sender@example.com>',
            to: 'Recipient <recipient@example.com>',
            replayTo: req.body.email,
            subject: req.body.nome + ' entrou em contato!',
            text: req.body.mensagem
        };

        transporter.sendMail(message, (err, info) => {
            if (err) {
                console.log('Error occurred. ' + err.message);
                return process.exit(1);
            }

            console.log('Message sent: %s', info.messageId);
            // Preview only available when sending through an Ethereal account
            let urlEmail = nodemailer.getTestMessageUrl(info);
            console.log('Preview URL: %s', urlEmail);

            //send url to client
            resp.json(urlEmail);
        });
    });

});

app.listen(port, () => console.log(`Running on port ${port}`));

