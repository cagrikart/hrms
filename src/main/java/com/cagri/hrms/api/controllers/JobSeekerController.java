package com.cagri.hrms.api.controllers;

import com.cagri.hrms.business.abstracts.JobSeekerService;
import com.cagri.hrms.core.utilities.results.DataResult;
import com.cagri.hrms.core.utilities.results.Result;
import com.cagri.hrms.entities.concretes.JobSeeker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobseeker")
public class JobSeekerController {
    private JobSeekerService jobSeekerService;

    @Autowired
    public JobSeekerController(JobSeekerService jobSeekerService) {
        this.jobSeekerService = jobSeekerService;
    }

    @GetMapping("getall")
    public DataResult<List<JobSeeker>> getAll() {
        return this.jobSeekerService.getAll();
    }

    @PostMapping("/add")
    public Result add (@RequestBody JobSeeker jobSeeker){
        return this.jobSeekerService.add(jobSeeker);
    }
}
