import { Component, OnInit } from '@angular/core';

import { CertificationService } from '../../services/certifications.service';
import { EducationService } from '../../services/education.service';

import { Education } from 'src/app/models/education.model';
import { Certification } from '../../models/certification.model';

@Component({
  selector: 'app-add-certificate',
  templateUrl: './add-certificate.component.html',
  styleUrls: ['./add-certificate.component.scss']
})
export class AddCertificateComponent implements OnInit {
  education: Education = new Education();
  certification: Certification = new Certification();

  message: String = '';
  isLoading: boolean = false;
  isCreated: boolean = false;
  isLoggedIn: boolean = false;

  constructor(private educationService: EducationService, private certificationService: CertificationService) {}

  ngOnInit(): void {}

  loginEducation(): void {
    if (!this.education.email) {
      this.message = 'Please enter your email';
      return;
    } else if (!this.education.password) {
      this.message = 'Please enter your password';
      return;
    }

    this.message = '';
    this.isLoggedIn = false;
    this.isLoading = true;
    this.isCreated = false;

    this.educationService.login(this.education.email, this.education.password)
    .subscribe(
      (json: any) => {
        this.isLoading = false;

        if (!json || !json.name || json.error) {
          this.message = json.error || 'An unknown error occurred';
          return;
        }

        this.isLoggedIn = true;

        this.education.id = json.id;
        this.education.name = json.name;
      },
      error => {
        this.isLoading = false;
        this.message = 'An error occurred while logging in!';
      }
    );
  }

  addCertification() : void {
    this.message = '';
    this.isLoading = true;

    this.certificationService.create(this.certification, this.education)
    .subscribe(
      (json: any) => {
        this.isLoading = false;

        if (!json || !json.success || json.error) {
          this.message = json.error || 'An unknown error occurred';
          return;
        }

        this.isCreated = true;
      },
      error => {
        this.isLoading = false;
        this.message = 'An error occurred while creating the certification!';
      }
    );
  }

}
