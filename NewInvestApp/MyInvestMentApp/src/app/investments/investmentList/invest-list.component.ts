import { Component, OnInit } from '@angular/core';
import { Investment } from '../investment.model';
@Component({
  selector: 'app-invest-list',
  templateUrl: './invest-list.component.html',
  styleUrls: ['./invest-list.component.css']
})
export class InvestListComponent implements OnInit {
 namePassed = '';
 typePassed = '';
 valuePassed = 0;
 investments:Investment[] = [
   new Investment('ICICI','MF',25000,true,'Montly',5000.50,0,2500,0,'Active'),
    new Investment('ICICI','MF',25000,true,'Montly',5000.50,0,2500,0,'Active')
 ];
servElements = [];
  constructor() { }

  ngOnInit() {
  }
/*onUpdateInputField(event:Event){
  this.name = (<HTMLInputElement>event.target).value;;
}*/
onTestClick(testInput){
  this.servElements.push({name:testInput.value});
}
  onAddClick(){
    console.log(this.namePassed);
    this.investments.push({
      name:this.namePassed,
      type:this.typePassed,
      value:this.valuePassed,
      recursive:true,
    recursiveFreq:'Monthly',
    realizedProfit:121,
    realizedLoss:121,
    actualProfit:1,
    actualLoss:1,
    investmentCurrentStatus:'Active'
    });
  }
}
