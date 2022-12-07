import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class JwtAuthService {

  constructor(private http: HttpClient) { }

  public authenticate(request: any){
    console.log(request);
    return this.http.post("http://localhost:8080/api/login",request,{responseType:'text' as 'json'})
  }
}
