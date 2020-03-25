import {Component, OnInit} from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {environment} from "../environments/environment";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.less']
})
export class AppComponent implements OnInit{

  optionRequete = {
    headers: new HttpHeaders({
      // 'Access-Control-Allow-Origin':'*',
      // 'Access-Control-Allow-Methods':'*',
      // 'Access-Control-Allow-Headers': 'content-type',
    })
  };

  constructor(private http: HttpClient) { }

  title = 'demo-front';

  description;

  ngOnInit(): void {
    this.http.get(environment.base_url+"greeting", this.optionRequete).subscribe((x)=> {
      this.description = x
    })
  }
}
