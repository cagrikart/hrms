package com.cagri.hrms.business.concretes;

import com.cagri.hrms.business.abstracts.EmployerService;
import com.cagri.hrms.dataAccess.abstracts.EmployerDao;
import com.cagri.hrms.entities.concretes.Employer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployerManager implements EmployerService {
    private EmployerDao employerDao;

    @Autowired
    public EmployerManager(EmployerDao employerDao) {
        this.employerDao = employerDao;
    }

    @Override
    public List<Employer> getAll() {
        return employerDao.findAll();
    }
}
