import { Component, OnInit} from '@angular/core';

import { User } from './User.class'
import { BackendService } from '../backend/backend.service'


@Component({
    selector: 'users',
    templateUrl: './users.component.html'
})
export class Users implements OnInit {

    users: Array<User> = [];
    user =  new User(4 , "", "", "", "", "", "" );

    constructor(private backendService: BackendService) { }

    ngOnInit() {
        this.backendService.getUsers()
            .subscribe(users => {
                this.users = users;
            });
    }

    
}