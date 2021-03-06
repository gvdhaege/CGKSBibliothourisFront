import { BrowserModule } from '@angular/platform-browser';
import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { RouterModule, Routes } from '@angular/router';
import { Users} from './user/users.component';
import { Books} from './book/books.component';
import { Librarian} from './librarian/librarian.component';
import { AuthGuard } from './app.guard';
import { registerUser } from './registerUser/registerUser.component'
import {appRoutes} from './app.routing'
import 'hammerjs';

import { AppComponent } from './app.component';
//import { routing } from './app.routing';
import { BackendModule } from './backend/backend.module';
import { from } from 'rxjs/observable/from';
import { InfoBooksComponent } from './info-books/info-books.component';

// const appRoutes: Routes = [
//     { path: 'users', component: Users },                     DEZE SHIT UNCOMMENTEN MAAKT ALLES KAPOT DUS DELETE PLS TENZIJ GE HET KUNT DOEN WERKEN
//     { path: 'books', component: Books },
//     { path: 'librarian', component: Librarian},
// ];

@NgModule({
  declarations: [
    AppComponent,
    Users,
    Books,
    Librarian,
    registerUser,
    InfoBooksComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    BrowserAnimationsModule,
    BackendModule,
    RouterModule.forRoot(appRoutes),
    
  ],
  providers: [
    RouterModule,
    AuthGuard
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
