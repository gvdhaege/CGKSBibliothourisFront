import { Component, OnInit} from '@angular/core';

import { Book } from './Book.class'
import { BackendService } from '../backend/backend.service'


@Component({
    selector: 'books',
    templateUrl: './books.component.html'
})
export class Books implements OnInit {

    books: Array<Book> = [];

    constructor(private backendService: BackendService) { }

    ngOnInit() {
        this.backendService.getBooks()
            .subscribe(books => {
                this.books = books;
            });
    }

}
