import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms'

@Component({
  selector: 'app-signup-form',
  templateUrl: '../src/app/signup-form/signup-form.component.html',
  styleUrls: ['../src/app/signup-form/signup-form.component.css']
})
export class SignupFormComponent implements OnInit {

  contactForm = new FormGroup({
    firstname: new FormControl(),
    lastname: new FormControl(),
    email: new FormControl()
  })

  onSubmit() {
    console.log(this.contactForm.value);
  }

  constructor() { }

  ngOnInit(): void {
  }

}
