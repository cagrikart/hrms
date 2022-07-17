package com.cagri.hrms.business.concretes;

import com.cagri.hrms.business.abstracts.EmployerService;
import com.cagri.hrms.core.utilities.results.DataResult;
import com.cagri.hrms.core.utilities.results.Result;
import com.cagri.hrms.core.utilities.results.SuccesDataResults;
import com.cagri.hrms.core.utilities.results.SuccesResult;
import com.cagri.hrms.dataAccess.abstracts.EmployerDao;
import com.cagri.hrms.entities.concretes.Employers;
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
    public DataResult<List<Employers>> getAll() {
        return  new SuccesDataResults<List<Employers>>(this.employerDao.findAll(),"Listelendi.");
    }

    @Override
    public Result add(Employers employer) {
        this.employerDao.save(employer);
        return new SuccesResult(true,"ürün eklendi");
    }
}
