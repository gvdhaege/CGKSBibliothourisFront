export class AddBook {

  title: string;
  authorFirstName: string;
  authorLastName: string;
  isbn: string;

  constructor(
    title: string,
    authorFirstName: string,
    authorLastName: string,
    isbn: string
  ) {
    this.title = title;
    this.authorFirstName = authorFirstName;
    this.authorLastName = authorLastName;
    this.isbn = isbn;
  }

}