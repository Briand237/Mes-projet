import { Component } from '@angular/core';
import { Navbar } from "../navbar/navbar";
import { HeroSalle } from "../hero-salle/hero-salle";

@Component({
  selector: 'app-home',
  imports: [Navbar, HeroSalle],
  templateUrl: './home.html',
  styleUrl: './home.css'
})
export class Home {

}
