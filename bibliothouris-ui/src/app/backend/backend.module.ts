import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { BackendService } from './backend.service' 


@NgModule({
    imports: [
        CommonModule,
    ],
    providers: [
        BackendService,
    ],
})
export class BackendModule { }