import { Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { CategoriaComponent } from './categoria/categoria.component';
import { NoticiaComponent } from './noticia/noticia.component';
import { CategoriaFormComponent } from './categoria/categoria-form/categoria-form.components';
import { NoticiaFormComponent } from './noticia/noticia-from/noticia-from.component';

export const routes: Routes = [
    {path: 'home', component: HomeComponent},
    {path: '', component: HomeComponent},
    {path: 'categoria', component: CategoriaComponent},
    {path: 'categoria/novo', component: CategoriaFormComponent},
    {path: 'categoria/editar/:id', component: CategoriaFormComponent},
    {path: 'noticia', component: NoticiaComponent},
    {path: 'noticia/novo', component: NoticiaFormComponent},
    {path: 'noticia/editar/:id', component: NoticiaFormComponent}
];
