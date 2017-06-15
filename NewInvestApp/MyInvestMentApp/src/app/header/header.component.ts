import {Component,EventEmitter,Output} from "@angular/core";

@Component({
    selector:"app-header",
    templateUrl: "./header.component.html"
})
export class HeaderComponent{
    headerName : string = "Personal Finance Information System";
    //Lets emit a custom event on selection of header links on select of invesment or banks
    @Output() featureSelected = new EventEmitter<string>();
    //To make this event listenable form outside component or parent comp.
    onSelect(feature:string){
        console.log("feature --> "+feature);
        this.featureSelected.emit(feature);
    }
}