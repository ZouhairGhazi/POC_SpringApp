import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormControl, FormGroup, Validators} from '@angular/forms';
import { first } from 'rxjs/operators';
import { Router, ActivatedRoute } from '@angular/router';
import {validateAndRewriteCoreSymbol} from "@angular/compiler-cli/src/ngtsc/imports";
// @ts-ignore
import { AccountService, AlertService } from '@app/_services';
import {JwtAuthService} from "../jwt-auth.service";


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {


  username= ''
  password= ''




  constructor(private jwt: JwtAuthService
  ) {
  }


  ngOnInit(): void {

  }

  onSubmit() {
    let request: any = {
      "username" : this.username,
      "password" : this.password
    }
    this.jwt.authenticate(request).subscribe(data => console.log(data))
  }
}
