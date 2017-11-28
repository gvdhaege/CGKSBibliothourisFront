import { Component, OnInit} from '@angular/core';

import { BackendService } from '../backend/backend.service';
import { addBook } from '../book/addbook';

@Component({
    selector: 'librarian',
    templateUrl: './librarian.component.html'
})

export class Librarian {

    private title: string;
    private authorFirstName: string;
    private authorLastName: string;
    private isbn: string;

    constructor(private backendService: BackendService) { }

    book = new addBook(this.title,this.authorFirstName,this.authorLastName, this.isbn);

    submitted = false;

     onSubmit() { this.submitted = true;}

}