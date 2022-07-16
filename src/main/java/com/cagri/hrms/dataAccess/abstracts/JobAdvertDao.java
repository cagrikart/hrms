package com.cagri.hrms.dataAccess.abstracts;

import com.cagri.hrms.entities.concretes.JobAdvert;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JobAdvertDao extends JpaRepository<JobAdvert,Integer> {
}
