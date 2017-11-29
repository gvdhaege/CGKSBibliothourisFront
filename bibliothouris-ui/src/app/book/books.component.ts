import { Component, OnInit } from '@angular/core';

import { Book } from './Book.class'
import { BackendService } from '../backend/backend.service'
import { OnChanges } from '@angular/core';


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

    searchString: string = '';
    // searchType: string = '';

    filterBooksBySearch(searchString: string){ //, searchType: string) {

        // if (searchType === "isbn") {
            return this.backendService.filterBooksByISBN(searchString)
                .subscribe(books => this.books = books);
        // }

        // if (searchType === "title") {
        //     return this.backendService.filterBooksByTitle(search)
        //         .subscribe(books => this.books = books);
        // }

        // if (searchType === "name") {
        //     return this.backendService.filterBooksByName(search)
        //         .subscribe(books => this.books = books);
        // }
    }
}