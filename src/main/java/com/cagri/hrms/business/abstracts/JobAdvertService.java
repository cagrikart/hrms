package com.cagri.hrms.business.abstracts;

import com.cagri.hrms.entities.concretes.JobAdvert;

import java.util.List;

public interface JobAdvertService {
    List<JobAdvert> getAll();
}
