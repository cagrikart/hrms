package com.cagri.hrms.api.controllers;

import com.cagri.hrms.business.abstracts.JobAdvertService;
import com.cagri.hrms.core.utilities.results.DataResult;
import com.cagri.hrms.core.utilities.results.Result;
import com.cagri.hrms.core.utilities.results.SuccesDataResults;
import com.cagri.hrms.entities.concretes.JobAdvert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jobadvert")
public class JobAdvertController {
    private JobAdvertService jobAdvertService;

    @Autowired
    public JobAdvertController(JobAdvertService jobAdvertService) {
        this.jobAdvertService = jobAdvertService;
    }

    @GetMapping("/getall")
    public DataResult<List<JobAdvert>> getAll() {
      return this.jobAdvertService.getAll();
    }
    @PostMapping("/add")
    public Result add(@RequestBody JobAdvert jobAdvert) {
        return this.jobAdvertService.add(jobAdvert);
    }
}
