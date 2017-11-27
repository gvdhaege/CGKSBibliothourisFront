export class Book{
        id : number;
        title : string;
        authorFirstName : string;
        authorLastName : string;
        isbn : string;

        constructor(id : number, title : string, authorFirstName : string, authorLastName : string, isbn : string){
        this.id = id;
        this.title = title;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
        this.isbn = isbn;
        }
}