import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {LoginComponent} from "./login/login.component";
import {SignupFormComponent} from "../../.angular/signup-form.component";

const routes: Routes = [
  { path: 'login', component: LoginComponent },
  { path: 'register', component: SignupFormComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
