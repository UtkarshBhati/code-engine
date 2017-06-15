export class Investment{
    name:string;
    type:string;
    value:number;
    recursive:boolean;
    recursiveFreq:string;
   /* recursiveQuarterly:boolean;
    recursiveYearly:boolean;
    onetimeOnly:boolean;*/
    realizedProfit:number;
    realizedLoss:number;
    actualProfit:number;
    actualLoss:number;
    investmentCurrentStatus:string;

    constructor(name:string,type:string,value:number,recursive:boolean,recursiveFreq:string,realizedProfit:number,
    realizedLoss:number,actualProfit:number,actualLoss:number,investmentCurrentStatus:string){
        this.name = name;
        this.type = type;
        this.value = value;
        this.recursive = recursive;
        this.recursiveFreq = recursiveFreq;
        this.realizedProfit = realizedProfit;
        this.realizedLoss = realizedLoss;
        this.actualProfit = actualProfit;
        this.actualLoss = actualLoss;
        this.investmentCurrentStatus = investmentCurrentStatus;
    }
}