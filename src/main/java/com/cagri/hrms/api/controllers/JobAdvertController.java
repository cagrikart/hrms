package com.cagri.hrms.api.controllers;

import com.cagri.hrms.business.abstracts.JobAdvertService;
import com.cagri.hrms.entities.concretes.JobAdvert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public List<JobAdvert> getAll(){
        return this.jobAdvertService.getAll();
    }
}
