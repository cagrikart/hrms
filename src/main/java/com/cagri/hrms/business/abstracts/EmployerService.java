package com.cagri.hrms.business.abstracts;

import com.cagri.hrms.entities.concretes.Employer;

import java.util.List;

public interface EmployerService {
    List<Employer> getAll();
}
