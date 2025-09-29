package com.jobapp.CompanyMs.repository;

import com.jobapp.CompanyMs.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CompanyRepository extends JpaRepository<Company, Long> {
}