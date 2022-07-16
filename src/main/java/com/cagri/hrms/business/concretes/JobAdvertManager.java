package com.cagri.hrms.business.concretes;

import com.cagri.hrms.business.abstracts.JobAdvertService;
import com.cagri.hrms.dataAccess.abstracts.JobAdvertDao;
import com.cagri.hrms.entities.concretes.JobAdvert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobAdvertManager implements JobAdvertService {
    private JobAdvertDao  jobAdvertDao;

    @Autowired
    public JobAdvertManager(JobAdvertDao jobAdvertDao) {
        this.jobAdvertDao = jobAdvertDao;
    }

    @Override
    public List<JobAdvert> getAll() {
        return this.jobAdvertDao.findAll();
    }
}
