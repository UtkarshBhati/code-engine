import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { InvestComponent } from './investments/invest-item/invest.component';
import { BanksComponent } from './banking/banks/banks.component';
import { InvestListComponent } from './investments/investmentList/invest-list.component';
@NgModule({
  declarations: [
    AppComponent,HeaderComponent, InvestComponent, BanksComponent, InvestListComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
