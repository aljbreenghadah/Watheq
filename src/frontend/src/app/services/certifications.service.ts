import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Education } from '../models/education.model';
import { Certification } from '../models/certification.model';

@Injectable({
  providedIn: 'root'
})
export class CertificationService {
  private baseUrl = 'http://localhost:8080/api/certifications';

  constructor(private http: HttpClient) {}

  public fetchUserCertificates(nationalId: String) {
    return this.http.get<Certification[]>(`${this.baseUrl}/users/${nationalId}`);
  }

  public create(certification: Certification, education: Education) {
    const data = {
      nationalId: certification.nationalId,
      gpa: certification.gpa,
      major: certification.major,
      degree: certification.degree,
      startDate: certification.startDate,
      endDate: certification.endDate,
      educationId: education.id,
    };

    const options = { headers: new HttpHeaders().set('Content-Type', 'application/json') };

    return this.http.post(`${this.baseUrl}/create`, data, options);
  }
}
