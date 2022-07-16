package com.cagri.hrms.business.abstracts;

import com.cagri.hrms.entities.concretes.JobSeeker;

import java.util.List;

public interface JobSeekerService {
    List<JobSeeker> getAll();

}
