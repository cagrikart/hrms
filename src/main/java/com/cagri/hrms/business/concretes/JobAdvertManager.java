package com.cagri.hrms.business.concretes;

import com.cagri.hrms.business.abstracts.JobAdvertService;
import com.cagri.hrms.core.utilities.results.DataResult;
import com.cagri.hrms.core.utilities.results.Result;
import com.cagri.hrms.core.utilities.results.SuccesDataResults;
import com.cagri.hrms.core.utilities.results.SuccesResult;
import com.cagri.hrms.dataAccess.abstracts.JobAdvertDao;
import com.cagri.hrms.entities.concretes.Employer;
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
    public DataResult<List<JobAdvert>> getAll() {
        return new SuccesDataResults<List<JobAdvert>>(this.jobAdvertDao.findAll(),"JobAdvert Listelendi");
    }

    @Override
    public Result add(JobAdvert jobAdvert) {
        this.jobAdvertDao.save(jobAdvert);
        return new SuccesResult(true,"job advert eklendi");
    }
}
