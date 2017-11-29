import { Component, OnInit } from '@angular/core';
import { Input } from '@angular/core/src/metadata/directives';
import { Title } from '@angular/platform-browser/src/browser/title';
import { BackendModule } from '../backend/backend.module';
import { Book } from '../book/Book.class';

@Component({
  selector: 'app-info-books',
  templateUrl: './info-books.component.html',
  styleUrls: ['./info-books.component.css']

})

export class InfoBooksComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

}
