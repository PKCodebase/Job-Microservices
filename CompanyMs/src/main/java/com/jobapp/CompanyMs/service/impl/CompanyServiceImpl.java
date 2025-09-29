package com.jobapp.CompanyMs.service.impl;

import com.jobapp.CompanyMs.entity.Company;
import com.jobapp.CompanyMs.repository.CompanyRepository;
import com.jobapp.CompanyMs.service.CompanyService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyServiceImpl implements CompanyService {

    private final CompanyRepository companyRepository;

    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    @Override
    public boolean updateCompany(Long id, Company company) {
        Optional<Company> companyOptional = companyRepository.findById(id);
        if(companyOptional.isPresent()){
            Company updatedCompany = companyOptional.get();

            if (company.getName() != null) {
                updatedCompany.setName(company.getName());
            }
            if (company.getDescription() != null) {
                updatedCompany.setDescription(company.getDescription());
            }

            companyRepository.save(updatedCompany);  // save changes
            return true;
        } else {
            return false;
        }
    }


    @Override
    public void createCompany(Company company) {
      companyRepository.save(company);
    }

    @Override
    public boolean deleteCompany(Long id) {
        if(companyRepository.existsById(id)){
            companyRepository.deleteById(id);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Company getCompanyById(Long id) {
        return companyRepository.findById(id).orElse(null);
    }
}
