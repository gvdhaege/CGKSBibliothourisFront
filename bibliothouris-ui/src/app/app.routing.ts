import { Routes, RouterModule } from '@angular/router';
import { AuthGuard } from './app.guard';
import {Users} from './user/users.component';
import {Books} from './book/books.component';
import {Librarian} from './librarian/librarian.component';
import {registerUser} from './registerUser/registerUser.component';

export const appRoutes: Routes = [
    { path: 'users', component: Users },
    { path: 'books', component: Books },
    { path: 'librarian', component: Librarian},
    { path: 'addUser', component: registerUser}
];



//export const routing = RouterModule.forRoot(appRoutes);
