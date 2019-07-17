package com.tw.apistackbase.api;

import com.tw.apistackbase.core.Company;
import com.tw.apistackbase.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/companies")
public class CompanyResource {
    @Autowired
    private CompanyRepository companyRepository;

    @GetMapping()
    public List<Company> getCompany() {
        return companyRepository.findAll();
    }

    @PostMapping()
    public Company addCompany(@RequestBody Company company) {
        companyRepository.save(company);
        return companyRepository.findById(company.getId()).get();
    }

}
