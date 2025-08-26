import { Routes } from '@angular/router';
import { HomePage } from './home-page/home-page';
import { Login } from './login/login';
import { Register } from './register/register';
import { Contact } from './contact/contact';
import { Salle } from './salle/salle';
import { Home } from './home/home';

export const routes: Routes = [
    { path: ' ' ,component:HomePage, title:'Home-page'},
    { path: 'login' ,component:Login, title:'Login'},
    { path: 'register' ,component:Register, title:'Register'},
    { path: 'contact' ,component:Contact, title:'Contact'},
     { path: 'salle' ,component:Salle, title:'Salle'},
    { path: 'home' ,component:Home, title:'Home1'}
];


