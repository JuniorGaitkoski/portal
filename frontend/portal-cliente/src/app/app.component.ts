import { Component, OnInit } from '@angular/core';
import { Route, Router, RouterLink, RouterLinkActive, RouterModule, RouterOutlet } from '@angular/router';
import { CategoriaService } from './service/categoria.service';
import { lastValueFrom, map } from 'rxjs';
import { NgFor, NgIf } from '@angular/common';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, RouterModule, RouterLink, RouterLinkActive, NgFor, NgIf],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent  implements OnInit{
  
  title = 'portal_cliente';

  categoria$: any;

  constructor(private categoriaService: CategoriaService, private router: Router){

  }

  ngOnInit(): void {    
    this.getCategorias();
  }
  
  public async getCategorias(){
    this.categoria$ = await lastValueFrom(this.categoriaService.getDestaques());
  }

  public abrirCategoria(id: any){
    this.router.navigate(['noticias/', id]);
  }
}
