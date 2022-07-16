package com.cagri.hrms.business.concretes;

import com.cagri.hrms.business.abstracts.JobSeekerService;
import com.cagri.hrms.dataAccess.abstracts.JobSeekerDao;
import com.cagri.hrms.entities.concretes.JobSeeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobSeekerManager  implements JobSeekerService {
    private JobSeekerDao jobSeekerDao;

    @Autowired
    public JobSeekerManager(JobSeekerDao jobSeekerDao) {
        this.jobSeekerDao = jobSeekerDao;
    }

    @Override
    public List<JobSeeker> getAll() {
        return jobSeekerDao.findAll();
    }
}
