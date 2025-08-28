import { Component } from '@angular/core';
import { AppComponent } from "../app.component";
import { CommonModule,} from '@angular/common';
import { MatInputModule} from '@angular/material/input';
import { MatFormFieldModule} from '@angular/material/form-field';
import { FormControl, FormGroup, FormsModule, ReactiveFormsModule, Validators } from '@angular/forms';
import { MatButtonModule } from '@angular/material/button';
import { MatRadioModule } from '@angular/material/radio';
import {bootstrapApplication} from '@angular/platform-browser';

@Component({
  selector: 'app-auth',
  standalone: true,
  imports: [
    CommonModule,
    MatInputModule,
    MatFormFieldModule,
    MatButtonModule,
    FormsModule,  
  ],
  templateUrl: './auth.component.html',
  styleUrl: './auth.component.css'
})
export class AuthComponent {
  isRegister=true;
 
  registerationForm=new FormGroup({
    fullName:new FormControl("",[Validators.required]),
    email:new FormControl("",[Validators.required,Validators.email]),
    password:new FormControl("",[Validators.required,Validators.minLength(0),]),
  });
  loginForm=new FormGroup({
    email:new FormControl("",[Validators.required,Validators.email]),
    password:new FormControl("",[Validators.required]),
  });

  handleRegister(){
    console.log("register" ,this.registerationForm.value)
  }
   handleLogin(){
    console.log("login" ,this.loginForm.value)
   }

}
