import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-vanlist',
  templateUrl: './vanlist.component.html',
  styleUrls: ['./vanlist.component.css']
})
export class VanlistComponent implements OnInit {

  van1;
  van2;
  van3;

  constructor() { }

  ngOnInit(): void {
    this.van1="Caravan";
    this.van2="Ventura";
    this.van3="Odyssey";
  }

}
