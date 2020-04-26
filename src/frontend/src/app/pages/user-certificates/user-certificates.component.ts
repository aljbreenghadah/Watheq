import { Component, OnInit } from '@angular/core';

import { Certification } from '../../models/certification.model';
import { CertificationService } from '../../services/certifications.service';

@Component({
  selector: 'app-user-certificates',
  templateUrl: './user-certificates.component.html',
  styleUrls: ['./user-certificates.component.scss']
})
export class UserCertificatesComponent implements OnInit {
  nationalId: String = '';
  resultsNationalId: String = '';
  certifications: Certification[] = [];

  message: String = '';
  isLoading: boolean = false;

  constructor(private certificationService: CertificationService) {}

  ngOnInit(): void {}

  findCertifications(): void {
    if (!this.nationalId) {
      this.message = 'Please enter your national ID';
      return;
    }

    this.message = '';
    this.certifications = [];
    this.isLoading = true;

    this.certificationService.fetchUserCertificates(this.nationalId)
    .subscribe(
      data => {
        this.isLoading = false;

        if (!data || !data.length) {
          this.message = `We did not find any certifications for ${this.nationalId}!`;
        }

        this.resultsNationalId = this.nationalId;
        this.certifications = data;
      },
      error => {
        this.isLoading = false;
        this.message = 'An error occurred while finding your certifications!';
      }
    );
  }

}
