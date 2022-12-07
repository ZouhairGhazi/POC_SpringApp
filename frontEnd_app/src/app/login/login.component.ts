import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormControl, FormGroup, Validators} from '@angular/forms';
import { first } from 'rxjs/operators';
import { Router, ActivatedRoute } from '@angular/router';
import {validateAndRewriteCoreSymbol} from "@angular/compiler-cli/src/ngtsc/imports";
// @ts-ignore
import { AccountService, AlertService } from '@app/_services';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  contactForm = new FormGroup(
    {
      email: new FormControl(),
      password: new FormControl()
    }
  )



  constructor(
  ) { }


  ngOnInit(): void {

  }

  onSubmit(){
    console.log(this.contactForm.value)
    }







  }
