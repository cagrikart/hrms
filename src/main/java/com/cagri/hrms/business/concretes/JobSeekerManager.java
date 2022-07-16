package com.cagri.hrms.business.concretes;

import com.cagri.hrms.business.abstracts.JobSeekerService;
import com.cagri.hrms.core.utilities.results.DataResult;
import com.cagri.hrms.core.utilities.results.Result;
import com.cagri.hrms.core.utilities.results.SuccesDataResults;
import com.cagri.hrms.core.utilities.results.SuccesResult;
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
    public DataResult<List<JobSeeker>> getAll() {
        return new SuccesDataResults<List<JobSeeker>>(this.jobSeekerDao.findAll(),"JobSeeker Listelendi");
    }
    public Result add (JobSeeker jobSeeker){
        this.jobSeekerDao.save(jobSeeker);
        return new SuccesResult(true,"Jobseeker eklendi");

    }
}
