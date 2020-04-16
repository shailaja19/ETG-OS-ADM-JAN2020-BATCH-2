import { Component, OnInit } from '@angular/core';
import {Hero} from '../hero';
import{product} from '../product';

@Component({
  selector: 'app-ng-for-example',
  templateUrl: './ng-for-example.component.html',
  styleUrls: ['./ng-for-example.component.css']
})
export class NgForExampleComponent implements OnInit {

 // heros = ['Rajakumar', 'Amitab','Rajni', 'Chiru'];
    resources=[
        new Hero(1,'Rajakumar'),
        new Hero(2,'Amitab'),
        new Hero(3,'Rajni'),
        new Hero(4,'Chiru')


    ]

    //pro = ['Cylinder', 'Regulator','Lighter', 'Stove'];
    pro=[
      new product(1,'Stove',1000, 'assets/images/stove.jpg'),
      new product(2,'Cylinder',100,'assets/images/download.jpg'),
      new product(3,'Lighter',50,'assets/images/lighter.jpg'),
      new product(4,'Regulator',800,'assets/images/regulator.jpg')


  ]

  constructor() { }

  ngOnInit(): void {
  }

}
