import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { RouterModule, Routes } from '@angular/router';
import { Users} from './user/users.component';
import { Books} from './book/books.component';
import { Librarian} from './librarian/librarian.component';
import { AuthGuard } from './app.guard';

import 'hammerjs';

import { AppComponent } from './app.component';
import { routing } from './app.routing';
import { BackendModule } from './backend/backend.module';

@NgModule({
  declarations: [
    AppComponent,
    Users,
    Books,
    Librarian
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    BrowserAnimationsModule,
    routing,
    BackendModule
  ],
  providers: [
    RouterModule,
    AuthGuard
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
