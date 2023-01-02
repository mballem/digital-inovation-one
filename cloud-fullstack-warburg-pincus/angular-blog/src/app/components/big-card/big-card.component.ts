import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-big-card',
  templateUrl: './big-card.component.html',
  styleUrls: ['./big-card.component.css']
})
export class BigCardComponent implements OnInit {

  @Input()
  photoCover: string = ""

  @Input()
  cardTitle: string = ""

  @Input()
  cardDescription: string = "Mural Etnias no Rio de Janeiro Mural Etnias no Rio de Janeiro"

  @Input()
  cardDate: string = "Janeiro 11, 2021"

  constructor() { }

  ngOnInit(): void {
  }

}
