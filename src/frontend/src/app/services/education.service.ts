import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class EducationService {
  private baseUrl = 'http://localhost:8080/api/educations';

  constructor(private http: HttpClient) {}

  public login(email: String, password: String) {
    const data = { email, password };
    const options = { headers: new HttpHeaders().set('Content-Type', 'application/json') };

    return this.http.post(`${this.baseUrl}/login`, data, options);
  }
}
