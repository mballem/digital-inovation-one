import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Contato } from '../model/Contato';

@Injectable({
  providedIn: 'root'
})
export class ContatoService {

  private url: string = "http://localhost:3006/send";

  constructor(private http: HttpClient) { }

  sendMail(contato: Contato) {
    return this.http.post<string>(this.url, contato);
  }
}
