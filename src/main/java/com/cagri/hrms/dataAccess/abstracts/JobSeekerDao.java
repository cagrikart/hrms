package com.cagri.hrms.dataAccess.abstracts;

import com.cagri.hrms.entities.concretes.JobSeeker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobSeekerDao extends JpaRepository<JobSeeker,Integer> {
}
