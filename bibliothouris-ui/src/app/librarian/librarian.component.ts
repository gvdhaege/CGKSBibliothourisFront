import { Component, OnInit} from '@angular/core';

import { BackendService } from '../backend/backend.service';
import { AddBook } from '../book/AddBook.class';

@Component({
    selector: 'librarian',
    templateUrl: './librarian.component.html'
})

export class Librarian {

    private title: string;
    private authorFirstName: string;
    private authorLastName: string;
    private isbn: string;

    // const body = {
    //     title:this.title,
    //     authorFirstName:this.authorFirstName,
    //     authorLastName:this.authorLastName,
    //     isbn:this.isbn
    // };

    // constructor(private backendService: BackendService) { }

    book = new AddBook(this.title,this.authorFirstName,this.authorLastName, this.isbn);


    submitted = false;

     onSubmit() { this.submitted = true;}

}