import { Component, OnInit } from '@angular/core';
import { Contato } from '../model/Contato';
import { ContatoService } from '../service/contato.service';

@Component({
  selector: 'app-contato',
  templateUrl: './contato.component.html',
  styleUrls: ['./contato.component.css']
})
export class ContatoComponent implements OnInit {

  contato: Contato = new Contato;

  urlEmail: string = '';

  constructor(private contatoService: ContatoService) { }

  ngOnInit(): void {
  }

  enviarMensagem(): void {
    this.contatoService.sendMail(this.contato).subscribe({
      next: urlEmail => {
        this.urlEmail = urlEmail;
        this.contato = new Contato;
        //location.assign('/contato');
      }
    });
  }
  
}
