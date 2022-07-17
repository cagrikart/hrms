package com.cagri.hrms.business.abstracts;

import com.cagri.hrms.core.utilities.results.DataResult;
import com.cagri.hrms.core.utilities.results.Result;
import com.cagri.hrms.entities.concretes.JobSeeker;

import java.util.List;

public interface JobSeekerService {
    DataResult<List<JobSeeker>> getAll();
    Result add(JobSeeker jobSeeker);

}
