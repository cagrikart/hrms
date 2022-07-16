package com.cagri.hrms.business.abstracts;

import com.cagri.hrms.core.utilities.results.DataResult;
import com.cagri.hrms.core.utilities.results.Result;
import com.cagri.hrms.entities.concretes.Employer;
import com.cagri.hrms.entities.concretes.JobAdvert;

import java.util.List;

public interface JobAdvertService {
    DataResult<List<JobAdvert>> getAll();
    Result add(JobAdvert jobAdvert);

}
