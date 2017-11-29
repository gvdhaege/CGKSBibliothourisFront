import { Component, OnInit } from '@angular/core';

import { BackendService } from '../backend/backend.service';
import { AddBook } from '../book/AddBook.class';

@Component({
    selector: 'librarian',
    templateUrl: './librarian.component.html'
})

export class Librarian {


    constructor(private backendService: BackendService) { }

    book = new AddBook("", "", "", "");

    submitted = false;

    onSubmit() {
        this.submitted = true;
    }

    addBook() {
        this.backendService
            .addBook(this.book)
            .subscribe()
    }

}