import { Component } from '@angular/core';
import { Footer } from "../footer/footer";
import { Navbar } from "../navbar/navbar";
import { HeroSalle } from "../hero-salle/hero-salle";

@Component({
  selector: 'app-home-page',
  imports: [Navbar, HeroSalle],
  templateUrl: './home-page.html',
  styleUrl: './home-page.css'
})
export class HomePage {

}
