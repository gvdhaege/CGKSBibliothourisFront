import { Component, OnInit} from '@angular/core';

import { User } from '../user/User.class'
import { BackendService } from '../backend/backend.service'
import { registerUser} from '../user/RegisterUser.class'

@Component({
    selector: 'registerUser',
    templateUrl: './registerUser.component.html'
})
export class registerUser implements OnInit {

    users: Array<User> = [];
    user =  new User(4 , "", "", "", "", "", "" );
    submitted = false;

    constructor(private backendService: BackendService) { }

    ngOnInit() {
       
    }

    onSubmit() { this.submitted = true;}

    addUser(){
        this.backendService
        .addUser(this.user)
        .subscribe()
    }
}