import {    Injectable} from '@angular/core';
import { HttpClient, HttpHeaders, HttpResponse} from '@angular/common/http';
import 'rxjs/add/operator/map';
import { Observable} from 'rxjs';
import { environment} from '../../environments/environment'
import {    User} from '../user/User.class'
import {    Book} from '../book/Book.class'
import {    AddBook} from '../book/AddBook.class'
import {    RegisterUser} from '../user/registerUser.class'

@Injectable()
export class BackendService {

    constructor(private http: HttpClient) {}

    getUsers(): Observable < Array < User >> {
        let header = new HttpHeaders({
            'Accept': 'application/json',
            'Authorization': 'Basic ' + btoa('Test Admin:password')
        });

        return this.http.get < Array < User >> (`${environment.baseUrl}/user`, {
            headers: header
        });
    }

    getBooks(): Observable < Array < Book >> {
        let header = new HttpHeaders({
            'Accept': 'application/json',
            'Authorization': 'Basic ' + btoa('Test User:password')
        });

        return this.http.get < Array < Book >> (`${environment.baseUrl}/user/allBooks`, {
            headers: header
        });
    }

    addBook(addBook: AddBook): Observable < any > {
        let header = new HttpHeaders({
            'Authorization': 'Basic ' + btoa('Test Librarian:password')
        });
        return this.http
            .post(`${environment.baseUrl}/user/addBook`, addBook, {
                headers: header
            });
    }
    addUser(registerUser: RegisterUser): Observable < any > {
        let header = new HttpHeaders({});
        return this.http
            .post(`${environment.baseUrl}/user/addUser`, registerUser, {
                headers: header
            });
    }

    filterBooksByISBN(search: string): Observable < Array < Book >> {
        let searchString: string = search;
        let header = new HttpHeaders({
            'Accept': 'application/json',
            'Authorization': 'Basic ' + btoa('Test User:password')
        });

        return this.http.get < Array < Book >> (`${environment.baseUrl}/user/searchByISBN?isbn=${searchString}`, {
            headers: header
        });
    }

    filterBooksByTitle(search: string): Observable < Array < Book >> {
        let searchString: string = search;
        let header = new HttpHeaders({
            'Accept': 'application/json',
            'Authorization': 'Basic ' + btoa('Test User:password')
        });

        return this.http.get < Array < Book >> (`${environment.baseUrl}/user/searchByTitle?title=${searchString}`, {
            headers: header
        });
    }

    filterBooksByName(search: string): Observable < Array < Book >> {
        let searchString: string = search;
        let header = new HttpHeaders({
            'Accept': 'application/json',
            'Authorization': 'Basic ' + btoa('Test User:password')
        });

        return this.http.get < Array < Book >> (`${environment.baseUrl}/user/searchByName?name=${searchString}`, {
            headers: header
        });
    }
}