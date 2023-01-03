import { Component, OnInit } from '@angular/core';
import { dataFake } from '../../data/dataFake';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  smallCards: any = []
  bigCard: any = []

  constructor() { }

  ngOnInit(): void {
    this.setBigCard(dataFake)
    this.setSmallCards(dataFake)
  }

  setBigCard(dados: any) {
    const artigo = {
      id : dados[0].id,
      photo : dados[0].photo,
      title : dados[0].title,
      date : dados[0].date,
      description : dados[0].description.substring(0, 140) + ' ...'
    }
    this.bigCard.push(artigo)
  }

  setSmallCards(dados: any) {
    for (let i = 0; i < dados.length; i++) {
      if (i > 0 && i <= 3) {
        const artigo = {
          id : dados[i].id,
          photo : dados[i].photo,
          title : dados[i].title,
          date : dados[i].date,
          description : dados[i].description.substring(0, 109) + '...'
        }
        this.smallCards.push(artigo)
      }
    }
  }

}
