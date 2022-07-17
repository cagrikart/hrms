package com.cagri.hrms.business.abstracts;

import com.cagri.hrms.core.utilities.results.DataResult;
import com.cagri.hrms.core.utilities.results.Result;
import com.cagri.hrms.entities.concretes.JobAdverts;

import java.util.List;

public interface JobAdvertService {
    DataResult<List<JobAdverts>> getAll();
    Result add(JobAdverts jobAdvert);

}
