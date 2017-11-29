import { Component, OnInit} from '@angular/core';

import { Book } from './Book.class'
import { BackendService } from '../backend/backend.service'
import { Console } from '@angular/core/src/console';
import { OnChanges } from '@angular/core';


@Component({
    selector: 'books',
    templateUrl: './books.component.html'
})
export class Books implements OnInit {

    selectedBook: Book;
    books: Array<Book> = [];

    constructor(private backendService: BackendService) { }

    ngOnInit() {
        this.backendService.getBooks()
            .subscribe(books => {
                this.books = books;
            });
    }

    searchString: string = '';
    searchType: string = '';

    filterBooksBySearch(searchString: string, searchType: string) {

        if (searchType === "isbn") {
            return this.backendService.filterBooksByISBN(searchString)
                .subscribe(books => this.books = books);
        }

        if (searchType === "title") {
            return this.backendService.filterBooksByTitle(searchString)
                .subscribe(books => this.books = books);
        }

        if (searchType === "name") {
            return this.backendService.filterBooksByName(searchString)
                .subscribe(books => this.books = books);
        }
    }

    selectBookDetails(book: Book){
        this.selectedBook = book;
    }

    deselectBookDetails(){
        this.selectedBook = null;
    }

}







