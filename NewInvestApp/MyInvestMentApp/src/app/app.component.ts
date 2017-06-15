import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent {
  title = 'Root Component of the New Investment App Works !';
  displayedFeature = '';
  //Catching the event emitted from header comp on click of investment or banks
  displaySelected(selection:string){
    this.displayedFeature = selection;
  }
}
