package com.cagri.hrms.business.abstracts;

import com.cagri.hrms.core.utilities.results.DataResult;
import com.cagri.hrms.core.utilities.results.Result;
import com.cagri.hrms.entities.concretes.Employers;

import java.util.List;

public interface EmployerService {
    DataResult<List<Employers>> getAll();
    Result add(Employers employer);
}
