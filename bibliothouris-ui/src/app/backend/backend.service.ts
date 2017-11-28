import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders,HttpResponse} from '@angular/common/http';
import 'rxjs/add/operator/map';
import { Observable } from 'rxjs';
import { environment } from '../../environments/environment'
import {User} from '../user/User.class'
import {Book} from '../book/Book.class'

@Injectable()
export class BackendService {

    constructor(private http: HttpClient) { }

    getUsers(): Observable<Array<User>> {
        let header = new HttpHeaders({ 'Accept': 'application/json',
            'Authorization' : 'Basic ' + btoa('seppe:password')
        });

        return this.http.get<Array<User>>(`${environment.baseUrl}/user` , { headers: header });
    }

    getBooks(): Observable<Array<Book>> {
        let header = new HttpHeaders({ 'Accept': 'application/json',
            'Authorization' : 'Basic ' + btoa('seppe:password')
        });

        return this.http.get<Array<Book>>(`${environment.baseUrl}/user/allBooks` , { headers: header });
    }

    filterBooksByISBN(search:string): Observable<Array<Book>> {
    let searchString:string = search;
    let header = new HttpHeaders({ 'Accept': 'application/json',
                'Authorization' : 'Basic ' + btoa('seppe:password')
            });

           return this.http.get<Array<Book>>(`${environment.baseUrl}/user/searchByISBN?search=${searchString}` , { headers: header});
    }

     filterBooksByTitle(search:string): Observable<Array<Book>> {
        let searchString:string = search;
        let header = new HttpHeaders({ 'Accept': 'application/json',
                    'Authorization' : 'Basic ' + btoa('seppe:password')
                });

               return this.http.get<Array<Book>>(`${environment.baseUrl}/user/searchByTitle?search=${searchString}` , { headers: header});
        }

        filterBooksByName(search:string): Observable<Array<Book>> {
                let searchString:string = search;
                let header = new HttpHeaders({ 'Accept': 'application/json',
                            'Authorization' : 'Basic ' + btoa('seppe:password')
                        });

                       return this.http.get<Array<Book>>(`${environment.baseUrl}/user/searchByName?search=${searchString}` , { headers: header});
                }
}
