import { Routes, RouterModule } from '@angular/router';
import { AuthGuard } from './app.guard';
import {Users} from './user/users.component';

const appRoutes: Routes = [
    { path: '', component: Users },
    { path: '/user/overview', component: Users },

];



export const routing = RouterModule.forRoot(appRoutes);